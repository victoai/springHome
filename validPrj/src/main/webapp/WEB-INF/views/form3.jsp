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


<form action="<c:url value="/modelAttribute" />"  method="post" >

<input type="text"  name="id"   value="${user2.id}">
<input type="text" name="pw"   value="${user2.id}">
<button>가입</button>
</form>
</body>
</html>