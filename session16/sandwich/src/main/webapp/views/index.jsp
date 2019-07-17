<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 7/16/2019
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<h1>Sandwich condiments</h1>
<form method="get" action="/result">
    <p>
        <input type="checkbox" name="condiments" value="Lettuce"/>
        <label>Lettuce</label>&nbsp;
        <input type="checkbox" name="condiments" value="Tomato"/>
        <label>Tomato</label>&nbsp;
        <input type="checkbox" name="condiments" value="Mustard"/>
        <label>Mustard</label>&nbsp;
        <input type="checkbox" name="condiments" value="Sprouts"/>
        <label>Sprouts</label>
    </p>
    <span>
    <input type="submit" value="Save"/>
  </span>
</form>
</body>
</html>
