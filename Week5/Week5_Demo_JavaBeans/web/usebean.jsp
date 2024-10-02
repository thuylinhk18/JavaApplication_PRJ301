<%-- 
    Document   : usebean
    Created on : Oct 1, 2024, 3:26:05 PM
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
            <jsp:useBean id="date" class="java.util.Date"/>
            <p>The date/time is :  <%=date%></p>
            
    </body>
</html>
