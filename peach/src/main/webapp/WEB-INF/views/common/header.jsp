<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<title>스프링</title>
</head>
<body>
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
</body>
<style>
    .btn-insert {
        position: fixed;
        top: 10px; /* 상단 여백 조정 */
        right: 10px; /* 오른쪽 여백 조정 */
    }  
</style>
</html>

