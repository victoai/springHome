package com.acon.kaka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class town {
	
	
	@RequestMapping("/town")
	
	public String town() {
		return "twon";
	}

}
