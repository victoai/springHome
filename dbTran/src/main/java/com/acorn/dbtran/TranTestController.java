package com.acorn.dbtran;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
 


 
 @Controller
public class TranTestController {
	 
 
	 @Autowired
	MemberService service;

	
	@ExceptionHandler(Exception.class)		
	public String catcher(  Model model, Exception ex) {
		model.addAttribute("ex", ex);
		return "err4";
	}
	
	@RequestMapping("/one")   
	public void insert(  ) {
		try {
			 Member member= new Member();
			 member.setId("t13");
	     	member.setPwd("1234");
	     	member.setName("hont");
	     	member.setEmail("email.com");
	     	member.setBirth("2023-01-01");
	     	member.setSns("net");
	     	member.setReg_date(new Date());
			service.insertA1WithTx2(member);
		 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
 
	
	
}
