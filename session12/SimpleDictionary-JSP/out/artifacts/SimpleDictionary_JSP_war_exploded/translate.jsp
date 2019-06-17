<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 6/17/2019
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate page</title>
</head>
<body>
<%
    Map<String, String> dictionary = new HashMap<>();
    dictionary.put("Hello", "Xin chào");
    dictionary.put("Good bye", "Tạm biệt");
    dictionary.put("School", "Trường học");

    String search = request.getParameter("english_word");
    String result = dictionary.get(search);

    if (result != null) {
        out.println("Word: " + search);
        out.println("Result: " + result);
    } else {
        out.println("Not found");
    }
%>
</body>
</html>
