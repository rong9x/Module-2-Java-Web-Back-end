<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 6/19/2019
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product detail</title>
</head>
<body>
<h1>Product detail</h1>
<p>
    <a href="/products">Back to list product</a>
</p>
<fieldset>
    <legend>Product detail</legend>
    <table>
        <tr>
            <td>Product name: </td>
            <td>${requestScope["product"].getProductName()}</td>
        </tr>
        <tr>
            <td>Product type: </td>
            <td>${requestScope["product"].getProductType()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${requestScope["product"].getPrice()}</td>
        </tr>
    </table>
</fieldset>
</body>
</html>
