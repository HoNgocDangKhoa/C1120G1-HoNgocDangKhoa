<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/11/2021
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student List</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>
<div class="container">
    <h2>Customer List</h2>
    <c:if test="${empty customerList}">
        <h3> Customer list empty</h3>
    </c:if>
    <c:if test="${not empty customerList}">
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">ten</th>
            <th scope="col">ngay sinh</th>
            <th scope="col">dia chi</th>
            <th scope="col">anh</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <th scope="row">${customer.ten}</th>
                <td>${customer.ngaySinh}</td>
                <td>${customer.diaChi}</td>
                <td>
                    <img src="../${customer.anh}" width="50px" height="50px">
                        </td>
            </tr>
        </c:forEach>


        </tbody>
    </table>
        </c:if>
</div>
</body>
</html>
