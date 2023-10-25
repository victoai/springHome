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
public class JsonMapProject3 {
	
	/*
	 * 
	 * 
	 *  <dependency>
		    <groupId>com.google.code.gson</groupId>
		    <artifactId>gson</artifactId>
		    <version>2.10.1</version>
		</dependency>

	 */
	
	
	@RequestMapping("/jsonMap3")
	public void a( Model model) { 
		
		
		//Map을 사용하는 경우 , 별도의 클래스를 만들 필요없다
		 
		
		ArrayList<AreaCode> list = new ArrayList<>();
		list.add( new AreaCode("1001","강남구"));
		list.add( new AreaCode("1002","강서구"));
		list.add( new AreaCode("1003","노원구"));
		
		
		ArrayList<AreaCode> list2 = new ArrayList<>();
		list2.add( new AreaCode("2001","계양구"));
		list2.add( new AreaCode("2002","부천구"));
		list2.add( new AreaCode("2003","안양구"));
		 
		Map<String, ArrayList<AreaCode>> map = new HashMap< >();
		map.put("서울",  list);
		map.put("경기", list2);
	  

		
		/*자바객체를 json으로 변환해 줌 */ 
		Gson gson = new GsonBuilder().create();	 
		String json   = gson.toJson(map);  
		System.out.println( json ); 
		
 
		 model.addAttribute("code", json);
		
		
	}

}
