package com.acorn.api;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class APIController2 {
	
	/*
	 매핑관련 라이브러리 
    <dependency>
	<groupId>com.fasterxml.jackson.core</groupId>
	<artifactId>jackson-databind</artifactId>
	<version>2.9.3</version>
	</dependency>
	<dependency>
	 <groupId>org.codehaus.jackson</groupId>
	<artifactId>jackson-mapper-asl</artifactId>
	<version>1.9.13</version>
	</dependency>
	 */	
	@ResponseBody
	@GetMapping("/json")
	public String method() {		
		return "americano";
	}
	
	
	@ResponseBody
	@GetMapping("/json2")
	public User method2() {
		User user = new User("acorn","0000");
		return user;
	}	
	

	@ResponseBody
	@GetMapping("/json3")
	public ArrayList<User> method4() {		
		ArrayList<User> list = new ArrayList<>();
		list.add( new User("acorn1" ,"kim"));
		list.add( new User("acorn2" ,"lee"));
		list.add( new User("acorn3" ,"jun"));		
		return list;
	}

	@ResponseBody
	@GetMapping("/member/list")
	public ArrayList<User> method5() {	
		System.out.println( "고객목록 데이터");
		ArrayList<User> list = new ArrayList<>();
		list.add( new User("acorn1" ,"kim"));
		list.add( new User("acorn2" ,"lee"));
		list.add( new User("acorn3" ,"jun"));		
		return list;
	}
	
	@ResponseBody
	@PostMapping("/member/register")
	public int method4( @RequestBody User user )   {	
		System.out.println( user);	
		System.out.println( "등록합니다");		
		return 1;
	}	 
	
	
	@ResponseBody
	@PostMapping("/member/register2")
	public int method44(   User user )   {	
		System.out.println( user);	
		System.out.println( "등록합니다  rffff");		
		return 1;
	}	 
	
	@ResponseBody
	@PutMapping("/member/modify/{id}")
	public String method5( @RequestBody User user ,  @PathVariable String id ) {	
		System.out.println( user);
		System.out.println( id);
		System.out.println( "고객 정보를 수정합니다");
		return "1";
	}
	
	@ResponseBody
	@PutMapping("/member/modify2")
	public String method55(  User user   ) {	
		System.out.println( user);
	 
		System.out.println( "고객 정보를 수정합니다22222");
		return "1";
	}
		
	
	@ResponseBody
	@DeleteMapping("/member/delete/{id}")
	public String method6(   @PathVariable String id ) {	
		System.out.println( "고객 정보를 삭제합니다"); 
		System.out.println( id);
		return "1";
	}
	
	@ResponseBody
	@DeleteMapping("/member/delete2")
	public String method7(  String id ) {	
		System.out.println( "고객 정보를 삭제합니다222"); 
		System.out.println( id);
		return "1";
	}
	
	
	
}
