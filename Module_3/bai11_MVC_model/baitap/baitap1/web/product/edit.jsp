<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/18/2021
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Product</h1>
<%--<p>--%>
<%--    <c:if test='${requestScope["message"] != null}'>--%>
<%--        <span class="message">${requestScope["message"]}</span>--%>
<%--    </c:if>--%>
<%--</p>--%>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Id Product: </td>
                <td><input type="text" name="id" id="id" value="${requestScope["product"].getId()}"></td>
            </tr>

            <tr>
                <td>Name Product: </td>
                <td><input type="text" name="nameProduct" id="name" value="${requestScope["product"].getNameProduct()}"></td>
            </tr>
            <tr>
                <td>Price Product: </td>
                <td><input type="text" name="priceProduct" id="price" value="${requestScope["product"].getPriceProduct()}"></td>
            </tr>
            <tr>
                <td>Amount Product: </td>
                <td><input type="text" name="amountProduct" id="amount" value="${requestScope["product"].getAmountProduct()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>

</body>
</html>
