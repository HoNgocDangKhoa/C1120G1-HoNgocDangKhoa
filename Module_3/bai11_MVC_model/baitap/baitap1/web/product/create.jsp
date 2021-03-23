<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/18/2021
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<h1>Create new product</h1>
<%--<p>--%>
<%--    <c:if test='${"message" != null}'>--%>
<%--        <span class="message">${"message"}</span>--%>
<%--    </c:if>--%>
<%--</p>--%>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>product information</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td><input type="text" name="id" id="id"></td>
            </tr>
            <tr>
                <td>Name Product: </td>
                <td><input type="text" name="nameProduct" id="name"></td>
            </tr>
            <tr>
                <td>Price Product: </td>
                <td><input type="text" name="priceProduct" id="price"></td>
            </tr>
            <tr>
                <td>Amount Product: </td>
                <td><input type="text" name="amountProduct" id="amount"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
