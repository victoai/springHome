<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<script>
 $(document).ready( function(){ 
	  
	  $("#btn").click( function(){
	  let id = $("#id").val();
	  let name = $("#name").val();
	  let customer = { id:id , name:name};
	   console.log( customer);
	   $.ajax( {
		   type:"POST", 
		   url:"/api/member/register" , 
		   data: JSON.stringify( customer),
		   contentType: "application/json", 
		   success: function(data ){
				alert( data) ;
		    	alert("등록완료");
		    	console.log(data); 
		    },
		    error: function(){
		    	alert("error"); 
		    }	
	 	}); 
	 	});
	 });
</script>
<input type="text" id="id">
<input type="text" id="name">
<button id="btn">등록</button>
</body>
</html>