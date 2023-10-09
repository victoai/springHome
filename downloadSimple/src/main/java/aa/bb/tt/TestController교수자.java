package aa.bb.tt;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

 
public class TestController교수자 {
	
	
	@GetMapping("/test1")
	public void test1(HttpServletResponse response ) throws IOException {
		
		response.setContentType("application/json;charset=utf-8");
		response.setHeader("Content-Length", "200");	 
		response.getWriter().println( "{ \"name\" : \"wjy\" , \"pw\":\"000\"}");
		
		
	}
	@GetMapping("/test2")
	public void test2(HttpServletResponse response ) throws IOException {
		
		String message="서버가 보낸 데이터";
		response.setContentType("text/plain;charset=utf-8");
		response.setHeader("Content-Length", String.valueOf(message.getBytes().length));	 
		response.getWriter().println(   message);
		
		
	}
	
	  @GetMapping("/test3")
	    public ResponseEntity<String> test1() {
	        String message = "서버가 보내는 message !!!!";
	        return ResponseEntity
	                .ok()
	                .header("Content-Type", "text/plain;charset=utf-8")
	                .header("Content-Length", String.valueOf(message.getBytes().length))
	                .body(message);
	    }
	  
	  
	  @GetMapping("/test4")
	  public void test4(HttpServletResponse response ) throws IOException {
			
			response.setContentType("application/json;charset=utf-8");
			response.setHeader("Content-Length", "200");
			response.setHeader("Custom-Header", "This is a custom header value");
			response.getWriter().println( "{ \"name\" : \"wjy\" , \"pw\":\"000\"}");
			
		}

}
