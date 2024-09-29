<%-- 
    Document   : login
    Created on : Sep 13, 2024, 10:36:33 AM
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
        <h1>Login to the FPT System</h1>
        <%
        String err= request.getParameter("err");
        if("1".equals(err)){
        out.print("<h4 style=\"color: red;\">Login Fail</h4>");
            }
        %>
        <form action="LoginServlet" method="post">
            <table>

                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" required /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password" required /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
