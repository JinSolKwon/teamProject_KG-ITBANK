<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>메인</title>
</head>
<script type="text/javascript">
		$(document).ready(function(){
			$("#submit").on("click", function(){
				if($("#userId").val()==""){
					alert("아이디를 입력해주세요.");
					$("#userId").focus();
					return false;
				}
				if($("#userPw").val()==""){
					alert("비밀번호를 입력해주세요.");
					$("#userPw").focus();
					return false;
				}
				if($("#userName").val()==""){
					alert("성명을 입력해주세요.");
					$("#userName").focus();
					return false;
				}
				if($("#userEmail").val()==""){
					alert("이메일을 입력해주세요.");
					$("#userEmail").focus();
					return false;
				}
			});		
		})
	</script>
	<body>
		<section id="container">
			<form method="post" action="<c:url value="/member/register"/>">
			<input type="button" value="TASKWITH" onClick="document.location.href='<c:url value="/"/>'">
				<div>
					<label class="control-label" for="userId">아이디</label>
					<input class="form-control" type="text" id="userId" name="userId" />
				</div>
				<div>
					<label class="control-label" for="userPw">패스워드</label>
					<input class="form-control" type="password" id="userPw" name="userPw" />
				</div>
				<div>
					<label class="control-label" for="userName">성명</label>
					<input class="form-control" type="text" id="userName" name="userName" />
				</div>
				<div>
					<label class="controll-label" for="userEmail">이메일</label>
					<input class="form-control" type="text" id="userEmail" name="userEmail"/>
				</div>
				<div>
					<button class="btn btn-success" type="submit" id="submit">회원가입</button>
					<input type="button" value="취소" onClick="document.location.href='<c:url value="/"/>'">
				</div>
			</form>
		</section>		
	</body>
</html>