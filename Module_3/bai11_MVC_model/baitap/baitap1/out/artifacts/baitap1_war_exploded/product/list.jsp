<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/14/2021
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List product</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/product?action=create">Create new product</a>
</p>
<span>
    <form method="post">
        <input type="text" name="search" id="search">
        <button>Search</button>
        <input type="hidden" name="action" value="search">
    </form>

</span>
<table border="1">
    <tr>
        <th>Id Product</th>
        <th>Name Product</th>
        <th>Price Product</th>
        <th>Amount Product</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${productList}" var="productList">
        <tr>
            <td><a href="product?action=view&id=${productList.getId()}">${productList.getId()}</a></td>
            <td>${productList.nameProduct}</td>
            <td>${productList.priceProduct}</td>
            <td>${productList.amountProduct}</td>
            <td><a href="product?action=edit&id=${productList.getId()}">edit</a></td>
            <td><a href="product?action=delete&id=${productList.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
