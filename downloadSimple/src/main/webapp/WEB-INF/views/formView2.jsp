<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form  action="/tt/requestMessage" method="post">

<input type="text"  name="id" >
<input type="text" name="pw" >
<button>보내기</button>
</form>



<form  action="/tt/requestMessage" method="get">

<input type="text"  name="id" >
<input type="text" name="pw" >
<button>보내기</button>
</form>
</body>
</html>