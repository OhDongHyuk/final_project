
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<style>
  .btn-insert {
      position: fixed;
      top: 10px; /* 상단 여백 조정 */
      right: 10px; /* 오른쪽 여백 조정 */
  }  
  .profile{
  font-size : 20px;
  }
  .banner {
  }
  .banner-container {
    display: flex;
    overflow: hidden;
  }
  .navbar-advertisement {
    width: 50%; 
    height: auto;
    display: inline;
  }
  .picture {
  	width: 100%;
  }
</style>
<ul class="navbar-nav">
		<c:if test="${user == null }">
			<li class="nav-item">
			  	<a class="nav-link" href="<c:url value='/member/login'/>">로그인</a>
			</li>
		</c:if>
</ul>
	<button class="btn-insert">상품등록</button>
	<script type="text/javascript">
		let btnInsert = document.querySelector('.btn-insert');
		if(location.href.includes('/sale/insert')){
			$('.btn-insert').hide();
			
		}
		$('.btn-insert').click(()=>{
			window.location.href = "<c:url value='/sale/insert'/>";
		})
	</script>
<nav class="profile">
	<a class="navbar-profile" href="<c:url value='/board/profile'/>" style="text-decoration: none; color: black;  text-align: right;">
	<div>마이페이지</div>
	</a>
</nav>
<nav class="banner">
 <div class="banner-container">
  <a class="navbar-advertisement" href="<c:url value='/' />">
    <img src="<c:url value='/resources/img/1.png'/>" class="picture">
  </a>	
  <a class="navbar-advertisement" href="<c:url value='/board/community' />">
    <img src="<c:url value='/resources/img/2.png'/>" class="picture">
  </a>
 </div>
</nav>
<nav>
  <!-- 브랜드 로고 -->
  <a class="navbar-peach" href="<c:url value='/' />">
    <img src="<c:url value='/resources/img/3.png'/>" alt="logo" style="width:200px; height:100px;">
  </a>	
</nav>

