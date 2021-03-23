<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/18/2021
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<table>
    <tr>
    <td>Id Product: </td>
    <td>${requestScope["product"].getId()}</td>
</tr>
    <tr>
        <td>Name Product: </td>
        <td>${requestScope["product"].getNameProduct()}</td>
    </tr>
    <tr>
        <td>Price Product: </td>
        <td>${requestScope["product"].getPriceProduct()}</td>
    </tr>
    <tr>
        <td>Amount Product: </td>
        <td>${requestScope["product"].getAmountProduct()}</td>
    </tr>
</table>
</body>
</html>
