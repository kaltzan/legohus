<%-- 
    Document   : orderpage
    Created on : 22-03-2018, 11:46:53
    Author     : Kristian
--%>

<%@page import="PresentationLayer.RenderUtility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%out.print(RenderUtility.bootstrap());%>
    </head>
    <body>
          <%  out.print(RenderUtility.navbar()); %>

    <tr><td>order</td>
        <td>
            <form name="order" action="FrontController" method="POST">
                <input class="btn btn-danger" type="hidden" name="command" value="order">
                Height<br>
                <input class="btn btn-danger" type="number" name="height" value="height">
                <br>
                Length<br>
                <input class="btn btn-danger" type="number" name="length" value="length">
                <br>
                Width<br>
                <input class="btn btn-danger" type="number" name="width" value="width">
                <br>
                <input class="btn btn-danger" type="submit" value="Submit">
            </form>
        </td>

  

    </body>
</html>
