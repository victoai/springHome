<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
 
</head>
<body>
<div id="code" style="width:100%;height:350px;"></div>

<select id="bigCode">
<option></option>
<option value="서울">서울</option>
<option value="경기">경기</option> 
</select>
 
 
 <select id="middleCode">
 
</select>
 

<script>
var code = document.getElementById('code');

let codeJson = ${code};
console.log( codeJson);


codeJson.경기.forEach(   ( item)  => {
	
	 alert( item.code );
	 alert( item.name ); 
} );

    
    
 
</script>
</body>
</html>
