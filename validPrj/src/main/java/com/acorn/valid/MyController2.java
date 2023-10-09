package com.acorn.valid;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController2 {
   
	@InitBinder
	public void toDate( WebDataBinder binder) { 		
		//binder.setValidator( new UserValidator());   // 등록 	
		binder.addValidators(new UserValidator());   // 변경 
	}   
		
	@GetMapping("/v5")
	public String register(User2 user) {	
		return "form2";
	}	
	
	@PostMapping("/v5")
	public String register( @Valid User2 user2  , BindingResult result ) {
		  // 1. 데이터변환
		  // 2. 유효성 체크	 
		System.out.println( user2);
		System.out.println( result);		 
		
		if( result.hasErrors())
			return "form2";							
		
		return "ok";
	}

}
