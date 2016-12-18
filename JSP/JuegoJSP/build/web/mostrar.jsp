<%-- 
    Document   : mostrar
    Created on : 20/11/2016, 09:26:37 PM
    Author     : Beto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! int cant = 30;%>
<% 
session.setAttribute("intentos", request.getParameter("intentos"));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <h1>Ejemplo !</h1>
       <h2>Binevenido <%=request.getParameter("nombre")%> </h2>
       <h2>numero de intentos: <%= request.getParameter("intentos")%></h2>
       <h3>Tegustaria Jugar??
           <a href="index.jsp">No</a>
           <a href="Juego">Si</a>
       </h3>
    </body>
</html>
