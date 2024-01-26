<%-- 
    Document   : AltaProveedor
    Created on : Jan 24, 2024, 8:01:24 AM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Proveedor</title>
    </head>
    <body>
        <h1>Datos del Proveedor</h1>
        <form action="SvProveedor" method="POST">
            <p><label>CUIT: </label><input type="text" name="CUIT"></p>
            <p><label>Razón Social: </label><input type="text" name="RazonSocial"></p>
            <p><label>Telefono: </label><input type="text" name="Telefono"></p>
            <p><label>Correo: </label><input type="text" name="Correo"></p>
            <p><label>Categoria: </label><input type="text" name="Categoria"></p>
            <button type="submit">Registrar</button>
        </form>
    </body>
</html>
