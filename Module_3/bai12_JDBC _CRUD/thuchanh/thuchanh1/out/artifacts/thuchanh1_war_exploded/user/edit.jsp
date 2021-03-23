<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/19/2021
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit User</title>
</head>
<body>
<div class="container">
    <h1>Edit User</h1>

    <fieldset>
        <legend>User Information</legend>
        <form method="post">
            <table class="table table-hover">
                <tr>
                    <th>Name</th>
                    <td><input type="text" name="name" id="name" value="${requestScope["user"].getName()}"></td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td><input type="text" name="email" id="email" value="${requestScope["user"].getEmail()}"></td>
                </tr>
                <tr>
                    <th>Country</th>
                    <td><input type="text" name="country" id="country" value="${requestScope["user"].getCountry()}"></td>
                </tr>
                <tr>
                    <td><a type="button" class="btn btn-info" href="/user">Back</a></td>
                    <td><button type="submit" class="btn btn-danger">Edit</button></td>
                   <input name="action" value="edit" hidden>
                   <input name="id" value="${requestScope["user"].getId()}" hidden>
                </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>
