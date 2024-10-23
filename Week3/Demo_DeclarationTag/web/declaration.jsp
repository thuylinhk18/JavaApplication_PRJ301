<%-- 
    Document   : declaration
    Created on : Sep 17, 2024, 3:45:07 PM
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
        <%!
            String makeItLower(String data){
            return data.toLowerCase();
        }
        %>
        <h1>Lower case "Hello World" : <%= makeItLower("Hello World") %></h1>
    </body>
</html>
