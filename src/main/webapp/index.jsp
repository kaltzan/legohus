<%-- 
    Document   : index
    Created on : Aug 22, 2017, 2:01:06 PM
    Author     : kasper
--%>

<%@page import="PresentationLayer.RenderUtility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome page</title>
        <%out.print(RenderUtility.bootstrap());%>

    </head>
</head>
<body >

    <%  out.print(RenderUtility.navbar()); %>


    <h1>Welcome to Sem 2</h1>

    <table>

        <h3> login:</h3>
        <br>
        <td>
            <form name="login" action="FrontController" method="POST">
                <input class="btn btn-danger" type="hidden" name="command" value="login">
                Email:<br>
                <input class="btn btn-danger" type="text" name="email" value="someone@nowhere.com">
                <br>
                Password:<br>
                <input class="btn btn-danger" type="password" name="password" value="sesam">
                <br>
                <input class="btn btn-danger" type="submit" value="Login">
            </form>
        </td>
    </table>
    <table>
        <h3> Register:</h3>
        <br>

        <td>
            <form  name="register" action="FrontController" method="POST">
                <input class="btn btn-danger" type="hidden" name="command" value="register">
                Email:<br>
                <input class="btn btn-danger"  type="text" name="email" value="someone@nowhere.com">
                <br>
                Password:<br>
                <input class="btn btn-danger"  type="password" name="password1" value="sesam">
                <br>
                Retype Password:<br>
                <input class="btn btn-danger"  type="password" name="password2" value="sesam">
                <br>
                <input class="btn btn-danger" type="submit" value="Register">
            </form>
        </td>
    </tr>
</table>



<% String error = (String) request.getAttribute("error");
        if (error != null) {%>
<H2>Error!!</h2>
<p><%= error%>
    <% }
    %>
</body>
</html>
