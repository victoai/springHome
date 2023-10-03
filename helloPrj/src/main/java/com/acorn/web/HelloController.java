package com.acorn.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
	
	
	@GetMapping("/hello0")
	public void hello0(HttpServletRequest request , HttpServletResponse response) {		
		
		try {
			request.getRequestDispatcher("/WEB-INF/views/hello.jsp")
			.forward(request, response);
			
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@GetMapping("/hello")
	public String hello() {		
		return "hello";     // "/WEB-INF/views/view이름.jsp";
	}	
		

	@GetMapping("/hello2")
	public String hello2( @RequestParam  String id,  @RequestParam String pw) {
		
		System.out.println( id);
		System.out.println( pw);		
		
		return "hello2";     // "/WEB-INF/views/view이름.jsp";
	}
	
	
	@GetMapping("/hello3")
	public String hello3( Model model) {		
		model.addAttribute("key1","keyvalue");
		model.addAttribute("key2","keyvalue");		
		return "hello3";
	}		
	
	
	@GetMapping("/login")
	public String login( ) {	 
		return "login";     // "/WEB-INF/views/view이름.jsp";
	}
	
	
	@PostMapping("/login")
	public String login( User user) {	
		System.out.println( user);
		System.out.println( user.getId());
		System.out.println( user.getPw());		
		return "home";     // "/WEB-INF/views/view이름.jsp";
	}
	 
	
	
	
}
