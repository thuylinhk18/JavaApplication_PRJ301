<%-- 
    Document   : home
    Created on : Sep 23, 2024, 11:11:49 PM
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
        <h1>1. Declarations</h1>
        <%! String introduction="I am Thuy Linh!"; %>
        <h1>2. Expressions</h1>
        <%=introduction%>
        <h1>3. Scriplets</h1>
        <%
        String hello="Hi, ";
        String printToClient = hello+introduction;
        out.println(printToClient);
        %>
    </body>
</html>
