<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tommo
  Date: 2019-08-04
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>

<style>
    table, th, td {
        border: 1px solid black;
    }
    .red {
        background-color: red;
    }
    .green {
        background-color: green;
    }
</style>




<style>
    table, th, td {
        border: 1px solid black;
    }
</style>

<body>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Type</th>
        <th>Available</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${requestScope.tools}" var="tool">
        <tr>
            <td>${tool.id}</td>
            <td>${tool.name}</td>
            <td>${tool.type}</td>
            <td class="${tool.available ? 'green' : 'red'}"></td>
            <td>
                <form>
                <input type="submit" value="${tool.available ? 'Take' : 'Return'}">
                </form>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
