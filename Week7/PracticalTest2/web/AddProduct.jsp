<%-- 
    Document   : AddProduct
    Created on : Oct 18, 2024, 9:58:20 AM
    Author     : bebet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Product!</h1>
        <form action="ProductServlet" method="POST">
            Product Name: 
            <input type="text" name="name" required/> <br/>
            Unit: 
            <input type="text" name="unit" required/><br/>
            Category:
            <select name="category">
                <option value="Nokia">Nokia - Hãng điện thoại</option>
                <option value="Mazda">Mazda - Hãng ô tô</option>
                <option value="Vinamilk"> Vinamilk - Hãng sữa</option>
            </select>
            <br/>
            Price: 
            <input type="number" name="price" min="0" step="0.01"/> <br/>
            <input type="submit" value="ADD" name="COMMAND"> </td>
            <input type="submit" value="Return to Product List" name="COMMAND"> <br/>

        </form>
    </body>
</html>
