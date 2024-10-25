<%-- 
    Document   : search.jsp
    Created on : Oct 24, 2024, 2:41:28 PM
    Author     : bebet
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="includes/header.jsp" %>
<%@include file="includes/column_left_home.jsp" %>
<section id="main-contain" class="column">
    <h1>
        SEARCH STUDENT
    </h1>
    <h2>
        INPUT WHAT YOU KNOW (NO FULL INFORMATION NEEDED)
    </h2>
    <form action = "StudentServlet" method="POST">
        <table border="0">
            <tr >
                <td>StudentID: </td>
                <td> <input type="text" name="id"></td>
            </tr>
            <tr>
                <td>First Name: </td>
                <td> <input type="text" name="firstName"></td>
            </tr>
            <tr>
                <td>Last Name:  </td>
                <td> <input type="text" name="lastName"></td>
            </tr>
            <tr>
                <td>Email:  </td>
                <td> <input type="text" name="email"></td>
            </tr>
            <tr>
                <td> <input type="submit" value="SEARCH" name="COMMAND"> </td>
            </tr>
        </table>
    </form>
</section>
<%@include file="includes/column_right_news.jsp" %>
<%@include file="includes/footer.jsp" %>
