<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="entity.Person" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>entity.Person List</title>
</head>
<body>

<style>
    <%@include file="external-stylesheet.css"%>
</style>

<%
    List<Person> people = new ArrayList<>(Arrays.asList(
            new Person(1, "Kyle", "Schrader", 24),
            new Person(2, "Joseph", "Congdon", 28),
            new Person(3, "Ignacio", "Mares", 28)
    ));

    request.setAttribute("people", people);
%>

<h1>People</h1>

<table>
    <tr>
        <th>Person ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Person ID</th>
    </tr>
    <c:forEach var="people" items="${people}">
        <tr>
            <td>${people.id}</td>
            <td>${people.firstName}</td>
            <td>${people.lastName}</td>
            <td>${people.age}</td>
        </tr>
    </c:forEach>
</table>

<%@include file="display-extra-person.jsp"%>

</body>
</html>
