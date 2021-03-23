<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/18/2021
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <a href="/customers">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
