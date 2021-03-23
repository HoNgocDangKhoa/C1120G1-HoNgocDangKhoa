
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/17/2021
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customer?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
  <c:forEach items="${customerList}" var="customer">
        <tr>
            <td><a href="customer?action=view&id=${customer.getId()}">${customer.name}</a></td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
            <td><a href="customer?action=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="customer?action=delete&id=${customer.getId()}">delete</a></td>
        </tr>
  </c:forEach>
</table>
</body>
</html>
