<%--
  Created by IntelliJ IDEA.
  User: schrader
  Date: 10/14/21
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login.jsp" method="POST">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" placeholder="Enter Username...">
    <label for="password">Password:</label>
    <input type="password" name="password" id="password" placeholder="Enter Password...">
    <button type="submit">Submit</button>

    <%
        try {
            while (request.getParameter("username") != null && request.getParameter("password") != null) {
                if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
                    response.sendRedirect("/profile.jsp");
                } else {
                    response.sendRedirect("/login.jsp");
                }
            }
        } catch (Exception e) {

        }

//       if (request.getParameter("username") != null && request.getParameter("password") != null) {
//           if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
//               response.sendRedirect("/profile.jsp");
//           } else {
//               response.sendRedirect("/login.jsp");
//           }
//       }
    %>
</form>
</body>
</html>
