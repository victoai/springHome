<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>

function reg(){
	// ajax를 이용해서  등록
	
	// 고객의 정보 얻어오기 
	let id = $("#id").val();
	let name = $("#name").val();
	
	alert( id);
	alert( name);	
	//서버에 json형태 데이터로 보내기 
	let user =  {  id:id , name:name} ;
	alert( user);
	console.log( user); 	
	let userString  =  JSON.stringify(user);	
	alert( userString);	
	 $.ajax({
		 type:"POST" , 
		 url:"/api/reg",
		 data: JSON.stringify(user),
		 contentType: "application/json" ,   // clent  -> 서버에게 보내는 데이터 형식 
		 success: function(data){
			  alert("등록성공");
		 },
		 error: function( error){
			  console.log ( error);
		 }		
	});
	   
}
</script>
</head>
<body>

<form   method="post">
<input  type="text" name="id"  id="id">
<input  type="text" name="name"  id="name">
<button type="button"  onclick="reg()">등록</button>
</form>


</body>
</html>