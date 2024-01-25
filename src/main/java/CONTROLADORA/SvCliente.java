/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package CONTROLADORA;

import MODELO.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco
 */
@WebServlet(name = "SvCliente", urlPatterns = {"/SvCliente"})
public class SvCliente extends HttpServlet {

    private static final Logger logger = Logger.getLogger(SvCliente.class.getName());
    Controladora controladora = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List <Cliente> listaClientes = new ArrayList<>();
        listaClientes = controladora.leerClientes();
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaClientes",listaClientes);
        
        response.sendRedirect("MostrarClientes.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SvCliente.class.getName()).log(Level.SEVERE, null, ex);
        }*/
            long dni = Long.parseLong(request.getParameter("DNI"));
            String nombre = request.getParameter("Nombre");
            String apellido = request.getParameter("Apellido");
            long telefono = Long.parseLong(request.getParameter("Telefono"));
            String direccion = request.getParameter("Direccion");
            String correo = request.getParameter("Correo");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaNacimiento = null;
            try{
                fechaNacimiento = dateFormat.parse(request.getParameter("FechaNacimiento"));
            }catch (ParseException f) {
                System.err.println("Error al parsear la fecha: " + f.getMessage());
            }
            String usuario = request.getParameter("Usuario");
            String contraseña = request.getParameter("Contrasena");
            
            Cliente cliente = new Cliente(dni,nombre,apellido,telefono,correo,direccion,usuario,contraseña,fechaNacimiento);
            
            controladora.crearCliente(cliente);
            response.sendRedirect("AltaCliente.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
