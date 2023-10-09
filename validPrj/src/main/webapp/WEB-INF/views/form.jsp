<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<h2>회원가입</h2>

<form  action="<c:url value="/v4"/>"  method="post">
	아이디<input type="text"  name="id">
	비번<input type="text"  name="pw">
	생일<input type="text"  name="birth">
	취미<input type="text"  name="hobby">    
<button>등록</button>
</form>
</body>
</html>