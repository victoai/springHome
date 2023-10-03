<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
	function search(){
		alert("dkfkfkf");
		
		$.ajax(  {
			type:"GET" ,
			url: "/api/test"  ,
			success: function( data ){ 
				console.log( data);
			} ,
			error: function(err){
				console.log( err);
			}			
		});  		
	}
	
	 	
	 
</script>

</head>

<body>
<button onclick="search()">조회</button>
<div id="wrap"></div>

</body>
</html>