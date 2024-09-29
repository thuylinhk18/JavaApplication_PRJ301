<%-- 
    Document   : display
    Created on : Sep 13, 2024, 10:16:01 AM
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
        <h1>Using Form</h1>
        <%
        String firstName = request.getParameter("fName");
        String lastName = request.getParameter("lName");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        %>
        <table border="1"> 
            <tbody> 
                <tr> 
                    <td>First Name: </td> 
                    <td><%= firstName %></td> 
                </tr> 
                <tr> 
                    <td>Last Name: </td> 
                    <td><%= lastName %> </td> 
                </tr> 
                <tr> 
                    <td>Email Address: </td> 
                    <td><%= email %></td> 
                </tr> 
                <tr> 
                    <td>Gender: </td> 
                    <td><%= gender %> </td> 
                </tr> 
                <tr> 
                    <td>Date of birth: </td> 
                    <td><%= dob %></td> 
                </tr> 
            </tbody> 
        </table> 
                <br/>
                <form action="index.jsp" method="post">
                    <input type="submit" value="BACK" />
                </form>
                
    </body>
</html>
