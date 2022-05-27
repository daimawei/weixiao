<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2022/5/19
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/select" method="post">
    输入用户名：<input type="text" name="name"/><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>