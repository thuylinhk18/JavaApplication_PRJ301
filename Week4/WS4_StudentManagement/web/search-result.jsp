<%-- 
    Document   : search-result
    Created on : Oct 25, 2024, 10:17:44 PM
    Author     : bebet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/includes/header.jsp" %>
<%@include file="/includes/column_left_home.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section id="main-contain" class="column" >
    <h1>
        Result
    </h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>

        </thead>
        <tbody>
            <c:forEach var="student" items="${result}">
                <tr>

                    <td>${student.id}</td>
                    <td>${student.firstName}</td>
                    <td>${student.lastName}</td>
                    <td>${student.email}</td>
                </tr>
            </c:forEach>

        </tbody>

    </table>
    <form action="StudentServlet" method="post">
        <input type="submit" value="BACK" name="COMMAND"/>
    </form>



</section>
<%@include file="/includes/column_right_news.jsp" %>
<%@include file="/includes/footer.jsp" %>

