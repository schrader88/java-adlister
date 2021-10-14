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
<c:forEach var="people" items="${people}">
    <table>
        <tr>
            <th>Person #${people.id}</th>
        </tr>
        <tr>
            <td>First Name: ${people.firstName}</td>
        </tr>
        <tr>
            <td>Last Name: ${people.lastName}</td>
        </tr>
        <tr>
            <td>Age: ${people.age}</td>
        </tr>
    </table>
</c:forEach>

<%@include file="display-extra-person.jsp"%>

</body>
</html>
