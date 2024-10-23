<%-- 
    Document   : thanks
    Created on : Sep 23, 2024, 11:28:13 PM
    Author     : bebet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        errorPage="error_java.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Thanks for joining!</h1>
        <c:forEach var="user" items="${userList}" >
            Email:${user.email} <br/>
            First Name: ${user.firstName} <br/>
            Last Name: ${user.lastName} <br/>
        </c:forEach>
        <form action="EmailListServlet" method="post">
            <input type="hidden" name="action" value="join"/>
            <input type="submit" value="Return" />
        </form>
    </body>
</html>
