<%-- 
    Document   : normalpattern
    Created on : Sep 8, 2024, 7:34:41 AM
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
        <b>Choose an author: </b> <br/>
        <form method="post">
            <input type="checkbox" name="author" value="Tan Nguyen">Tan Nguyen 
            <input type="checkbox" name="author" value="Ali Hoang">Ali Hoang 
            <input type="checkbox" name="author" value="Kumar Van">Kumar Van <br/>
            <input type="submit" value="Query"/>
        </form>
        <% 
        String[] chosenAuthors = request.getParameterValues("author");
        if(chosenAuthors!= null){
        %>
        <b>You have selected author(s):</b>
        <ul>
            <% 
            for(int i=0;i<chosenAuthors.length;i++){
            %>
            <li><%=chosenAuthors[i]%></li>
                <% 
                    }
                %>
        </ul>
        <% 
                   }
        %>
        <a href="<%= request.getRequestURI()%>">BACK</a>
    </body>
</html>
