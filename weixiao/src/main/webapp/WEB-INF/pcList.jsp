<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2022/5/19
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<body>

    用户信息
    <br>
<%--    数组 或对象集合中的每个元素重复一个嵌入语句组。--%>
    <c:forEach items="${pcList }" var="pc">
        ${pc.id }&nbsp;&nbsp;&nbsp;&nbsp;
       姓名= ${pc.name }&nbsp;&nbsp;&nbsp;&nbsp;
       年龄= ${pc.age }&nbsp;&nbsp;&nbsp;&nbsp;
       类型= ${pc.type }&nbsp;&nbsp;&nbsp;&nbsp;
       性别 ${pc.sex }&nbsp;&nbsp;&nbsp;&nbsp;
       学校= ${pc.school }<br>
    </c:forEach>

</body>
</html>
