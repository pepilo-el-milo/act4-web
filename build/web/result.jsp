<%-- 
    Document   : result
    Created on : 18/02/2022, 06:26:42 PM
    Author     : Pepe Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            <%
            int result = (Integer) request.getAttribute("result");
            %>
        </p>
    </body>
</html>
