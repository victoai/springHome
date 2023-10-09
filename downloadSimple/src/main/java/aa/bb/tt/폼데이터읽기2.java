package aa.bb.tt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class 폼데이터읽기2   {
	
	@GetMapping("/formRead")
    public String form(  )   {	
		return "formView";
	}

	@GetMapping("/formRead1")
     void test2(HttpServletRequest request ) throws ServletException, IOException {
      
		String id  = request.getParameter("id");
		String pw =  request.getParameter("pw");
		
		
		System.out.println("Request header: 요청헤더에서 값 추출");
		System.out.println( id);
		System.out.println( pw);
		
		
    }
	
	

	@PostMapping("/formRead2")
     void test1(HttpServletRequest request ) throws ServletException, IOException {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"))) {
                StringBuilder requestBody = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    requestBody.append(line);
                }

              
                System.out.println("Request Body: 요청바디에서 값 추출");
                System.out.println(requestBody.toString());
            }
        }        
    }






	
	/*

	@GetMapping("/formRead2")
     void test1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int contentLength = request.getContentLength();
        if (contentLength > 0) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"))) {
                StringBuilder requestBody = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    requestBody.append(line);
                }

                // Print the request body
                System.out.println("Request Body:");
                System.out.println(requestBody.toString());
            }
        }

        // Your code to process the request body goes here
    }
    
    */
	
 
