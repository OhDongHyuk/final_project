<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row align-items-center">
			<div class="col-lg-8 col-md-6 col-12">
				<form action="<c:url value='/member/signup'/>" method="post">
					<div class="form-group">
						<label>아이디</label> <label id="check-id-error" class="error"></label>
						<input type="text" class="form-control" name="me_id">
					</div>
					<div class="form-group">
						<label>비번</label> <input type="password" class="form-control"
							name="me_pw" id="pw">
					</div>
					<div class="form-group">
						<label>비번 확인</label> <input type="password" class="form-control"
							name="me_pw2">
					</div>
					<div class="form-group">
						<label>이름</label> <input type="text" class="form-control"
							name="me_name">
					</div>
					<div class="form-group">
						<label>닉네임</label> <input type="text" class="form-control"
							name="me_nick">
					</div>
					<div class="form-group">
						<label>핸드폰 번호</label> <input type="text" class="form-control"
							name="me_phone">
					</div>
					<div class="form-group">
						<label>계좌번호</label> <input type="text" class="form-control"
							name="me_acc">
					</div>
					<button class="btn btn-sighup btn-outline-warning col-12">회원가입</button>
				</form>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
	
	</script>
</body>
</html>