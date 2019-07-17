<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 7/17/2019
  Time: 8:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator application</title>
</head>
<body>
<h1>Calculator</h1>
<form method="get" action="/calculator">
    <fieldset>
        <legend>Calculator</legend>
        <div>
            <input type="text" name="textbox1"/>&nbsp;
            <input type="text" name="textbox2"/>
        </div>
        <div>
            <button name="button" type="submit" value="+">Addition(+)</button>&nbsp;
            <button name="button" type="submit" value="-">Subtraction(-)</button>&nbsp;
            <button name="button" type="submit" value="*">Multiplication(x)</button>&nbsp;
            <button name="button" type="submit" value="/">Division(/)</button>
        </div>
    </fieldset>

</form>
<h3>${result}</h3>
</body>
</html>
