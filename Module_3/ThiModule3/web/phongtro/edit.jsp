<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/23/2021
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>


<div style="text-align: center">
    <h2 style="color: deeppink">
        Edit Customer
    </h2>

</div>

<div class="w-50 mx-auto">
    <form method="post">

        <div class="form-group">
            <label for="id_customer">Id Customer:</label>
            <input type="text" name="idCus" size="45"
                   value="${customer.getIdCustomer()}" class="form-control" id="id_customer">
        </div>
        <%--        <div class="form-group">--%>
        <%--            <label for="type_customer">Customer type:</label>--%>
        <%--            <input type="text" name="Cus_type" size="45"--%>
        <%--                   value="${customer.getCustomerType().getNameCustomer_type()}" class="form-control"--%>
        <%--                   id="type_customer">--%>
        <%--        </div>--%>
        <div class="form-group">
            <label for="Cus_type">Customer type:</label>
            <select class="form-control" name="Cus_type" id="Cus_type">
                <option value="1">Diamond</option>
                <option value="2">Platinium</option>
                <option value="3">Gold</option>
                <option value="4">Silver</option>
                <option value="5">Member</option>
            </select>
        </div>
        <div class="form-group">
            <label for="name_customer">Name Customer:</label>
            <input type="text" name="nameCus" size="45"
                   value="${customer.getNameCustomer()}" class="form-control" id="name_customer">
        </div>
        <div class="form-group">
            <label for="birthday_customer">BirthDay Customer:</label>
            <input type="text" name="birthDayCus" size="45"
                   value="${customer.getBirthDayCustomer()}" class="form-control" id="birthday_customer">
        </div>

        <div class="form-group">
            <label for="gender_customer">Gender Customer</label>
            <select class="form-control" name="genderCus" id="gender_customer">
                <option value="true" ${cutomer.isGender() ? 'selected':''}>Male</option>
                <option value="false"  ${cutomer.isGender() ? '':'selected'}>Female</option>
            </select>
        </div>
        <div class="form-group">
            <label for="id_CardCustomer">IdCard Customer:</label>
            <input type="text" name="idCardCus" size="45"
                   value="${customer.getIdCardCus()}" class="form-control" id="id_CardCustomer">
        </div>
        <div class="form-group">
            <label for="phone_customer">Phone Customer:</label>
            <input type="text" name="phoneCus" size="45"
                   value="${customer.getPhoneCus()}" class="form-control" id="phone_customer">
        </div>
        <div class="form-group">
            <label for="email_Customer">Email Customer:</label>
            <input type="text" name="emailCus" size="45"
                   value="${customer.getEmailCus()}" class="form-control" id="email_Customer">
        </div>
        <div class="form-group">
            <label for="address_customer">Address Customer:</label>
            <input type="text" name="addressCus" size="45"
                   value="${customer.getAddressCus()}" class="form-control" id="address_customer">
        </div>


        <button type="submit" class="btn btn-success" name="action" value="edit">Edit</button>
        <button type="submit" class="btn btn-success" name="action" value="customer">Back</button>
    </form>
</div>








<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../bootstrap413/js/popper.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../bootstrap413/js/bootstrap.min.js"></script>
<script src="../bootstrap413/js/bootstrap.bundle.js"></script>

</body>
</html>
