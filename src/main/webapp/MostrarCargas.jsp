<%-- 
    Document   : MostrarCargas
    Created on : Jan 25, 2024, 4:11:02 PM
    Author     : francisco
--%>

<%@page import="CONTROLADORA.Controladora"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="MODELO.Carga"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Cargas</title>
    </head>
    <body>
        <h1>Cargas</h1>
        <% 
            List <Carga> listaCargas = (List) request.getSession().getAttribute("listaCargas");
            Controladora controladora = new Controladora();
            for(Carga car:listaCargas){
                String ubicacion = controladora.obtenerUbicacionAlmacenPorID(car.getId_almacen());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String fechaPartida = car.getFechaPartida().format(formatter);
        %>
        <p>Carga ID: <%=car.getId() %></p>
        <p>Observacion: <%=car.getObservacion() %></p>
        <p>Se dirige al Almacen de: <%=ubicacion %></p>
        <p>Fecha de Partida: <%=fechaPartida %></p>
        <p>----------------------------</p>
        <% 
            }
        %>
    </body>
</html>
