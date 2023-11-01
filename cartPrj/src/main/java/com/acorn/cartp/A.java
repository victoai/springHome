package com.acorn.cartp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A {
	
	
	@RequestMapping("/cart")
	public String a() {
		return "a";
	}

}
