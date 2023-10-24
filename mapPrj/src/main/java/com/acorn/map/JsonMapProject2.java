package com.acorn.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
public class JsonMapProject2 {
	
	/*
	 * 
	 * 
	 *  <dependency>
		    <groupId>com.google.code.gson</groupId>
		    <artifactId>gson</artifactId>
		    <version>2.10.1</version>
		</dependency>

	 */
	
	
	@RequestMapping("/jsonMap")
	public void a( Model model) {
		
		  
		
		
		//Map을 사용하는 경우 , 별도의 클래스를 만들 필요없다
		Map<String, String> jsonMap = new HashMap<String, String>();
		jsonMap.put("title", "heldlo");
		jsonMap.put("la", "35.190165");
		jsonMap.put("lg", " 126.808852");
		 
		Map<String, String> jsonMap2 = new HashMap<String, String>();
		jsonMap2.put("title", "hello2");
		jsonMap2.put("la", "35.139558");
		jsonMap2.put("lg", "126.793159");
		
		ArrayList< Map<String, String>>  item = new ArrayList< Map<String, String>> ();
		item.add(jsonMap);
		item.add(jsonMap2);
		

		
		/*자바객체를 json으로 변환해 줌 */ 
		Gson gson = new GsonBuilder().create();	 
		String json2  = gson.toJson(item);  
		
		
		
		System.out.println( json2);
		
		
		
 
		 model.addAttribute("item2", json2);
		
		
	}

}
