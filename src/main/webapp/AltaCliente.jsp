<%-- 
    Document   : AltaCliente
    Created on : Jan 24, 2024, 7:30:47 AM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Cliente</title>
    </head>
    <body>
        <h1>Datos del Cliente</h1>
        <form action="SvCliente" method="POST">
            <p><label>DNI: </label><input type="text" name="DNI"></p>
            <p><label>Nombre: </label><input type="text" name="Nombre"></p>
            <p><label>Apellido: </label><input type="text" name="Apellido"></p>
            <p><label>Telefono: </label><input type="text" name="Telefono"></p>
            <p><label>Correo: </label><input type="text" name="Correo"></p>
            <p><label>Direccion: </label><input type="text" name="Direccion"></p>
            <p><label>Fecha de Nacimiento: </label><input type="text" placeholder="aaaa-mm-dd" name="FechaNacimiento"></p>
            <p><label>Usuario: </label><input type="text" name="Usuario"></p>
            <p><label>Contraseña: </label><input type="text"  name="Contrasena"></p>
            <button type="submit">Registrar</button>
        </form>
        
    </body>
</html>
