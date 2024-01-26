/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package CONTROLADORA;

import MODELO.Almacen;
import MODELO.UbicacionDeAlmacenamiento;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SvUbicacionDeAlmacenamiento", urlPatterns = {"/SvUbicacionDeAlmacenamiento"})
public class SvUbicacionDeAlmacenamiento extends HttpServlet {

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
        long almacenID = Long.parseLong(request.getParameter("IDAlmacen"));
        
        List <Integer> listaUbicaciones = new ArrayList<>();
        listaUbicaciones = controladora.obtenerIDUbicacionesPorIDAlmacen(almacenID);
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaUbicaciones",listaUbicaciones);
        
        response.sendRedirect("MostrarUbicaciones.jsp");
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
        long almacenID = Long.parseLong(request.getParameter("almacenID"));
        int ubicacionID = Integer.parseInt(request.getParameter("ubicacionID"));
        
        UbicacionDeAlmacenamiento ubicacion = new UbicacionDeAlmacenamiento(ubicacionID);
        
        controladora.crearUbicacion(ubicacion);
        controladora.insertarRelacionAlmacenUbicacion(almacenID, ubicacionID);
        response.sendRedirect("AltaUbicacionDeAlmacenamiento.jsp");
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
