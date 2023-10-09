package com.acorn.open.uis;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 
@Controller
public class DataController {
	
	//@ResponseBody
		@RequestMapping(value="/dataTest" , method=RequestMethod.GET , produces = "application/json;charset=utf-8")
		public String test(HttpServletRequest request) {
			ApiExplorer2 search = new ApiExplorer2();
			String result;
			try {
				result = search.getDatas();
				request.setAttribute("result", search.getDataList(result));

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "dataTest";
		}
	
	
	
}
