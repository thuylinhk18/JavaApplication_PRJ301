<%-- 
    Document   : result
    Created on : Sep 10, 2024, 4:45:17 PM
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
        <h1>Calculator</h1>
        <%=request.getAttribute("result")%> <hr/>
        <form action="CalculatorServlet" method="get">
            <input type="submit" value="Continue"/>
        </form>
    </body>
</html>
