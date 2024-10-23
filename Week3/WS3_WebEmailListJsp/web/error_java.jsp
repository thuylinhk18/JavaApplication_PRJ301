<%-- 
    Document   : error_java
    Created on : Sep 23, 2024, 11:27:55 PM
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
        <h1>Java Error!</h1>
        <form action="EmailListServlet" method="post">
            <input type="hidden" name="action" value="join"/>
            <input type="submit" value="Return" />
        </form>
    </body>
</html>
