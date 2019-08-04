<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tommo
  Date: 2019-08-04
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<table>
    <tr>
        <th>Id.</th>
        <th>Name</th>
        <th>Type</th>
        <th>Avaliable</th>
    </tr>
    <c:forEach items="${sessionScope.tools}" var="tools" varStatus="loop">
        <tr>
            <td>${tools.id}</td>
            <td>${tools.name}</td>
            <td>${tools.type}</td>
            <td>${tools.avaliable}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
