<%-- 
    Document   : showdate
    Created on : Sep 6, 2024, 10:19:55 AM
    Author     : bebet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Show date </h1>
       <% 
       Date currentDate = new Date();
       out.println("The current date: "+ currentDate);
       %>
    </body>
</html>
