package com.acorn.api.naver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NaverApiController {
	
	@Autowired
	NaverApi4  naverApi;
	
	
	@ResponseBody
	@GetMapping(value="/apiNaver")
	public List<ItemDto> api( ){
		String response = naverApi.getAPIString();
		List<ItemDto> list = naverApi.fromJSONtoItems(response);
		return list;		
	}
	
}
