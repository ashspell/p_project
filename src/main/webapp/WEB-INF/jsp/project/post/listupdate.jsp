<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
					<h3 class = "text-center mt-5">게시글 수정</h3>
					<input type = "text" class = "form-control mt-5" id = "posttitle" value = "${postdetail.title }">
					<textarea class = "form-control mt-3" id = "postcontent">${postdetail.content}</textarea>
			
					<button type = "button" class = "form-control mt-3" id = "updateBtn" data-id = "${postdetail.id }">수정</button>
	
				</div>
	
	
	
	<script>
			
				$(document).ready(function(){
		
				$("#updateBtn").on("click", function(){
			
			
					let title = $("#posttitle").val();
					let content = $("#postcontent").val();
			
					let id = $(this).data("id");
					
			
					
					
			$.ajax({
				type : "post",
				url : "/project/updatepost",
				data : {"id":id, "title":title, "content":content},
					success:function(data) {
					if(data.result == "success") {
						
						location.href ="/project/list_view"
					}else{
						alert("게시글 수정 실패");
					}
				},
				error:function() {
					alert("게시글 수정 에러");
				}
				
				
				
				
				
			});
			
			
			
			
		});
		
	});
	</script>
	
	
	
</body>
</html>