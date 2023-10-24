package com.acorn.map;

import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
public class JsonModelProject {
	
	/*
	 * 
	 * 
	 *  <dependency>
		    <groupId>com.google.code.gson</groupId>
		    <artifactId>gson</artifactId>
		    <version>2.10.1</version>
		</dependency>

	 */
	
	
	@RequestMapping("/jsonModel")
	public void a( Model model) {
		
		
		//자바 객체를 사용하는 경우
		ItemDto item = new ItemDto();
		item.setId("test");
		item.setPw("0001");
		
		
		//Map을 사용하는 경우 , 별도의 클래스를 만들 필요없다
		Map<String, String> jsonMap = new HashMap<String, String>();
		jsonMap.put("one", "hello");
		jsonMap.put("two", "world");

		
		/*자바객체를 json으로 변환해 줌 */ 
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(jsonMap);
		String json2  = gson.toJson(item);  
		
		
		 model.addAttribute("item1", json);
		 model.addAttribute("item2", json2);
		
		
	}

}
