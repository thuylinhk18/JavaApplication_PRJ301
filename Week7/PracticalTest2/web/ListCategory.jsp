<%-- 
    Document   : ListCategory
    Created on : Oct 18, 2024, 4:07:25 PM
    Author     : bebet
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section id="main-contain" class="column">
    <h1>
        List Of Category!
    </h1>
    <table border="1">
        <thead>
            <tr>
                <th>Category ID</th>
                <th>Category Name</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Category> myList = (List<Category>) request.getAttribute("CategoryList");
                if (myList != null) {
                    for (Category elem : myList) {
            %>
            <tr>
                <td><%=elem.getId()%></td>
                <td><%=elem.getName()%></td>
                <td><%=elem.getDescription()%></td>
            </tr>
        <input type="submit" value="Add Category" name="COMMAND"> </td>
        <input type="submit" value="List Category" name="COMMAND"> </td>

        <% }
            } else {
            }
        %>
        </tbody>

    </table>    
</section>
