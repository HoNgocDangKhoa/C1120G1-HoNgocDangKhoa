<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/20/2021
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap 4 Website Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="js/bootstrap.min.js">
  <style>
    .fakeimg {
      height: 200px;
      background: #aaa;
    }
  </style>
</head>
<body>

<div class="jumbotron text-center" style="margin-bottom:0" >
  <a href="https://www.agoda.com/vi-vn/?cid=1891453&tag=26b932a7-0d36-a32b-8d98-f99b15e43afe&ckuid=94963b88-4b37-4690-9deb-91ea16a693de" style="float:left;"  >
    <img src="https://nhanlucnganhluat.vn/uploads/images/051D288B/logo/2018-12/Logo-FURAMA-RESORT.jpg" style="width: 200px;height: 50px"></a>
  <h5 style="text-align: right">Hồ Ngọc Đăng Khoa</h5 >
</div>

<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #17a2b8">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
    <b class="navbar-brand" href="#">Home</b>
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="/customer">Customer <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="/employee">Employee</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link " href="/service">Service</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link " href="/contract"> Contract </a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

<div class="container-fluid" style="margin-top:30px">
  <div class="row">
    <div class="col-sm-2">

      <h3>Some Links</h3>
      <ul class="nav nav-pills flex-column">
        <li class="nav-item">
          <a class="nav-link active" href="https://dulichkhampha24.com/furama-resort-danang.html">Active</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#">Disabled</a>
        </li>
      </ul>
      <hr class="d-sm-none">
      <div>
        <a href="https://www.agoda.com/vi-vn/?cid=1891453&tag=26b932a7-0d36-a32b-8d98-f99b15e43afe&ckuid=94963b88-4b37-4690-9deb-91ea16a693de">
          <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVvoFVbWnbLCgSP6swg92JdWD8pyLPwMEXme7Ylsw2RxFVTizM&usqp=CAU" style="height: 100px;width: 100Px">
        </a>
      </div>
    </div>
    <div class="col-sm-10">
      <h2>Furama Đà Nẵng</h2>
      <div>
        <a href="https://www.agoda.com/vi-vn/?cid=1891453&tag=26b932a7-0d36-a32b-8d98-f99b15e43afe&ckuid=94963b88-4b37-4690-9deb-91ea16a693de"> <img src="https://dulichkhampha24.com/wp-content/uploads/2020/07/Furama-Resort-Danang-c.jpg" style=" height: 600Px; width: 100%" ></a>
      </div>
      <div>
      <p style="color: #a71d2a">
        KHU NGHỈ DƯỠNG ĐẲNG CẤP THẾ GIỚI FURAMA ĐÀ NẴNG, TỰ HÀO LÀ KHU NGHỈ DƯỠNG ẨM THỰC TẠI VIỆT NAM</p>

      </div>
      <h2>TITLE HEADING</h2>
      <h5>Title description, Sep 2, 2017</h5>
      <div class="fakeimg">
        <a href="https://www.agoda.com/vi-vn/?cid=1891453&tag=26b932a7-0d36-a32b-8d98-f99b15e43afe&ckuid=94963b88-4b37-4690-9deb-91ea16a693de">
          </a>
      </div>

      <p>Some text..</p>
    </div>
  </div>
</div>

<div class="jumbotron text-center" style="margin-bottom:0">

</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

