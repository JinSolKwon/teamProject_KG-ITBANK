<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
 <title>회원가입</title> 
</head>
<body>

<form role="form" method="post" autocomplete="off">
 <p>
  <label for="id">아이디</label>
  <input type="text" id="id" name="id" />
 </p>  
 <p>
  <label for="password">패스워드</label>
  <input type="password" id="password" name="password" />
 </p>
 <p>
  <label for="name">이름</label>
  <input type="text" id="name" name="name" />
 </p> 
 <p>
   <button type="submit" id="submit" >가입</button>  
 </p>
 <p>
  <a href="/dto/">처음으로</a>
 </p>
 
</form>
</body>
</html>