<%-- 
    Document   : AltaProducto
    Created on : Jan 25, 2024, 8:37:24 AM
    Author     : francisco
--%>

<%@page import="MODELO.Almacen"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Producto</title>
    </head>
    <body>
        <h1>Ver Almacenes</h1>
        <form action="SvAlmacen" method="GET">
            <button type="submit">Mostrar Almacenes</button>
        </form>
        <h1>Ver Ubicaciones de Almacenamiento</h1>
        <form action="SvUbicacionDeAlmacenamiento" method="GET">
            <p><label>ID Almacen: </label><input type="text" name="IDAlmacen"></p>
            <button type="submit">Mostrar Ubicacion</button>
        </form>
        <h1>Datos del producto</h1>
        <form action="SvProducto" method="POST">
            <p><label>Nombre: </label><input type="text" name="Nombre"></p>
            <p><label>Categoria: </label><input type="text" name="Categoria"></p>
            <p><label>Precio: </label><input type="text" name="Precio"></p>
            <p><label>Stock: </label><input type="text" name="Stock"></p>
            <p><label>Proveedor: </label><input type="text" name="Proveedor"></p>
            <p><label>ID Almacen: </label><input type="text" name="IDAlmacen"></p>
            <p><label>ID Ubicacion: </label><input type="text" name="IDUbicacion"></p>
        </form>
    </body>
</html>
