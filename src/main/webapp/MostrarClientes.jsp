<%-- 
    Document   : MostrarClientes
    Created on : Jan 20, 2024, 5:50:21 PM
    Author     : francisco
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="MODELO.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Clientes</title>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <% 
            List <Cliente> listaClientes = (List) request.getSession().getAttribute("listaClientes");
            int cont = 1;
            
            for(Cliente cli:listaClientes){
                Date fechaNacimiento = cli.getFechaNacimiento();
                String fechaFormateada = "";
                if (fechaNacimiento != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    fechaFormateada = sdf.format(fechaNacimiento);
                }
        %>
        <p>Cliente N°<%=cont %></p>
        <p>DNI: <%=cli.getDni() %></p>
        <p>Nombre: <%=cli.getNombre() %></p>
        <p>Apellido: <%=cli.getApellido() %></p>
        <p>Telefono: <%=cli.getTelefono() %></p>
        <p>Direccion: <%=cli.getDireccion()%></p>
        <p>Correo: <%=cli.getCorreo() %></p>
        <p>Fecha de Nacimiento: <%=fechaFormateada %></p>
        <p>Usuario: <%=cli.getNombre_usuario() %></p>
        <p>Contraseña: <%=cli.getContraseña() %></p>
        <p>----------------------------</p>
        <% 
            cont = cont + 1;
        %>
        <% 
            }
        %>
    </body>
</html>
