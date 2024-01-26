<%-- 
    Document   : MenuAdministrador
    Created on : Jan 25, 2024, 8:26:44 AM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Administrador</title>
    </head>
    <body>
        <h1>Administrador</h1>
        <h1>Clientes</h1>
        <form action="SvCliente" method="GET">
            <button type="submit">Mostrar Clientes</button>
        </form>
        <h1>Transportista</h1>
        <a href="http://localhost:8080/TPF/AltaTransportista.jsp">
            <button type="button">Alta</button>
        </a>
        <h1>Proveedor</h1>
        <a href="http://localhost:8080/TPF/AltaProveedor.jsp">
            <button type="button">Alta</button>
        </a>
        <h1>Almacen</h1>
        <a href="http://localhost:8080/TPF/AltaAlmacen.jsp">
            <button type="button">Alta</button>
        </a>
        <h1>Ubicacion de Almacenamiento</h1>
        <a href="http://localhost:8080/TPF/AltaUbicacionDeAlmacenamiento.jsp">
            <button type="button">Alta</button>
        </a>   
        <h1>Producto</h1>
        <a href="http://localhost:8080/TPF/AltaProducto.jsp">
            <button type="button">Alta</button>
        </a>
        <h1>Carga</h1>
        <form action="SvCarga" method="GET">
            <button type="submit">Mostrar Carga</button>
        </form>
    </body>
</html>
