<%-- 
    Document   : agregarPal
    Created on : 22/11/2016, 09:48:50 AM
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
            <center>

        <h2>Agregar palabras para adivinar</h2>
        <form action="AgregarPalabra" title="Agregar" method="post">
        <table>
            <tr>
                <td></td>
                <td>Palabra</td>
            </tr>
             <tr>
                <td>Texto
                <input type="text" name="pal"/></td>
                <td>
                    <input type="submit" name="aceptar" value="Aceptar"/>
                </td>
            </tr>
        </table>
        </form>
            </center>
    </body>
</html>
