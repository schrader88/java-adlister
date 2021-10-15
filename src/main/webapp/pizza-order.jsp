<%--
  Created by IntelliJ IDEA.
  User: schrader
  Date: 10/15/21
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<form method="POST">
    <h3>Crust: </h3>
    <label for="crust">Choose Crust:</label>
    <select name="crust" id="crust">
        <option value="thin">Thin</option>
        <option value="regular">Regular</option>
        <option value="cheese">Cheese Filled</option>
    </select>
    <h3>Sauce: </h3>
    <label for="sauce">Choose Sauce:</label>
    <select name="sauce" id="sauce">
        <option value="alfredo">Alfredo</option>
        <option value="regular">Regular</option>
        <option value="none">No Sauce</option>
    </select>
    <h3>Size: </h3>
    <label for="size">Choose Size:</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <h3>Toppings: </h3>
    <input type="checkbox" id="pepperoni" name="pepperoni" value="Pepperoni">
    <label for="pepperoni">Pepperoni</label>
    <input type="checkbox" id="sausage" name="sausage" value="Sausage">
    <label for="sausage">Sausage</label>
    <input type="checkbox" id="bell-peppers" name="bell-peppers" value="Bell Peppers">
    <label for="bell-peppers">Bell Peppers</label>
    <input type="checkbox" id="pineapple" name="pineapple" value="Pineapple">
    <label for="pineapple">Pineapple</label>
    <input type="checkbox" id="olives" name="olives" value="Olives">
    <label for="olives">Olives</label>
    <h3>Address: </h3>
    <label for="address">Please enter your address: </label>
    <input type="text" name="address" id="address">
</form>
</body>
</html>
