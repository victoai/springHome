<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<h2>회원가입</h2>


<!-- 
 <form  action="<c:url value="/v5"/>"  method="post"> 
 
	아이디<input type="text"  name="id">
	비번<input type="text"  name="pw">		  
<button>등록</button>
 

  </form>  
  -->  
  <form:form modelAttribute="user2"> 
      <form:input path="id" />   <form:errors path="id"/>   <br>         
      <form:input path="pw"/>    <form:errors path="pw"/>   <br>      
   <button>로그인</button>
 </form:form>
    
</body>
</html>