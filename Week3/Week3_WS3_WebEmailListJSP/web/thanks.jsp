<%-- 
    Document   : thanks
    Created on : Sep 23, 2024, 11:28:13 PM
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
        <h1>Thanks for joining!</h1>
         <%=request.getAttribute("userList")%>
    </body>
</html>
