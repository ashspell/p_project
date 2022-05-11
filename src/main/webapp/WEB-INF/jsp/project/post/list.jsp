<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
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
		<h3 class = "text-center">게시판</h3>
		
		<select id = "hometown">
			<option value = "전체">전체</option>
			<option value = "경기도">경기도</option>
			<option value = "강원도">강원도</option>
			<option value = "충청남도">충청남도</option>
			<option value = "충청북도">충청북도</option>
			<option value = "경상남도">경상남도</option>
			<option value = "경상북도">경상북도</option>
			<option value = "전라북도">전라북도</option>
			<option value = "전라남도">전라남도</option>
			<option value = "제주도">제주도</option>			
		</select>
		
		<table class ="table table-hover form-control">
			<thead>
				<tr>
					<th>순번</th>
					<th>제목</th>
					<th>지역</th>
					<th>작성일</th>	
				</tr>
			</thead>
			<tbody>
				<c:forEach var = "postlist" items = "${postlist}">
	
				 	<tr>
						<td>${postlist.id}</td>
						<td><a href = "/project/listdetail_view?id=${postlist.id}">${postlist.title}</a></td>
						
						<td><fmt:formatDate pattern ="yyyy-MM-dd" value="${postlist.createdAt}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		

			<button class = "btn btn-info" onclick = "location.href=`/project/listupload_view`">업로드</button>
	
			
		
	</div>
	
	<c:import url= "/WEB-INF/jsp/includes/footer.jsp"></c:import>
		
		
	<script>
		$(document).ready(function(){
			
			$("#hometown").on("change", function(){
				
				let hometown = $(this).val();
				
				location.href = "/project/list_view?hometown=" + $(this).val();
			
							
		}); 
				
	});
	
	
	</script>
</body>
</html>