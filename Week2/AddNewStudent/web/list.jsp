<%-- 
    Document   : list
    Created on : Sep 13, 2024, 2:28:47 PM
    Author     : bebet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <section id="main-contain"class="column"> 
        <h1>Student List</h1> 
        <table boder="1"> 
            <tr> 
                <th>ID</th> 
                <th>Name</th> 
                <th>Gender</th> 
                <th>DOB</th> 
            </tr> 

            <c:forEach var="student" items = "${studentList.getStudentList()}" > 
                <tr> 
                    <td>${student.getId()}</td> 
                    <td>${student.getName()}</td> 
                    <td> 
                <c:if test = "${student.getGender()=='Male'}"> 
                    <input type="checkbox" checked> 
                </c:if> 
                <c:if test = "${student.getGender()=='Female'}"> 
                    <input type="checkbox" unchecked> 
                </c:if> 
                </td>                  
                <td>${student.getDob()}</td> 
                </tr> 
            </c:forEach> 
        </table> 

    </section>
</body>
</html>
