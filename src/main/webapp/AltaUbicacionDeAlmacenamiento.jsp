<%-- 
    Document   : AltaUbicacionDeAlmacenamiento
    Created on : Jan 25, 2024, 9:35:42 AM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Ubicacion De Almacenamiento</title>
    </head>
    <body>
        <h1>Ver Almacenes</h1>
        <form action="SvAlmacen" method="GET">
            <button type="submit">Mostrar Almacenes</button>
        </form>
        <h1>Datos de la Ubicacion</h1>
        <form action="SvUbicacionDeAlmacenamiento" method="POST">
            <p><label>ID del Almacen: </label><input type="text" name="almacenID"></p>
            <p><label>ID de la Ubicacion: </label><input type="text" name="ubicacionID"></p>
            <button type="submit">Registrar</button>
        </form>
    </body>
</html>
