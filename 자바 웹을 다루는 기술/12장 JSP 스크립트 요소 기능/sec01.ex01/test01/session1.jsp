<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// session 객체에 바인딩된 name값을 가져옴
	String name = (String)session.getAttribute("name");
	// session 객체에 address를 바인딩
	session.setAttribute("address","서울시 강동구");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 테스트</title>
</head>
<body>
	이름은 <%=name %>입니다. <br>
	<a href=session2.jsp>두 번째 페이지로 이동</a>
</body>
</html>