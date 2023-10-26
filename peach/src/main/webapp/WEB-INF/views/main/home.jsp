<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<title>스프링</title>
</head>
<body>
<h1> 
	<a href="<c:url value='/salesboard/insert' />" style="color:black; text-decoration:none;">게시글등록</a> 
	<a href="<c:url value='/salesboard/list' />" style="color:black; text-decoration:none;">게시글보기</a> 
</h1>

</body>
</html>
