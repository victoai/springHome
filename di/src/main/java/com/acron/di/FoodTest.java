package com.acron.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class FoodTest {

	@Setter( onMethod_ = @Autowired)
	Food food;
	
	public String test1() {
		return "vtest";
	}
}
