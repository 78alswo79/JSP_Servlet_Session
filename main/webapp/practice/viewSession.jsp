<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "util.MemberInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member 세션 정보 뿌려주기 화면입니다.</title>
</head>
<body>
<%
	if (session.getAttribute("memberInfo") != null) {
		MemberInfo member = (MemberInfo)session.getAttribute("memberInfo");
%>
아이디 : <%= member.getId() %>
패스워드 : <%= member.getPw() %>
이름 : <%= member.getName() %>
이메일 : <%= member.getEmail() %>
<% } else {	%>
세션 정보가 들어있지 않습니다.
<%
	}
%>
</body>
</html>