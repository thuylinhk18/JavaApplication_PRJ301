<%-- 
    Document   : error
    Created on : Jun 1, 2020, 11:50:54 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
        <link type="text/css" rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="wrap">
            <%@include file="header.jsp" %>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <h3>Error !!! Please click <a href="HomeController">here</a> to go back home page.</h3>
                    </div>
                    <%@include file="container.jsp" %>
                </div>
                <div class="footer">
                    <a href="#">Created with SimpleSite</a>
                    <span>0 2 5 5 5 3</span>
                </div>
            </div>

        </div>
    </body>
</html>
