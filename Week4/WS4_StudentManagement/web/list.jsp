<%-- 
    Document   : list.jsp
    Created on : Oct 23, 2024, 11:44:41 PM
    Author     : bebet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/includes/header.jsp" %>
<%@include file="/includes/column_left_home.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section id="main-contain" class="column" >
    <h1>
        Student List
    </h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${sList}">
                <tr>

                    <td>${student.id}</td>
                    <td>${student.firstName}</td>
                    <td>${student.lastName}</td>
                    <td>${student.email}</td>
                    <td>
                        <form action="StudentServlet" method="POST" style="display:inline;">
                            <input type="hidden" name="COMMAND" value="DELETE">
                            <input type="hidden" name="id" value="${student.id}">
                            <button type="submit">DELETE</button>
                        </form> 
                        <form action="StudentServlet" method="POST" style="display:inline;">
                            <input type="hidden" name="COMMAND" value="BEFORE_UPDATE">
                            <input type="hidden" name="studentId" value="${student.id}">
                            <button type="submit">UPDATE</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>

    </table>


</section>
<%@include file="/includes/column_right_news.jsp" %>
<%@include file="/includes/footer.jsp" %>
