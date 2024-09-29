<%-- 
    Document   : calculator
    Created on : Sep 10, 2024, 4:45:05 PM
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
        <form action="CalculatorServlet" method="post">
            <table>
                <tr>
                    <td>First</td>
                    <td><input type="number" name="num1" step="any" /></td>
                </tr>
                <tr>
                    <td>Second</td>
                    <td><input type="number" name="num2" step="any"/></td>
                </tr>
                <tr>
                    <td>Operator</td>
                    <td><select name="operator">
                            <option value="+">+</option>
                            <option value="-">-</option>
                            <option value="*">*</option>
                            <option value="/">/</option>
                        </select></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Compute"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
