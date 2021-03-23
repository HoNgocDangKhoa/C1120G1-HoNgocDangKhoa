
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/20/2021
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
<%--    <link rel="stylesheet" href="css/bootstrap.min.css">--%>
<%--    <link rel="stylesheet" href="js/bootstrap.min.js">--%>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<h1 style="text-align: center; color: #1e7e34" >List Customer</h1>
<%--<ul class="nav justify-content-center">--%>
<%--    <li class="nav-item">--%>

<%--    </li>--%>


<%--</ul>--%>
<nav class="navbar navbar-light bg-light justify-content-between">
    <th><a href="/customer?action=save"><button type="button" class="btn btn-warning">Add New Customer</button></a></th>
    <form class="form-inline" method="get" >
        <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search" name="search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit" name="action" value="search" >Search</button>
    </form>
</nav>


<table id="customer" class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id Customer</th>
        <th scope="col">Customer Type</th>
        <th scope="col">Name Customer</th>
        <th scope="col">BirthDay Customer</th>
        <th scope="col">Gender</th>
        <th scope="col">Id CardCus</th>
        <th scope="col">Phone Cus</th>
        <th scope="col">Email Cus</th>
        <th scope="col">Address Cus</th>
        <th scope="col">Edit Customer</th>
        <th scope="col">Delete Customer</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
    <tr>

        <td>${customer.getIdCustomer()}</td>
        <td>${customer.getCustomerType().getNameCustomer_type()}</td>
        <td>${customer.getNameCustomer()}</td>
        <td>${customer.getBirthDayCustomer()}</td>
        <td>${customer.isGender() ? "Male":"Female"}</td>
        <td>${customer.getIdCardCus()}</td>
        <td>${customer.getPhoneCus()}</td>
        <td>${customer.getEmailCus()}</td>
        <td>${customer.getAddressCus()}</td>
        <td><a href="/customer?action=edit&id=${customer.getIdCustomer()}"> <button type="button" class="btn btn-danger">Edit</button></a></td>
        <td><a href="/customer?action=delete&id=${customer.getIdCustomer()}"><button type="button" class="btn btn-warning" >Delete</button></a></td>

    </tr>
    </c:forEach>
    </tbody>
</table>

<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../bootstrap413/js/popper.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../bootstrap413/js/bootstrap.min.js"></script>
<script src="../bootstrap413/js/bootstrap.bundle.js"></script>

<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>--%>
<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>--%>

<script>
    $(document).ready(function () {
        $('#customer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        })
    })
</script>
</body>
</html>
