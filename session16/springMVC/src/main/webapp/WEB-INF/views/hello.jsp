<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 7/15/2019
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Page</title>
</head>
<body>
<h2>${message}</h2>
<h3>Email validate</h3>
<form action="validate" method="post">
    <table>
        <tr>
            <td><label>Email </label></td>
            <td><input type="text" name="email"><br></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Check validate"></td>
        </tr>
    </table>
</form>
<h2>${notification}</h2>
</body>
</html>
