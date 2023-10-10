<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<script>
$(document).ready(function(){
	 $("#btn").click(function(){
	 let id = $("#id").val(); 
	 let name =$("#name").val();
	 
	 alert( id);
	 alert( name);
	 
	 $.ajax({
		 type:'PUT', // 수정 요청 메서드
		 url: '/api/member/modify2' , // 요청 URI		 
		 data : 'id=' +id +"&name=" + name, // 서버로 전송할 데이터. stringify()로 직렬화 필요. 
		 success : function(result){
			alert( result);
			alert("수정완료");
		 },
		error : function(){ alert("error") } // 에러가 발생했을 때, 호출될 함수
		 }); // $.ajax()
	 });
});

</script>
<input type="text" id="id">
<input type="text" id="name">
<button id="btn">수정</button>
</body>
</html>