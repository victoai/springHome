package com.acon.kaka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaverLogin {

	
	@RequestMapping("/loginN")
	public String t() {
		return "login";
	}
	
	@RequestMapping("/naverCallback")
	public String t2() {
		return "loginCallback";
	}
	
}
