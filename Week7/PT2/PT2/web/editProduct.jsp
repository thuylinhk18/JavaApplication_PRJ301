<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product!</h1>
<form action="editProduct" method="post">
    <input type="hidden" name="productId" value="${product.productId}"/>
    Product Name: <input type="text" name="productName" value="${product.productName}" required/><br/>
    Unit: <input type="text" name="unit" value="${product.unit}" required/><br/>
    Category:
    <select name="categoryId">
        <c:forEach var="category" items="${categories}">
            <option value="${category.categoryId}" ${category.categoryId == product.categoryId ? 'selected' : ''}>
                ${category.categoryName}
            </option>
        </c:forEach>
    </select><br/>
    Price: <input type="text" name="price" value="${product.price}" required/><br/>
    <input type="submit" value="Update"/>
</form>
<a href="productList">Return to Product List</a>
</body>
</html>
