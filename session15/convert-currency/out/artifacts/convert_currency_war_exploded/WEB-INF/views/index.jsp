<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 7/10/2019
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Convert Currency</title>
  </head>
  <body>
  <form method="get" action="/result">
    <h3>Convert USD to VND</h3>
    <label>Amount (in USD): </label>
    <input type="text" name="amount" id="amount"><br>
    <label>Rate: </label>
    <input type="text" name="rate" id="rate"><br>
    <input type="submit" value="Convert">
  </form>
  </body>
</html>
