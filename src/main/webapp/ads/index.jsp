<%--
  Created by IntelliJ IDEA.
  User: schrader
  Date: 10/18/21
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View All Ads</title>
    <style>
        div {
            border: 2px solid black;
        }
    </style>
</head>
<body>
    <h1>Ads List</h1>

    <c:forEach var="ads" items="${ads}">
        <div>
            <p>Ad Title: ${ads.title}</p>
            <p>Ad Description: ${ads.description}</p>
        </div>
    </c:forEach>
</body>
</html>
