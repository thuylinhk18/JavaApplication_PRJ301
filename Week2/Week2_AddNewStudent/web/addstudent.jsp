<%-- 
    Document   : addstudent
    Created on : Sep 13, 2024, 11:50:18 AM
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
        <h1>Add new student</h1>
        <form action="StudentServlet" method="post">
            <table>
                <tr>
                    <td>Student ID</td>
                    <td><input type="number" name="id" required/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" required/></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><input type="radio" name="gender" value="1"/>Male 
                        <input type="radio" name="gender" value="0"/>Female</td>
                </tr>
                <tr>
                    <td>Date of birth</td>
                    <td><input type="date" name="dob" required/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
