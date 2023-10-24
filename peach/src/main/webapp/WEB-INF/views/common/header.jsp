<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%-- 
<div class="header">
	<div class="header-top">
		<div class="top-inner">
			<ul class="inner-nav">
				<c:if test="${user == null}">
					<li class="inner-item"><a class="inner-link"
						href="<c:url value='/member/signup' />">회원가입</a></li>
					<li class="inner-item"><a class="inner-link"
						href="<c:url value='/member/login'/>">로그인</a></li>
						<li class="inner-item"><a class="inner-link"
						href="<c:url value='/member/login'/>">12</a></li>
						<li class="inner-item"><a class="inner-link"
						href="<c:url value='/member/login'/>">로그345인</a></li>
				</c:if>
				<c:if test="${user != null }">
					<li class="inner-item"><a class="inner-link"
						href="<c:url value='/member/logout'/>">로그아웃</a></li>
					<li class="inner-item"><a class="inner-link"
						href="<c:url value='/board/list'/>">마이페이지</a></li>
				</c:if>
			</ul>
		</div>
		<div class="top-main">탑 메인박스 확인용</div>
		<div class="top-bottom">탑 바텀 확인용</div>
	</div>
</div>
 --%>
<header class="header navbar-area">
	<!-- 헤더 탑-->
	<div class="topbar">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-4 col-md-4 col-12">
					<div class="top-left">
						<ul class="menu-top-link">

						</ul>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<div class="top-middle">
						<ul class="useful-links">
							<li><a href="index.html">Home</a></li>
							<li><a href="about-us.html">중고 거래</a></li>
							<li><a href="contact.html">피치 게시판</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<div class="top-end">
						<div class="user">
							<i class="lni lni-user"></i> Hello
						</div>
						<ul class="user-login">
							<li><a href="login.html">Sign In</a></li>
							<li><a href="register.html">Register</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 헤더 미드 -->
	<!-- Start Header Middle -->
	<div class="header-middle">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-3 col-md-3 col-7"></div>
				<div class="col-lg-5 col-md-7 d-xs-none">
					<!-- Start Main Menu Search -->
					<div class="main-menu-search">
						<!-- navbar search start -->
						<div class="navbar-search search-style-5">
							<div class="search-select">
								<div class="select-position">
									<select id="select1">
										<option selected>All</option>
										<option value="1">제목으로 검색</option>
										<option value="2">내용으로 검색</option>
										<option value="3">동네이름으로 검색</option>
									</select>
								</div>
							</div>
							<div class="search-input">
								<input type="text" placeholder="Search">
							</div>
							<div class="search-btn">
								<button>
									<i class="lni lni-search-alt"></i>
								</button>
							</div>
						</div>
						<!-- navbar search Ends -->
					</div>
					<!-- End Main Menu Search -->
				</div>
				<div class="col-lg-4 col-md-2 col-5">
					<div class="middle-right-area">
						<div class="nav-hotline">
							<h3>안내문구 적는곳</h3>
						</div>
						<div class="navbar-cart">
							<div class="wishlist">
								<a href="#"> <i class="lni lni-heart"></i> <span
									class="total-items">0</span>
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 헤더 마지막 -->
	<!-- Start Header Bottom -->
	<div class="container">
		<div class="row align-items-center">
			<div class="col-lg-8 col-md-6 col-12">
				<div class="nav-inner">
					<!-- Start Mega Category Menu -->
					<!-- 카테고리 적는곳 -->
					<div class="mega-category-menu">
						<span class="cat-button"><i class="lni lni-menu"></i>All
							Categories</span>
						<ul class="sub-category">
							<li><a href="product-grids.html">Electronics <i
									class="lni lni-chevron-right"></i></a>
								<ul class="inner-sub-category">
									<li><a href="product-grids.html">Digital Cameras</a></li>
									<li><a href="product-grids.html">Camcorders</a></li>
									<li><a href="product-grids.html">Camera Drones</a></li>
									<li><a href="product-grids.html">Smart Watches</a></li>
									<li><a href="product-grids.html">Headphones</a></li>
									<li><a href="product-grids.html">MP3 Players</a></li>
									<li><a href="product-grids.html">Microphones</a></li>
									<li><a href="product-grids.html">Chargers</a></li>
									<li><a href="product-grids.html">Batteries</a></li>
									<li><a href="product-grids.html">Cables & Adapters</a></li>
								</ul></li>
							<li><a href="product-grids.html">accessories</a></li>
							<li><a href="product-grids.html">Televisions</a></li>
							<li><a href="product-grids.html">best selling</a></li>
							<li><a href="product-grids.html">top 100 offer</a></li>
							<li><a href="product-grids.html">sunglass</a></li>
							<li><a href="product-grids.html">watch</a></li>
							<li><a href="product-grids.html">man’s product</a></li>
							<li><a href="product-grids.html">Home Audio & Theater</a></li>
							<li><a href="product-grids.html">Computers & Tablets </a></li>
							<li><a href="product-grids.html">Video Games </a></li>
							<li><a href="product-grids.html">Home Appliances </a></li>
						</ul>
					</div>
					<!-- End Mega Category Menu -->
					<!-- Start Navbar -->
					<nav class="navbar navbar-expand-lg">
						<button class="navbar-toggler mobile-menu-btn" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#navbarSupportedContent"
							aria-controls="navbarSupportedContent" aria-expanded="false"
							aria-label="Toggle navigation">
							<span class="toggler-icon"></span> <span class="toggler-icon"></span>
							<span class="toggler-icon"></span>
						</button>
						<div class="collapse navbar-collapse sub-menu-bar"
							id="navbarSupportedContent">
							<ul id="nav" class="navbar-nav ms-auto">
								<li class="nav-item"><a href="index.html" class="active"
									aria-label="Toggle navigation">Home</a></li>
								<li class="nav-item"><a class="dd-menu collapsed"
									href="javascript:void(0)" data-bs-toggle="collapse"
									data-bs-target="#submenu-1-2"
									aria-controls="navbarSupportedContent" aria-expanded="false"
									aria-label="Toggle navigation">Pages</a>
									<ul class="sub-menu collapse" id="submenu-1-2">
										<li class="nav-item"><a href="about-us.html">About Us</a></li>
										<li class="nav-item"><a href="faq.html">Faq</a></li>
										<li class="nav-item"><a href="login.html">Login</a></li>
										<li class="nav-item"><a href="register.html">Register</a></li>
										<li class="nav-item"><a href="mail-success.html">Mail
												Success</a></li>
										<li class="nav-item"><a href="404.html">404 Error</a></li>
									</ul></li>
								<li class="nav-item"><a class="dd-menu collapsed"
									href="javascript:void(0)" data-bs-toggle="collapse"
									data-bs-target="#submenu-1-3"
									aria-controls="navbarSupportedContent" aria-expanded="false"
									aria-label="Toggle navigation">Shop</a>
									<ul class="sub-menu collapse" id="submenu-1-3">
										<li class="nav-item"><a href="product-grids.html">Shop
												Grid</a></li>
										<li class="nav-item"><a href="product-list.html">Shop
												List</a></li>
										<li class="nav-item"><a href="product-details.html">shop
												Single</a></li>
										<li class="nav-item"><a href="cart.html">Cart</a></li>
										<li class="nav-item"><a href="checkout.html">Checkout</a></li>
									</ul></li>
								<li class="nav-item"><a class="dd-menu collapsed"
									href="javascript:void(0)" data-bs-toggle="collapse"
									data-bs-target="#submenu-1-4"
									aria-controls="navbarSupportedContent" aria-expanded="false"
									aria-label="Toggle navigation">Blog</a>
									<ul class="sub-menu collapse" id="submenu-1-4">
										<li class="nav-item"><a href="blog-grid-sidebar.html">Blog
												Grid Sidebar</a></li>
										<li class="nav-item"><a href="blog-single.html">Blog
												Single</a></li>
										<li class="nav-item"><a href="blog-single-sidebar.html">Blog
												Single Sibebar</a></li>
									</ul></li>
								<li class="nav-item"><a href="contact.html"
									aria-label="Toggle navigation">Contact Us</a></li>
							</ul>
						</div>
						<!-- navbar collapse -->
					</nav>
					<!-- End Navbar -->
				</div>
			</div>
		</div>
	</div>
	<!-- End Header Bottom -->
