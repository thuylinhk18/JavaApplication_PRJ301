<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Of Products</title>
</head>
<body>
<h1>List Of Products!</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Unit</th>
        <th>Category</th>
        <th>Price</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.unit}</td>
            <td>${product.categoryId}</td>
            <td>${product.price}</td>
            <td>
                <a href="editProduct?id=${product.productId}">Edit</a>
                <a href="removeProduct?id=${product.productId}" onclick="return confirm('Are you sure you want to delete this product?');">Remove</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="addProduct">Add Product</a>
</body>
</html>