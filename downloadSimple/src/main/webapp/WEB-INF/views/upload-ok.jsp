<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 
     
<style>
 
 

img{
width:300px;
height:300px;
}
  
 </style>
 
</head>
<body>
 
<a href="<c:url value="/attach/${fileName}" />" >${fileName} </a>
<a href="<c:url value="/attach2/${fileName}" />" >${fileName} </a>
 
</body>
</html>