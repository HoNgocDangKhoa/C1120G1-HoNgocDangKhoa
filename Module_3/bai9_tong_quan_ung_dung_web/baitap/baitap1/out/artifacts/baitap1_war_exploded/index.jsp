<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/10/2021
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="" method="post">
    <table>
      <tr>
        <td><p>Product Description</p> </td>
        <td>
          <input type="text" name="Description" size="15"  placeholder="mo ta cua san pham" />
        </td>
      </tr>
      <tr>
        <td><p>List Price</p></td>
         <td> <input type="text" name="Price" size="10"  placeholder="gia niem yet" /></td>

      </tr>
      <tr>
        <td><p>Discount Percent</p> </td>
          <td><input type="text" name="Percent" size="10"  placeholder="ti le chiet xuat" /></td>

      </tr>
      <tr>
        <td><input type="submit" value=" Calculate Discount"/></td>
      </tr>
    </table>

  </form>
  </body>
</html>
