package com.acorn.redi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Test { 
	
	@RequestMapping("/testR")
	public String test1( RedirectAttributes   res) {
		
		res.addAttribute("key1","한글보낸다");
		return "redirect:/testR2";
		
	}
	
	
	@RequestMapping("/testR2")
	public String test2(  String key1 ) {
		
	 
		System.out.println(key1);
		return  "result";
		
	}
}
