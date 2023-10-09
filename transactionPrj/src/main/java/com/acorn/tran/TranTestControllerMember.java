package com.acorn.tran;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
 


@Controller	
public class TranTestControllerMember {
	 
	@Autowired
	MemberService  service;

	//응답코드 수정가능하다 , 서버에서 응답하면 기본적으로 성공으로 간주한다.
	@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
	@ExceptionHandler(Exception.class)		
	public String catcher(  Model model, Exception ex) {
	//	model.addAttribute("ex", ex);
	 	model.addAttribute("ex", "데이터베이스오류입니다  서버관리자에게 문의하세요 !");
		return "err";
	}
	
	  

	@RequestMapping("/tranMember")   
	public void insert1(  ) throws Exception   {			
			Member member= new Member();
			member.setId("t3");
	     	member.setPwd("1234");
	     	member.setName("hong");
	     	member.setEmail("email.com");
	     	member.setBirth("2023-01-01");
	     	member.setSns("net");
	     	member.setReg_date(new Date());
			service.insertA1WithTx(member); 
		 
	}  
	 
	
}
