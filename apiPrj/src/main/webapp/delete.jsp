<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
  $(document).ready(
	function(){
		alert(" load 완료");
		$("#btn").click( function(){
			let id = $("#id").val();   // input type="text" = > val() ,  div => html() 
			alert( id);
			//alert("click !!!!!");
			
			$.ajax({
				type:"DELETE" ,
				url: "/api/user/"+id,
				success: function(data){
					alert( data);
					if( data =="1")
						alert("삭제 되었습니다");
				},
				error: function(err){
					alert("에러발생");
					console.log( err);
				}		
				
			});
			
			
		});
		
	}	  
  );  
</script>
</head>
<body>



<input type="text" id="id">
<button  id="btn">삭제</button>

</body>
</html>