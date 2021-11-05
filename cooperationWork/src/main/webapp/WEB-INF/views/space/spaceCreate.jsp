<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스페이스 생성</title>
</head>
<body>
	<form role="form" method="post" autocomplete="off" action="/dto/space/spaceCreate">
 <p>
  	<label for="id">워크스페이스 생성</label>
  	<input type="text" placeholder="새 워크스페이스" id="spaceName" name="spaceName" />
 </p>
 	
 <p>
  	<a href="space/inviteMember"><input type="submit" id="work" value="생성"></a>
 </p>
 <p>
  	<a href="/dto/">처음으로</a>
 </p>
 	</form>
</body>
</html>