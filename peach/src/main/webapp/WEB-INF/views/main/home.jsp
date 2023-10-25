<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<title>스프링</title>
</head>
<body>
	<c:forEach items="${scgList}" var="scg">
	    <ul class="category-list">
	        <li><a href="/peach/sale/${scg.sc_num}">${scg.sc_name}</a></li>
	    </ul>
	</c:forEach>
</body>
</html>
