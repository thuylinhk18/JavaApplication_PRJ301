<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Of Category</title>
</head>
<body>
<h1>List Of Category!</h1>
<table border="1">
    <tr>
        <th>Category ID</th>
        <th>Category Name</th>
        <th>Description</th>
    </tr>
    <c:forEach var="category" items="${categories}">
        <tr>
            <td>${category.categoryId}</td>
            <td>${category.categoryName}</td>
            <td>${category.description}</td>
        </tr>
    </c:forEach>
</table>
<a href="addCategory">Add Category</a>
<a href="productList">List Product</a>
</body>
</html>
