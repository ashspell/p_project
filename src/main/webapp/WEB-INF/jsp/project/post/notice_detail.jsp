<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div id = "wrap">
		<h3>${adminpost.noticetitle}</h3>
		<label class = "mt-3">${adminpost.createdAt}</label>
		<label id = "noticebox" class = "mt-3">${adminpost.noticecontent}</label>
		<button type = "button" class = "btn btn-info" onclick= "location.href=`/project/notice_view`">목록</button>				
	
	</div>
</body>
</html>