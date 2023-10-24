<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!doctype html>
<html lang="ko">
<head>
<title>스프링</title>
</head>
<body>
	<header class="header navbar-area">
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
							<!-- 찜목록 구현 -->
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
						<span class="cat-button"><i class="lni lni-menu"></i>카테고리</span>
						<c:forEach items="${sale_category}" var="category">
							<li><a href="product-grids.html">${category.sc_num }</a></li>
						</c:forEach>


						<c:forEach items="${typeList}" var="type">
							<option value="${type.bt_num }">${type.bt_title }</option>
						</c:forEach>


						<ul class="sub-category">
							<li><a href="product-grids.html">Electronics <i
									class="lni lni-chevron-right"></i></a>
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
    <!-- End Header Area -->

	
	<!-- Start Hero Area -->
	<section class="hero-area">
		<div class="container">
			<div class="row">
				<c:forEach items="${list }" var="board">
					<div class="col mb-5">
						<div class="card h-100">
							<!-- Sale badge-->
							<div class="badge bg-dark text-white position-absolute"
								style="top: 0.5rem; right: 0.5rem">Sale</div>
							<!-- Product image-->
							<c:forEach items="${board.fileVoList }" var="file">
								<img class="card-img-top"
									src="<c:url value='/download${file.fi_name}'/>" alt="..."
									height="275" />
							</c:forEach>
							<!-- Product details-->
							<div class="card-body p-4">
								<div class="text-center">
									<!-- Product name-->
									<h5 class="fw-bolder">${board.bo_name}</h5>
									리뷰개수(${board.bo_review })
									<!-- Product reviews-->
									<div
										class="d-flex justify-content-center small text-warning mb-2">
										<div class="bi-star-fill"></div>
										<div class="text-primary">()</div>
									</div>
									<!-- Product price-->
									${board.bo_price }원
								</div>
							</div>
							<!-- Product actions-->
							<div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
								<div class="text-center">
									<a class="btn btn-outline-dark mt-auto"
										href="<c:url value='/board/detail${pm.cri.currentUrl}&bo_num=${board.bo_num}'/>">구매하기</a>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</section>
	<!-- End Hero Area -->

	<!-- Start Shipping Info -->
	<section class="shipping-info">
		<div class="container">
			<ul>
				<!-- Free Shipping -->
				<li>
					<div class="media-icon">
						<i class="lni lni-delivery"></i>
					</div>
					<div class="media-body">
						<h5>Free Shipping</h5>
						<span>On order over $99</span>
					</div>
				</li>
				<!-- Money Return -->
				<li>
					<div class="media-icon">
						<i class="lni lni-support"></i>
					</div>
					<div class="media-body">
						<h5>24/7 Support.</h5>
						<span>Live Chat Or Call.</span>
					</div>
				</li>
				<!-- Support 24/7 -->
				<li>
					<div class="media-icon">
						<i class="lni lni-credit-cards"></i>
					</div>
					<div class="media-body">
						<h5>Online Payment.</h5>
						<span>Secure Payment Services.</span>
					</div>
				</li>
				<!-- Safe Payment -->
				<li>
					<div class="media-icon">
						<i class="lni lni-reload"></i>
					</div>
					<div class="media-body">
						<h5>Easy Return.</h5>
						<span>Hassle Free Shopping.</span>
					</div>
				</li>
			</ul>
		</div>
	</section>
	<!-- End Shipping Info -->


</body>
</html>
