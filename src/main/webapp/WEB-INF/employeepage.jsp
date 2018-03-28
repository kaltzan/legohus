<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>

<%@page import="PresentationLayer.RenderUtility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
        <%out.print(RenderUtility.bootstrap());%>
    </head>
    <body>

        <%  out.print(RenderUtility.navbar());%>

        <h1>Hello <%=request.getParameter("email")%> </h1>

        You are now logged in as a EMPLOYEE of our wonderful site.
        <br>
       
        
    <l><a>see all active orders</a>
        
        <a href= "FrontController?command=showallorders">Active/Orders</a></li
</body>
</html>