</header>


<%-- 
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="<c:url value='/' />">
    <img src="<c:url value='/resources/img/logo.jpg'/>" alt="logo" style="width:40px;">
  </a>
  
  <!-- Links -->
  <ul class="navbar-nav">
  	<c:if test="${user == null}">
	    <li class="nav-item">
	      <a class="nav-link" href="<c:url value='/member/signup' />">회원가입</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="<c:url value='/member/login'/>">로그인</a>
	    </li>
    </c:if>
    <c:if test="${user != null }">
	    <li class="nav-item">
	      <a class="nav-link" href="<c:url value='/member/logout'/>">로그아웃</a>
	    </li>
    </c:if>
      <li class="nav-item">
	      <a class="nav-link" href="<c:url value='/board/list'/>">게시판</a>
	   </li>
	    
	    
	    <!-- Dropdown -->
	<c:if test="${user != null && user.me_role == 'ADMIN' }">
	    <li class="nav-item dropdown">
	      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
	        관리자
	      </a>
    	  <div class="dropdown-menu">
   		    <a class="dropdown-item" href="<c:url value='/admin/board/type'/>">게시판 관리 타입</a>
          </div>
	    </li>
    </c:if>
	    <li class="nav-item">
		     <a class="nav-link" href="<c:url value='/mail'/>">메일보내기 테스트</a>
		</li>
    
  </ul>
</nav> --%>