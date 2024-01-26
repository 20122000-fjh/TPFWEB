<%-- 
    Document   : MostrarDescargas
    Created on : Jan 25, 2024, 4:45:50 PM
    Author     : francisco
--%>

<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="CONTROLADORA.Controladora"%>
<%@page import="MODELO.Descarga"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Descargas</title>
    </head>
    <body>
        <h1>Descargas</h1>
        <% 
            List <Descarga> listaDescargas = (List) request.getSession().getAttribute("listaDescargas");
            Controladora controladora = new Controladora();
            for(Descarga des:listaDescargas){
                String ubicacion = controladora.obtenerUbicacionAlmacenPorID(des.getAlmacen_id());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String fechaLlegada = des.getFecha_llegada().format(formatter);
                
                
                
        %>
        <p>Descarga ID: <%=des.getId() %></p>
        <p>Observacion: <%=des.getObservacion() %></p>
        <p>Se dirige al Almacen de: <%=ubicacion %></p>
        <p>Fecha de Partida: <%=fechaLlegada %></p>
        <p>----------------------------</p>
        <% 
            }
        %>
    </body>
</html>
