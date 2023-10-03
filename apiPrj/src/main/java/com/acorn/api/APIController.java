package com.acorn.api;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class APIController {	

	@ResponseBody
	@GetMapping("/api1")
	public String method1() {	
		return "spring data";
	}	
	
	
    // 만약   ajax로 이 요청을 했다면 서버는   view 내용 전체를 데이터로 반환함 
	@GetMapping("/test")
	public String test() {	
		 
		return "test";		
		
	}	


	/* mvc 방식 */
 
	@GetMapping("/data")
	public void method00(HttpServletResponse resp) {		
	 
		try {
			resp.getWriter().print("rrerererer");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 		
		
	}	
	
	
	@ResponseBody
	@GetMapping("/api2")
	public User method2() {		
		User user = new User("acorn" ,"에이콘");
		return user;		
		
	}	
	 
	
	@ResponseBody
	@GetMapping("/api3")
	public ArrayList<User> method3() {			
		ArrayList<User> list = new ArrayList<>();
		
		  list.add( new User("acorn1" ,"에이콘"));
		  list.add( new User("acorn2" ,"에이콘"));
		  list.add( new User("acorn3" ,"에이콘"));		  
		return list;		
		
	}	
	
	@ResponseBody
	@PostMapping("/reg")
	public int  reg( @RequestBody User user) {    // json  - >    java 객체로 바인딩		
		System.out.println( user);		
		return  1;
	}		
	
	
	@ResponseBody
	@DeleteMapping("/user/{id}")
	public int  detelte(@PathVariable String id ) {
				System.out.println( id);
		return 1;
	}
	
	
	
	
	
}
