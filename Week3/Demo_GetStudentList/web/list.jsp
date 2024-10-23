<%-- 
    Document   : list.jsp
    Created on : Sep 20, 2024, 10:54:42 AM
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
         <h1>Student List</h1>
        <%=request.getAttribute("myList")%>
    </body>
</html>
