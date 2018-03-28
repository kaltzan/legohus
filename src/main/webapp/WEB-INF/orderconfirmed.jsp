<%-- 
    Document   : orderconfirmed
    Created on : 26-03-2018, 18:11:41
    Author     : Kristian
--%>

<%@page import="PresentationLayer.RenderUtility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Confirmation Page</title>
        <%out.print(RenderUtility.bootstrap());%>
    </head>
    <body>
        <%  out.print(RenderUtility.navbar());%>
        <h1>Order Confirmed!</h1>
    </body>
</html>
