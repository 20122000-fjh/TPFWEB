<%-- 
    Document   : AltaTransportista
    Created on : Jan 24, 2024, 7:46:14 AM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Transportista</title>
    </head>
    <body>
        <h1>Datos del Transportista</h1>
        <form action="SvTransportista" method="POST">
            <p><label>DNI: </label><input type="text" name="DNI"></p>
            <p><label>Nombre: </label><input type="text" name="Nombre"></p>
            <p><label>Apellido: </label><input type="text" name="Apellido"></p>
            <button type="submit">Registrar</button>
        </form>
    </body>
</html>
