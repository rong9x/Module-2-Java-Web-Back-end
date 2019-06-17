<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 6/17/2019
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Vietnamese Dictionary</title>
  </head>
  <body>
  <h1>Vietnamese Dictionary</h1>
  <form action="/translate.jsp" method="post">
    <input type="text" name="english_word" placeholder="Enter your word:">
    <input type="submit" value="Search">
  </form>
  </body>
</html>
