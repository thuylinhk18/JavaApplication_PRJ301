<%-- 
    Document   : index
    Created on : Sep 23, 2024, 11:28:07 PM
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
        <h1>Joint Email List!</h1>
        <form action="EmailListServlet" method="post">
            <input type="hidden" name="action" value="add" />
            <table>
                <tr>
                    <td>Email</td>
                    <td><input type="email" name="email" value="${user.email}" required/> </td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstName" value="${user.firstName}" required/></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastName" value="${user.lastName}" required/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Join Now"/> </td>
                </tr>
            </table>
            
            
        </form>
    </body>
</html>
