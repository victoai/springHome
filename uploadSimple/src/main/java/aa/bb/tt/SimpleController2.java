package aa.bb.tt;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.UUID;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SimpleController2 {
	
	 private String fileDir ="c:\\test\\upload\\";  // 미리 폴더를 만들어야함
	 
	 
	 @GetMapping("/upload")
	 public String uploadForm() {
		 return "form";
	 }

	
	@PostMapping("/upload")
	public String upload( String  goodsCode   , MultipartFile file , Model model) throws IllegalStateException, IOException {
	    	System.out.println( goodsCode);
		 
	        if (!file.isEmpty()) {  //파일이 비어있지 않으면..
	        	String fileRealName  = file.getOriginalFilename();  // aaa.jpg
	        	String fileExtension = fileRealName.substring(fileRealName.lastIndexOf(".")+1);	       
	            UUID uuid = UUID.randomUUID();
	        	String storedFileName =uuid +"." +fileExtension;  	           
	        	String fullPath = fileDir + storedFileName;
	            System.out.println("파일 저장 fullPath=" + fullPath);            
	            file.transferTo(new File(fullPath)); 
	         
	            model.addAttribute("fileName" ,storedFileName);          
	        }

		return "upload-ok";
		
		
	}
	
	// /images/aaa.jpg      fileName( 경로변수=> aaa.jpg)
	// /images/aaa
	// /images/aaaa.jpeg

	//"/images/{fileName:.*}" 패턴은 일반적으로 웹 애플리케이션에서 URL 경로를 처리하기 위해 사용되는 패턴
	
	@ResponseBody	
	@RequestMapping( value="/images/{fileName:.*}" , method=RequestMethod.GET)
	public Resource imageDownload(@PathVariable String  fileName) throws MalformedURLException {
		
		System.out.println( "fileName" + fileName);
		return new  UrlResource("file:c:\\test\\upload\\"+ fileName);
		//서버의 리소스(자원)을 제공할 때 사용
	}

}
