<%-- 
    Document   : list_student
    Created on : Oct 1, 2024, 10:23:51 AM
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
            <table border="1px solid black">
                <tr>
                    <th>ID</th>
                    <th> First Name </th>
                    <th> Last Name </th>
                    <th> Email</th>
                </tr>
            <c:forEach items="${sList}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.firstName}</td>
                    <td>${s.lastName}</td>
                    <td>${s.email}</td>
                    <td>
                        <a href="#">update</a>
                        <a href="#">delete</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
            <a href="Add.jsp">Create student</a>    
    </body>
</html>
