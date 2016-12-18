<%-- 
    Document   : jugar
    Created on : 22/11/2016, 09:44:43 AM
    Author     : Beto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="mostrar.jsp">
            Participante:
            <input type="text" name="nombre"/>
            <br/>
            <br/>
            Intentos:
            <input type="number" name="intentos"/>
            <br/>
            <input type="submit" value="continuar"/>
     
        </form>
    </body>
</html>
