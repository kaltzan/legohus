<%-- 
    Document   : showorders
    Created on : 26-03-2018, 18:31:42
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
        <h1>your order list</h1>


        <%
            List<Order> orders = (List<Order>) request.getAttribute("orders");

            for (Order order : orders) {
        %> <a> <%= order.toString()%> <%= Calculator.orderCalculator(order).toString()%> <a> <br> <%
            }

                %>

                </body>
                </html>
