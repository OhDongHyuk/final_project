<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<title>스프링</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light" href="<c:url value='/' />">
	  <ul class="navbar-nav">
	    <li class="nav-item">
	      <a class="nav-link" href="<c:url value='/member/signup' />">회원가입</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="#">Link 2</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="#">Link 3</a>
	    </li>
	  </ul>
	</nav>

</body>
</html>
