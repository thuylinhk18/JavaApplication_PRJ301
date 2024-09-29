<%-- 
    Document   : jspscriplet
    Created on : Sep 23, 2024, 9:30:35 AM
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

        <form>
            <table>

                <tr>
                    <td>Input a number   </td>
                    <td><input type="number" name="num"></td>
                </tr> 
                <tr>
                    <td></td>
                    <td><input type="submit" value="Export"/></td>
                </tr> 
                <tr>
                    <td></td>
                    <td>
                        <b>Result: <b/><br/>
                        <%
               String numInput = request.getParameter("num");
               if(numInput != null && !numInput.isEmpty()){
               int num = Integer.parseInt(numInput);
               for(int i = 0; i < num;i++){
                   out.print(i);
                   out.print("<br/>");
                   }
                   }else{
                   out.print("<b> Please input a number!");
                   }
                        %>
                    </td>
                </tr>

            </table>
            <!-- Lam the nao de xu ly bay qua error.jsp? Co duoc khong? -->

        </form>



    </body>
</html>
