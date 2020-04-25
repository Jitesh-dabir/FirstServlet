<%--
  Created by IntelliJ IDEA.
  User: Sanket
  Date: 4/25/2020
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login success page</title>
</head>
<body>
<h1> Hi <%
    out.println("<b>" + request.getAttribute("user") + "</b>");
%> Login success.</h1>
<a href="Login.html">Login page</a>
</body>
</html>
