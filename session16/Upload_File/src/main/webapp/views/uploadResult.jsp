<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 7/17/2019
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Upload Result</title>
</head>
<body>
<jsp:include page="index.jsp"/>
<h3>Uploaded Files:</h3>
Description: ${description}
<br/>
<c:forEach items="${uploadedFiles}" var="file">
    - ${file} <br>
</c:forEach>
</body>
</html>
</body>
</html>
