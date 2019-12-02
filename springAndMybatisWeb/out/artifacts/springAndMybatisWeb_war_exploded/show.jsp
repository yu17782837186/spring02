<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2019/12/2
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="a">
        ${a.id} ${a.portName} ${a.cityName}<br />
    </c:forEach>
</body>
</html>
