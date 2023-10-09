package com.acorn.log;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Test1 {
	
	
	@GetMapping("/test1")
	public ModelAndView  test1() {
		ModelAndView  mv= new ModelAndView("test");
		
		return mv;
		
	}

}
