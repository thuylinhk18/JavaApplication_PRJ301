<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Category</title>
</head>
<body>
<h1>Add Category!</h1>
<form action="addCategory" method="post">
    Category Name: <input type="text" name="categoryName" required/><br/>
    Description: <input type="text" name="description" /><br/>
    <input type="submit" value="Add"/>
</form>
<a href="categoryList">Return to Category List</a>
</body>
</html>
