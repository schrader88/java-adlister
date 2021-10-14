<%--
  Created by IntelliJ IDEA.
  User: schrader
  Date: 10/14/21
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My First JSP</title>
</head>
<body>
    <%
//    String myName = "Kyle";
    String firstName = (request.getParameter("firstName") != null) ? request.getParameter("firstName") : "";
    %>

    <h1>My first name is: <span class="my-name"><%= firstName %></span></h1>
    <%@include file="my-first-fragment.html"%>
</body>
</html>
