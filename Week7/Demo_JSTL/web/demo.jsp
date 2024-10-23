<%-- 
    Document   : demo
    Created on : Oct 15, 2024, 4:15:40 PM
    Author     : bebet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSTL Demo
            <hr>
            <c:set var="name" value ="Mr 2 2024"></c:set>
            Name is: <c:out value="${name}"></c:out>
        </h1>
    </body>
</html>
