<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 6/20/2019
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show list product</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>Product name</td>
        <td>Description</td>
        <td>Amount</td>
        <td>Sell Price</td>
        <td>Cost</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${requestScope['products']}" var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getIdProduct()}">${product.getProductName()}</a></td>
            <td>${product.getDescription()}</td>
            <td>${product.getAmount()}</td>
            <td>${product.getSellPrice()}</td>
            <td>${product.getCost()}</td>
            <td><a href="/products?action=edit&id=${product.getIdProduct()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getIdProduct()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
