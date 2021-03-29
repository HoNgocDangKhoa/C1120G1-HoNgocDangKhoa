<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/23/2021
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add New </title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>

String PHONE_VALIDATE = "^\\([\\d]{2}\\)-\\([0][\\d]{9}\\)$"
String  EMAIL = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

private static final String REGEX_CUSTOMER_ID = "^(KH-)\\d{4}$";
private static final String REGEX_PHONE = "^(09|\\(84\\)\\+9)[01]\\d{7}$";
private static final String REGEX_DATE = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|" +
"((29|30)[\\/](0[4,6,9]|11)))[\\/]([2-9][0-9]\\d\\d|19\\d[1-9])$)|" +
"(^29[\\/]02[\\/]((19|[2-9][0-9])(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)|[2-9][0-9]00)$)";
private static final String REGEX_ID_CARD = "^\\d{9}|\\d{12}$";
private static final String REGEX_EMAIL = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
}


<h1 style="text-align: center" >Add New Customer</h1>
<div class="w-50 mx-auto">
    <form method="post">

        <div class="form-group">
            <label for="id_customer">Id Customer:</label>
            <input type="text" name="idCus" size="45" class="form-control" id="id_customer">
        </div>

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
            <input type="text" name="nameCus" size="45" class="form-control" id="name_customer">
        </div>

        <div class="form-group">
            <label for="birthday_customer">BirthDay Customer:</label>
            <input type="text" name="birthDayCus" size="45" class="form-control" id="birthday_customer">
        </div>

        <div class="form-group">
            <label for="gender_customer">Gender Customer</label>
            <select class="form-control" name="genderCus" id="gender_customer">
                <option value="true">Male</option>
                <option value="false">Female</option>
            </select>
        </div>

        <div class="form-group">
            <label for="id_CardCustomer">IdCard Customer:</label>
            <input type="text" name="idCardCus" size="45" class="form-control" id="id_CardCustomer">
        </div>

        <div class="form-group">
            <label for="phone_customer">Phone Customer:</label>
            <input type="text" name="phoneCus" size="45" class="form-control" id="phone_customer">
        </div>

        <div class="form-group">
            <label for="email_Customer">Email Customer:</label>
            <input type="text" name="emailCus" size="45" class="form-control" id="email_Customer">
        </div>

        <div class="form-group">
            <label for="address_customer">Address Customer:</label>
            <input type="text" name="addressCus" size="45" class="form-control" id="address_customer">
        </div>


        <button type="submit" class="btn btn-success" name="action" value="edit">Add new</button>
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
