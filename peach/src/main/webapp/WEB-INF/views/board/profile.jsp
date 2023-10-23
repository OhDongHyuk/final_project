<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<title>프로필</title>
</head>
<style>
	.profile-container {
		display: flex;
		border-style: dashed;
		border-width: 1px;
		border-color: gray;
		border-radius: 20px;
	}
	.profile-imgbox {
		display: flex;
		flex-direction: column;
		height: 310px;
		width: 310px;
		background-color: aqua;
		text-align: center;
		border-right: dashed;
		border-width: 1px;
		border-color: gray;
		border-radius: 20px 0 0 20px;
	}
	.btn-profile {
		width: 150px;
		margin: 15px auto;
	}
	.example {
		height: 120px;
		width: 120px;
		margin: 15px auto;
		margin-top: 50px;
	}
	.profile-name {
		margin: 15px 0;
	}
	.profile-Detail {
		background-color: yellow;
		width: auto;
		flex: 1;
		padding: 20px;
	}
	.profile-product {
		background-color: green;
		display: flex;
		border-style: dashed;
		border-width: 1px;
		border-color: gray;
		border-radius: 20px;
	}
	.profile-product-list{
		display:flex;
		align-items: center;
		padding: 20px;
	}
	.example2 {
		height: 100px;
		width: 100px;
		margin-right: 40px;
	}
</style>
<body>
<div class="profile-container">
 <div class="profile-imgbox">
  <img src="<c:url value='/resources/img/3.png'/>" class="example">
  <div class="profile-name">닉네임</div>
  <button class="btn-profile" type="button" onclick="location.href='/peach/board/profile_management'">내 프로필 관리</button>
 </div>
 <div class="profile-Detail">
 	<div class="profile-namebox">
 		<div class="profile-name">닉네임</div>
 	</div>
 	<br/>
 	<div>
 		가입일, 판매 중인 게시글 수, 판매 완료한 게시글 수, 회원 평점
 	</div>
 	<br/><br/><br/>
 	<div>
 		소개글
 	</div>
 </div>
</div>
<br>
<div class="profile-product">
	<div class="profile-product-list">
		<img src="<c:url value='/resources/img/3.png'/>" class="example2">
		<div>상품명, 카테고리, 숫자</div>
	</div>
</div>
<script>
	
</script>
</body>
</html>
