<%-- 
    Document   : showallorders
    Created on : 27-03-2018, 18:04:09
    Author     : Kristian
--%>

<%@page import="PresentationLayer.RenderUtility"%>
<%@page import="FunctionLayer.Calculator"%>
<%@page import="java.util.List"%>
<%@page import="FunctionLayer.Order"%>
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
        <h1>All orders in the database</h1>


        <%
            List<Order> orders = (List<Order>) request.getAttribute("orders");

            for (Order order : orders) {
        %> <a> <%= order.toString()%> <%= Calculator.orderCalculator(order).toString()%> <a/> <br> <%
            }

                %>

                </body>
                </html>
