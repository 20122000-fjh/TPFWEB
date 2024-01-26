<%-- 
    Document   : MostrarAlmacenes
    Created on : Jan 25, 2024, 9:02:47 AM
    Author     : francisco
--%>

<%@page import="CONTROLADORA.Controladora"%>
<%@page import="MODELO.Almacen"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Almacenes</title>
    </head>
    <body>
        <h1>Almacenes</h1>
        <% 
            List <Almacen> listaAlmacenes = (List) request.getSession().getAttribute("listaAlmacenes");
            
            for(Almacen alm:listaAlmacenes){
                
        %>
        <p>Almacen ID: <%=alm.getId() %></p>
        <p>Ubicacion: <%=alm.getUbicacion() %></p>
        <p>----------------------------</p>
        <% 
            }
        %>
    </body>
</html>
