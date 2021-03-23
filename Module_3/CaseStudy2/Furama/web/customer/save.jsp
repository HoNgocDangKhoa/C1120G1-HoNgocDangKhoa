<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/22/2021
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save Customer</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="js/bootstrap.min.js">
</head>
<body>

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








<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
