/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package CONTROLADORA;

import MODELO.Descarga;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author francisco
 */
@WebServlet(name = "SvDescarga", urlPatterns = {"/SvDescarga"})
public class SvDescarga extends HttpServlet {

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
        List <Descarga> listaDescargas = new ArrayList<>();
        listaDescargas = controladora.leerDescargas();
        
        
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaDescargas",listaDescargas);
        
        response.sendRedirect("MostrarDescargas.jsp");
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
        long id = controladora.obtenerUltimoIdRegistradoDescarga() + 1;
        String observacion = request.getParameter("Observacion");
        long almacenID = Long.parseLong(request.getParameter("almacenID"));
        LocalDate fechaLlegada = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            fechaLlegada = LocalDate.parse(request.getParameter("FechaLlegada"), formatter);
        } catch (Exception e) {
            System.err.println("Error al parsear la fecha: " + e.getMessage());
        }
        Descarga carga = new Descarga(id,fechaLlegada,observacion,almacenID);
        
        controladora.crearDescarga(carga);
        response.sendRedirect("AltaDescarga.jsp");
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
