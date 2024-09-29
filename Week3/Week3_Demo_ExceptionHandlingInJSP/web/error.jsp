<%-- 
    Document   : error
    Created on : Sep 23, 2024, 10:52:20 PM
    Author     : bebet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Error: <%=exception.getMessage()%></h1>
    </body>
</html>
