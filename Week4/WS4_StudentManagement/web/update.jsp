<%-- 
    Document   : update.jsp
    Created on : Oct 25, 2024, 4:30:51 PM
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
        Update student with ID : ${id}
    </h1>
    <form action = "StudentServlet" method="POST" accept-charset="UTF-8">
        <input style="display: none" value="${id}" name="id">
        <table border="0">
            <tr>
                <td>First Name: </td>
                <td> <input type="text" name="firstName" value="${firstName}"accept="UTF-8"></td>

            </tr>
            <tr>
                <td>Last Name: </td>
                <td> <input type="text" name="lastName" value="${lastName}" accept="UTF-8"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td> <input type="text" name="email" value="${email}" accept="UTF-8"></td>
            </tr>
            <tr>
                <td> <input type="submit" value="UPDATE" name="COMMAND"> </td>
            </tr>
        </table>
    </form>
</section>
<%@include file="includes/column_right_news.jsp" %>
<%@include file="includes/footer.jsp" %>

