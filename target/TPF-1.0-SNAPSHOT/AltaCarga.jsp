<%-- 
    Document   : AltaCarga
    Created on : Jan 25, 2024, 2:56:33 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Carga</title>
    </head>
    <body>
        <h1>Ver Almacenes</h1>
        <form action="SvAlmacen" method="GET">
            <button type="submit">Mostrar Almacenes</button>
        </form>
        <h1>Datos de la Carga</h1>
        <form action="SvCarga" method="POST">
            <p><label>ID Almacen: </label><input type="text" name="almacenID"></p>
            <p><label>Observacion: </label><input type="text" name="Observacion"></p>
            <p><label>Fecha de Partida: </label><input type="text" placeholder="aaaa-mm-dd" name="FechaPartida"></p>
            <button type="submit">Registrar</button>
        </form>
    </body>
</html>
