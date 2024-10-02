<%-- 
    Document   : studentsbean
    Created on : Oct 1, 2024, 3:42:28 PM
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
        <jsp:useBean id="students" class = "model.StudentsBean">
            <jsp:setProperty name="students" property="firstName" value="Zara"/>
            <jsp:setProperty name="students" property="lastName" value="Ali"/>
            <jsp:setProperty name="students" property="age" value="10"/>
        </jsp:useBean>
        <p>Student First Name: 
            <jsp:getProperty name="students" property="firstName"/>
        </p>
        <p>Student Last Name: 
            <jsp:getProperty name="students" property="lastName"/>
        </p>
        <p>Student Age: 
            <jsp:getProperty name="students" property="age"/>
        </p>
    </body>
</html>
