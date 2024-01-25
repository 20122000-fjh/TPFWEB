<%-- 
    Document   : AltaAlmacen
    Created on : Jan 24, 2024, 8:22:25 AM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Almacen</title>
    </head>
    <body>
        <h1>Datos del Almacen</h1>
        <form action="SvAlmacen" method="POST">
            <p><label>Ubicacion del Almacen: </label><input type="text" name="Ubicacion"></p>
            <button type="submit">Registrar</button>
        </form>
    </body>
</html>
