<%-- 
    Document   : AltaDescarga
    Created on : Jan 25, 2024, 4:35:24 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Descarga</title>
    </head>
    <body>
        <h1>Ver Almacenes</h1>
        <form action="SvAlmacen" method="GET">
            <button type="submit">Mostrar Almacenes</button>
        </form>
        <h1>Datos de la Descarga</h1>
        <form action="SvDescarga" method="POST">
            <p><label>ID Almacen: </label><input type="text" name="almacenID"></p>
            <p><label>Observacion: </label><input type="text" name="Observacion"></p>
            <p><label>Fecha de Llegada: </label><input type="text" placeholder="aaaa-mm-dd" name="FechaLlegada"></p>
            <button type="submit">Registrar</button>
        </form>
    </body>
</html>
