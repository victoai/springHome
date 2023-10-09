package aa.bb.tt;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
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
 
public class 파일다운로드교수자 {
	
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
	public ResponseEntity<UrlResource> fileDownload(@PathVariable String  fileName) throws MalformedURLException {		
		System.out.println( "fileName" + fileName);
		
		UrlResource  resource=  new  UrlResource("file:c:\\test\\upload\\"+ fileName);
		String encodedUploadFileName  = UriUtils.encode( fileName, StandardCharsets.UTF_8);
		String contentDispositon = "attachment; filename=\""+ encodedUploadFileName + "\"";	 
		return   ResponseEntity.ok().header( HttpHeaders.CONTENT_DISPOSITION, contentDispositon).body(resource);
		//서버의 리소스(자원)을 제공할 때 사용
	}
	
	 @GetMapping(value="/attach2/{fileName:.+}")
	    public void fileDownload(@PathVariable String fileName, HttpServletResponse response) throws IOException {
	        // Construct the file path
	        String filePath = "c:\\test\\upload\\" + fileName;

	        try {
	            // Load the file as bytes
	            byte[] fileBytes = org.apache.commons.io.FileUtils.readFileToByteArray(new java.io.File(filePath));

	            // Encode the filename for HTTP header
	            String encodedFileName = UriUtils.encode(fileName, StandardCharsets.UTF_8.name());

	            // Set the Content-Disposition header to indicate file download
	            String contentDisposition = "attachment; filename=\"" + encodedFileName + "\"";
	            response.setHeader(HttpHeaders.CONTENT_DISPOSITION, contentDisposition);

	            // Set the content type
	           response.setContentType("application/octet-stream");

	            // Set the content length
	            response.setContentLength(fileBytes.length);

	            // Write the file bytes to the response output stream
	            response.getOutputStream().write(fileBytes);
	            response.flushBuffer();
	        } catch (IOException e) {
	            // Handle exceptions, e.g., file not found
	            // You can customize the error response here
	            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	        }
	    }

}
