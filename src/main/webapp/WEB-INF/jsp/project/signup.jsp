<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    	<link rel = "stylesheet" href = "/static/css/style.css" type = "text/css">
</head>
<body>
	<div id = "wrap">
		
		<h1>회원가입</h1>
			
			<div class = "d-flex">				
				<h3>아이디</h3>
				<input type = "text" id = "idInput" class = "form-control mt-3" placeholder = "아이디">
				<button type = "button" id = "confirmBtn">중복체크</button>
				<h3>비밀번호</h3>
				<input type = "password" id = "passwordInput" class = "form-control mt-3" placeholder = "비밀번호">
				<h3>비밀번호 확인</h3>
				<input type = "password" id = "confirmpassword" class = "form-control mt-3" placeholder = "비밀번호 확인">
				<h3>이메일</h3>
				<input type = "text" id = "emailInput" class = "form-control mt-3" placeholder = "이메일">
				<h3>이름</h3>
				<input type = "text" id = "nameInput" class = "form-control mt-3" placeholder = "이름">
				<h3>거주지역</h3>
				<select class = "mt-3">
					<option>지역선택</option>
					<option>경기도</option>
					<option>강원도</option>
					<option>충청남도</option>
					<option>충청북도</option>
					<option>경상남도</option>
					<option>경상북도</option>
					<option>전라북도</option>
					<option>전라남도</option>
					<option>제주도</option>
				</select>
				<button type = "button"  class = "form-control" id = "signupBtn">회원가입</button>
				
			</div>
			
			
	</div>
	
	
	
	
	<script>
	
		$(document).ready(function(){
			
			$("#signupBtn").on("click" function(){
				
				let loginid = $("#loginidInput").val();
				let password = $("#passwordInput").val();
				let confirmpassword = $("#confirmpassword").val();
				let email = $("#emailInput").val();
				let name = $("#nameInput").val();
				let hometown = $("hometown").val();
			
				
				if(loginid == "") {
					alert("아이디를 입력하세요");
					return;
				}
				
				
				if(password == "") {
					alert("비밀번호를 입력하세요");
					return;
				}
				
				if(confirmpassword == "") {
					alert("비밀번호를 확인하세요");
					return;
				}
				
				if(password != confirmpassword) {
					alert("비밀번호가 일치하지않습니다");
					return;
				}
				
				if(email == "") {
					alert("이메일을 입력하세요");
					return;
				}
				
				if(name == "") {
					alert("이름을 입력하세요");
					return;
				}
				
				if(hometown == "") {
					alert("지역을 선택하세요");
					return;
				}
				
			
			});
			
			
			$("#confirmBtn").on("click" function(){
				
				if(loginid == "") {
					alert("아이디를 입력하세요");
					return;
				}
				
			});
			
			
		});
	
		
		
	
	</script>
	
</body>
</html>