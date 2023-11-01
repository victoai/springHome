package com.acon.inject;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class sampleHotel {

	private Chef chef;
	
	
 
	
	//생성자가 있는 경우 묵시적으로  autowired 해줌 
	public sampleHotel( Chef chef) {
		
		this.chef= chef;
		
		
	}
	 
}
