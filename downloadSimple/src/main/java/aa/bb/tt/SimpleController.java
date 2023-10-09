package aa.bb.tt;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;

@Controller
public class SimpleController {
	
	 private String fileDir ="c:\\test\\upload\\";  // 미리 폴더를 만들어야함
	 
	 
	 @GetMapping("/upload")
	 public String uploadForm() {
		 return "form";
	 }

	
	@PostMapping("/upload")
	public String upload( String  goodsCode   , MultipartFile file , Model model) throws IllegalStateException, IOException {
	    	System.out.println( goodsCode);
		 
	        if (!file.isEmpty()) {  // 빈파일이 아닌경우 (업로드한 파일이 있다면)
	        	
	         	String fileRealName  = file.getOriginalFilename(); 	     // 원본파일이름       
	        	String fullPath = fileDir + fileRealName;                // 전체 경로명 포함한 파일명
	        	file.transferTo(new File(fullPath));                     //upload  (업로드한 파일이 서버에 생성됨)     
	    
	         
	            model.addAttribute("fileName" ,fileRealName);          
	        }

		return "upload-ok";
		
		
	}
 
	
	
	// upload-ok 화면에서 파일명 클릭시  다운로드 
	
	@RequestMapping( value="/attach/{fileName:.*}" , method=RequestMethod.GET)
	public ResponseEntity<UrlResource> fileDownload(@PathVariable String  fileName) throws MalformedURLException, UnsupportedEncodingException {		
		System.out.println( "fileName" + fileName);
		
		UrlResource  resource=  new  UrlResource("file:c:\\test\\upload\\"+ fileName);
		// String encodedUploadFileName  = UriUtils.encode( fileName, StandardCharsets.UTF_8);
		String encodedUploadFileName = URLEncoder.encode(fileName, "UTF-8");
		String contentDispositon = "attachment; filename=\""+ encodedUploadFileName + "\"";	 
		return   ResponseEntity.ok().header( HttpHeaders.CONTENT_DISPOSITION, contentDispositon).body(resource);
		//서버의 리소스(자원)을 제공할 때 사용
	}
	
	 
}
