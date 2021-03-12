<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/11/2021
  Time: 10:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Simple calculator</h1>
  <form action="/Calculator" method="post">
    <h3>calculator</h3>
    <table>
      <tr>
        <td>First Operand</td>
        <td><input type="text" name="first-operand" ></td>
      </tr>
      <tr>
        <td>Operator:</td>
        <td>
          <select name="operator" >
            <option value="+">addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>Second Operator</td>
        <td>
          <input type="text" name="second-operand">
        </td>
      </tr>
      <tr>
        <td>
          <input type="submit" value="Calculator">
        </td>
      </tr>
    </table>

  </form>
  </body>
</html>
