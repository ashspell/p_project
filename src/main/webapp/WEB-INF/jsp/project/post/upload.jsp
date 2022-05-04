<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업로드</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    	<link rel = "stylesheet" href = "/static/css/style.css" type = "text/css">
    	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
</head>
<body>

	<c:import url = "/WEB-INF/jsp/includes/header.jsp"></c:import>
	
	<div id = "wrap">
		
		<h3 class = "text-center mt-5">업로드</h3>
		<label>제목:</label>
		<input type = "text" class  = "mt-3" id = "titleInput">
		<br>
		<label>내용:</label>
		<textarea class = "form-control mt-3" id = "contentInput"></textarea>
		<button class = "mt-3" id = "fileBtn"><i class="bi bi-upload"></i></button>
		
		
		<button class = "button form-control btn btn-info" id = "uploadBtn">게시글 작성완료</button>
		
	</div>	
	
	
	
	
	<c:import url = "/WEB-INF/jsp/includes/footer.jsp"></c:import>	
	
	
	<script>
		$(document).ready(function(){
			
			$("#uploadBtn").on("click", function(){
				
				let title = $("#titleInput").val();
				let content = $("#contentInput").val();
				
				
			
				
				
				if(title == "") {
					alert("제목을 입력하세요");
					return;
				}
				
				if(content == "") {
					alert("내용을 입력하세요");
					return;
				}
				
			
			
			
			$.ajax({
				
				type:"post",
				url:"/project/upload",
				data:{"title":title, "content":content},
				success:function(data) {
					if(data.result == "success") {
						location.href = "/project/list_view"
					}else {
						alert("업로드 실패");
					}
				},
				
				error:function() {
					alert("업로드 에러");
				}
				
					
				
			});
		});
			
			
	});
		
	
	
	
	
	
	
	</script>
	
	
	
	
</body>
</html>