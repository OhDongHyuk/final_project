<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
<head>
<title>스프링</title>


 <!-- ========================= CSS here ========================= -->
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/css/LineIcons.3.0.css" />
    <link rel="stylesheet" href="resources/css/tiny-slider.css" />
    <link rel="stylesheet" href="resources/css/glightbox.min.css" />
    <link rel="stylesheet" href="resources/css/main.css" />

</head>
<body>
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="body" />
    <tiles:insertAttribute name="footer" />
</body>
</html>
