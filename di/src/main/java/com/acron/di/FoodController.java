package com.acron.di;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Setter;

@Controller
public class FoodController {
	
	
	@Setter(onMethod_ = { @Autowired})
	FoodTest test;
	
	
	@GetMapping("/t1")
	public String test() {
		
		String result = test.test1();
		return  result;
	}

}
