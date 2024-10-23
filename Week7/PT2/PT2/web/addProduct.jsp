<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add Product</title>
</head>
<body>
<h1>Add Product!</h1>
<form action="addProduct" method="post">
    Product Name: <input type="text" name="productName" /><br/>
    Unit: <input type="text" name="unit" /><br/>
    Category:
    <select name="categoryId">
        <c:forEach var="category" items="${categories}">
            <option value="${category.categoryId}">${category.categoryName} - ${category.description}</option>
        </c:forEach>
    </select><br/>
    Price: <input type="text" name="price" /><br/>
    <input type="submit" value="Add"/>
</form>
</body>
</html>
