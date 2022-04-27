<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <link rel = "stylesheet" href = "/static/css/style.css" type = "text/css">
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
</head>
<body>

	<c:import url = "/WEB-INF/jsp/includes/header.jsp"></c:import>

	<div id = "wrap">
		<div>
			<c:forEach var = "noticelist" items = "${noticelist}">
				<h3>${noticelist.noticetitle}</h3>
				<label><fmt:formatDate pattern ="yyyy-MM-dd" value="${noticelist.createdAt}"/></label>
				<label class = "mt-3">${noticelist.noticecontent}</label>
			</c:forEach>
		</div>
		<button type = "button" class = "btn btn-info" onclick= "location.href=`/project/notice_view`">목록</button>
		<button type = "button" class = "btn btn-primary" onclick = ""></button>	
		<button type = "button" class = "btv btn-danger" onclick = "">삭제</button>			
	</div>
	
	<c:import url= "/WEB-INF/jsp/includes/footer.jsp"></c:import>
</body>
</html>