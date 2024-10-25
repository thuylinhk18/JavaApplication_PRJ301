<%-- 
    Document   : addStudent
    Created on : Oct 24, 2024, 2:47:57 PM
    Author     : bebet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/includes/header.jsp" %>
<%@include file="/includes/column_left_home.jsp" %>
<section>
    <h1>
        Input your information here!
    </h1>

    <form action="StudentServlet" method="post" accept-charset="UTF-8">
        <table>
            <tr>
                <td>StudentID</td>
                <td><input type="text" name="id" required</td>
            </tr>
            <tr>
                <td>First Name</td>
                <td><input type="text" name="firstName" required</td>
            </tr>

            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lastName" required</td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" name="email" required</td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="ADD" name="COMMAND"/></td>
            </tr>

        </table>

    </form>
</section>
<%@include file="/includes/column_right_news.jsp" %>
<%@include file="/includes/footer.jsp" %>
