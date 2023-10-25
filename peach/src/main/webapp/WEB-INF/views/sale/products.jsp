<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<title>스프링</title>
</head>
<body>	
	
	    <c:forEach items="${prList}" var="pr">
		    <div class="product">
		        <img class="item" src="<c:url value='/resources/img/${pr.imageVOList.size() != 0 ? pr.imageVOList.get(0).si_name :\"\" }'/>">
		        <h3>${pr.sb_name}</h3>
		        <p>${pr.sb_price}</p>
		        <p>${pr.sb_date}</p>
		    </div>
	    </c:forEach>  
    		<!-- 댓글 페이지네이션 -->
		<ul class="pagination">
			<c:if test="${pm.prev}">
				<li class="page-item">
					<a class="page-link" href="<c:url value='/sale/${pm.cri.sc_num}${pm.cri.getUrl(pm.startPage-1)}'/>">이전</a>
				</li>
			</c:if>
			<c:forEach begin="${pm.startPage}" end="${pm.endPage}" var="i">
				<c:choose>
		            <c:when test="${i == pm.cri.page}">
		                <li class="page-item current "> <!-- 현재 페이지일 때 current 클래스 추가 -->
		                    <a class="page-link" href="<c:url value='/sale/${pm.cri.sc_num}${pm.cri.getUrl(i)}'/>">${i}</a>
		                </li>
		            </c:when>
		            <c:otherwise>
		                <li class="page-item">
		                    <a class="page-link" href="<c:url value='/sale/${pm.cri.sc_num}${pm.cri.getUrl(i)}'/>">${i}</a>
		                </li>
		            </c:otherwise>
        		</c:choose>
			</c:forEach>
			<c:if test="${pm.next}">
				<li class="page-item">
					<a class="page-link" href="<c:url value='/sale/${pm.cri.sc_num}${pm.cri.getUrl(pm.endPage+1)}'/>">다음</a>
				</li>
			</c:if>
		</ul>	
		${prList};
	</body>
	<style>
		body {
	    font-family: Arial, sans-serif;
		}
	
		.product {
		    border: 1px solid #ccc;
		    margin: 10px;
		    padding: 10px;
		    width: 250px;
		    text-align: center;
		    display: inline-block;
		}
		
		.product img {
		    max-width: 100%;
		}
		
		.product button {
		    background-color: #007bff;
		    color: #fff;
		    border: none;
		    cursor: pointer;
		}
		.pagination {
	   		display: flex; /* 페이지 번호를 가로로 배열하기 위한 스타일 */
	   		justify-content: center; /* 페이지 번호 중앙 정렬 */
	   		list-style-type: none;
		}
		.page-item {
		    margin: 0 3px; /* 페이지 번호 간격 설정 */
		}
		.page-link{
		    width: 33px;
		    height: 33px;
		    display: flex;
		    -webkit-box-pack: center;
		    justify-content: center;
		    -webkit-box-align: center;
		    align-items: center;
		    margin-right: 12px;
		    border: 1px solid rgb(204, 204, 204);
		    background: rgb(255, 255, 255);
		    border-radius: 2px;
		    color: rgb(155, 153, 169);
		    text-decoration: none;
		}
		.pagination li.current a {
		    background-color: #F16461;
		    color: #fff;
		}
	</style>
</html>