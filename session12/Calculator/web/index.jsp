<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 6/17/2019
  Time: 8:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form method="post" action="/calculate">
    <div id="data">
      <label>First operand: </label>
      <input type="text" name="first_operand"><br>
      <label>Operator: </label>
      <select name="operator">
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">Multiplication</option>
        <option value="/">Division</option>
      </select>
      <br>
      <label>Second Operand: </label>
      <input type="text" name="second_operand"><br>
      <input type="submit" value="Calculate">
    </div>
  </form>
  </body>
</html>
