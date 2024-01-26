<%-- 
    Document   : Mostrar Ubicaciones
    Created on : Jan 25, 2024, 9:28:08 AM
    Author     : francisco
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Ubicaciones</title>
    </head>
    <body>
        <h1>Ubicaciones</h1>
        <% 
            List <Integer> listaUbicaciones = (List) request.getSession().getAttribute("listaUbicaciones");
            
            for(Integer id:listaUbicaciones){
                
        %>
        <p>Ubicacion ID: <%=id %></p>
        <p>----------------------------</p>
        <% 
            }
        %>
    </body>
</html>
