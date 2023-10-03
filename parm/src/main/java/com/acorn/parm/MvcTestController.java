package com.acorn.parm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcTestController {

	 
	//MVC
	@RequestMapping("/test1")	 
	 public String test( ) {	
		return  "test";
	}
	
	
 
	 @RequestMapping("/param2")	 
	 public String param2( String id, String pw) {  // 요청시 키 이름으로 지정된다
		 System.out.println( id + pw);
		return  "test";
	}
	 
	 
	 

	@ResponseBody
	@RequestMapping("/param3")                                             //요청시 키 이름과 매핑변수이름을  별도로 지정해 줄 수 있다
	 public String param3(@RequestParam("id") String id2  , @RequestParam("pw") String pw2) {	
		return  id2  +  ": " +  pw2;
	}
	 
	
	

}
