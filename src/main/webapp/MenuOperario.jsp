<%-- 
    Document   : MenuOperario
    Created on : Jan 25, 2024, 8:26:28 AM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Operario</title>
    </head>
    <body>
        <h1>Carga</h1>
        <a href="http://localhost:8080/TPF/AltaCarga.jsp">
            <button type="button">Alta</button>
        </a>
        <p></p>
        <form action="SvCarga" method="GET">
            <button type="submit">Mostrar Cargas</button>
        </form>
        <h1>Descarga</h1>
        <a href="http://localhost:8080/TPF/AltaDescarga.jsp">
            <button type="button">Alta</button>
        </a>
        <p></p>
        <form action="SvDescarga" method="GET">
            <button type="submit">Mostrar Descargas</button>
        </form>
    </body>
</html>
