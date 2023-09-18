<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-15
  Time: 오전 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="../component/header.jsp"%>
<%@include file="../component/nav.jsp"%>
<form action="/member/login" method="post">
    <input type="text" name="memberEmail" placeholder="이메일 입력하세요"> <br>
    <input type="text" name="memberPassword" placeholder="비밀번호 입력하세요"> <br>
    <input type="submit" value="로그인">
</form>
<%@include file="../component/footer.jsp"%>
</body>
</html>
