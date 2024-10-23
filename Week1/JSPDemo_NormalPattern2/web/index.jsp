<%-- 
    Document   : index
    Created on : Sep 13, 2024, 10:15:55 AM
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
        <h1>Using Form</h1>
        <form name="myForm" action="display.jsp" method="post">

            <table border="0">
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="fName" required /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lName" required/></td>
                </tr>
                <tr>
                    <td>Email Address</td>
                    <td><input type="text" name="email" required/></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><select name="gender">
                            <option value="male">Male</option>
                            <option value="female">Female</option>
                        </select> 
                    </td>
                </tr>
                <tr>
                    <td>Date of Birth</td>
                    <td><input type="date" name="dob" required/></td>
                </tr>
                 <tr>
                    <td><input type="reset" value="Clear"/></td>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>

            
            

        </form>



    </body>
</html>
