package com.acorn.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class A {
	
	
	@ResponseBody
	@RequestMapping("/a")
	public String a() {
		return "aa\naa\n";
	}

}
