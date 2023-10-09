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
public class SimpleController3 {	
	 private String fileDir ="C:\\Users\\jooyeon\\Documents\\2023_2\\스프링\\sprintws\\uploadSimple\\src\\main\\webapp\\resources\\imgs\\";  // 미리 폴더를 만들어야함	
	
	 @GetMapping("/upload3")
	 public String uploadForm() {
		 return "form3";
	 }
	 
	 
	 @PostMapping("/upload3")
	public String upload( String  goodsCode   , MultipartFile file , Model model) throws IllegalStateException, IOException {
	    	System.out.println( goodsCode);		 
	        if (!file.isEmpty()) {  //파일이 비어있지 않으면..
	        	String fileRealName  = file.getOriginalFilename(); 	     //원본파일이름       
	        	String fullPath = fileDir + fileRealName;
	        	file.transferTo(new File(fullPath));                     //upload 
	            model.addAttribute("fileName" ,fileRealName);          
	        }
		return "upload-ok3";		
	}		
	 

}
