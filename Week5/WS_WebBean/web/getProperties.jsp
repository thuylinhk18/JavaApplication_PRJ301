<%-- 
    Document   : getProperties
    Created on : Oct 26, 2024, 12:38:39 AM
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
        <jsp:useBean id="user" class="model.User"></jsp:useBean> 
            <h3> 
                First Name: <jsp:getProperty property="firstName" name="user"></jsp:getProperty> 
                <br/> 
                Last Name: <jsp:getProperty property="lastName" name="user"></jsp:getProperty> 
        </h3>
    </body>
</html>
