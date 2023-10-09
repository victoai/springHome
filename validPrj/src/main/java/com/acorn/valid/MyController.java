package com.acorn.valid;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
   
	@InitBinder
	public void toDate( WebDataBinder binder) { 
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd"); 
	 binder.registerCustomEditor( Date.class , new CustomDateEditor( df, false)) ; 	 
	 binder.registerCustomEditor(String[].class, new StringArrayPropertyEditor("#")); 
	 //binder.registerCustomEditor(String[].class, "hobby", new StringArrayPropertyEditor("#"));
	}	  
		
	@GetMapping("/v4")
	public String register() {	
		return "yb";
	}
	
	
	@PostMapping("/v4")
	public String register( User user  , BindingResult result ) {
		  // 1. 데이터변환
		  // 2. 유효성 체크	 
		
		  System.out.print( user);
		  System.out.println( result);
		  
		  String[]  hobbys = user.getHobby();
		  for( String hobby : hobbys)
			  System.out.println( hobby);
		 // 입력폼
		 // 정상등록 -> 메인 
		
		return "ok";
	}

}
