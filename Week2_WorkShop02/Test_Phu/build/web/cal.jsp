<%-- 
    Document   : cal
    Created on : Sep 14, 2024, 9:11:14 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Calculator</h1>
    <hr>
    <form action="CalController" method="POST">
        <table border="0">
            <tbody>
                <tr>
                    <td>Number 1: </td>
                    <td><input type="text" name="num1" value="" size="20" /></td>
                </tr>
                <tr>
                    <td>Number 2: </td>
                    <td><input type="text" name="num2" value="" size="20" /></td>
                </tr>
                <tr>
                    <td>Operator: </td>
                    <td>
                        <select name="operator">
                            <option value="+">+</option>
                            <option value="-">-</option>
                            <option value="*">*</option>
                            <option value="/">/</option>
                        </select>
                    </td>
                </tr>
            </tbody>
        </table>
        <br>
        <input type="submit" value="Compute"/>
        <br><br>
        <table border="0">
            <tbody>
                <tr>
                    <td>Result: </td>
                    <td>
                        <input type="text" name="result" value="${RS}" size="20" readonly/>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
    </body>
</html>
