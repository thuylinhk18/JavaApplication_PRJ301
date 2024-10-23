<%-- 
    Document   : ProductList
    Created on : Oct 18, 2024, 11:11:50 AM
    Author     : bebet
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section id="main-contain" class="column">
            <h1>
                List Of Products!
            </h1>
            <form action="ProductServlet" method="POST">
                <table border="1">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Unit</th>
                            <th>Category</th>
                            <th>Price</th>
                            <th>Operations</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            List<Product> myList = (List<Product>) request.getAttribute("ProductList");
                            if (myList != null) {
                                for (Product el : myList) {
                        %>
                        <tr>
                            <td><%=el.getId()%></td>
                            <td><%=el.getName()%></td>
                            <td><%=el.getUnit()%></td>
                            <td><%=el.getCategory()%></td>
                            <td><%=el.getPrice()%></td>
                            <td>
                                <form action="StudentServlet" method="POST" style="display:inline;">
                                    <input type="hidden" name="COMMAND" value="REMOVE">
                                    <input type="hidden" name="studentId" value="<%=el.getId()%>">
                                    <button type="submit">Remove</button>
                                </form>
                                <form action="StudentServlet" method="POST" style="display:inline;">
                                    <input type="hidden" name="COMMAND" value="BEFORE_UPDATE">
                                    <input type="hidden" name="studentId" value="<%=el.getId()%>">
                                    <button type="submit">Edit</button>
                                </form>
                            </td>
                        </tr>
                        <% }
                            } else {
                            }
                        %>
                    </tbody>

                </table>    
                <input type="submit" value="Add Product" name="COMMAND"> </td>
                <input type="submit" value="List Category" name="COMMAND"> </td>
            </form>
        </section>
    </body>
</html>


