package com.acon.kaka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Kaka {
	
	
	@RequestMapping("/hi")
	public String hi() {
		return "hi";
	}
	
	
	@RequestMapping("/test")
	public String testt() {
		return "hi";
	}
	

}
