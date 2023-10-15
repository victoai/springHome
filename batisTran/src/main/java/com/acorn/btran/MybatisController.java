package com.acorn.btran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;
 
 
 
 
@Controller
public class MybatisController {
	
	@Autowired
	UserService service; 
	 
	 
	 
 
	@RequestMapping("/insert")
	public String test3( ) throws Exception {	
		
			System.out.println(" insert");
		 	String view="";	
		try {
			Member m = new Member();
		 		
		 		m.setId("744");
		 		m.setPwd("9999");
		 		m.setName("홍길동");
		 		System.out.println(" call start");
		 	    service.createUser(m)  ;
		 	    view="ok";
		}catch(Exception e) {
			 view="err";
		}
			 
		return view;
	}
 
	 
	@RequestMapping("/insert2")
	public void test4( ) throws Exception {			  
		 		Member m = new Member();
		 		
		 		m.setId("000000");
		 		m.setPwd("9999");
		 		m.setName("홍길동");
		 	    service.createUser2(m)  ;
			 
	}
	  
	 

}
