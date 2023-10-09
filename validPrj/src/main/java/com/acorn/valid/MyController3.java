package com.acorn.valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController3 {

	
	@GetMapping("/modelAttribute")
	public String test() {
		 return "form3";
	}
	
	
	@PostMapping("/modelAttribute")
	public String test( @ModelAttribute User2 user ) {   // @ModelAttribute  생략가능 
		 //유효성
		 // 정상 : 등록 , 메인
		 // 비정상 : 등록화면으로		
		 return "form3";
	}
	
}
