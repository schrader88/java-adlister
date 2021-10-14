<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="entity.Person" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person addedPerson = new Person(4, "Jenna", "Hays", 26);

    request.setAttribute("addedPerson", addedPerson);
%>

<h2>Added Person</h2>
    <ul>
        <li>Person ID: ${addedPerson.id}</li>
        <li>First Name: ${addedPerson.firstName}</li>
        <li>Last Name: ${addedPerson.lastName}</li>
        <li>Age: ${addedPerson.age}</li>
    </ul>
</body>
</html>
