/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Armando
 */
@WebServlet(name = "servletRegistrarSolic", urlPatterns = {"/servletRegistrarSolic"})
public class servletRegistrarSolic extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            /*Datos de la solicitud*/
            String anho = request.getParameter("txtAnho");
            String modalidad = request.getParameter("selectModalidad");
            String periodo = request.getParameter("selectPeriodo");
            String codCurso = request.getParameter("selectCodigoCurso");
            String grupo = request.getParameter("selectGrupo");
            String inconsistencia = request.getParameter("selectTipoIncons");

            /*Datos del Solicitante*/
            String idSolicitante = request.getParameter("txtIDSolicitante");
            String nombreSolictante = request.getParameter("txtNombreSolicitante");

            /*Datos del Afectado*/
            String idAfectado = request.getParameter("txtIDAfectado");
            String nombreAfectado = request.getParameter("txtNombreAfectado");
            String correoAfectado = request.getParameter("txtCorreoAfectado");
            String telefonoAfectado = request.getParameter("txtTelefonoAfectado");

            response.sendRedirect("index.html");
            
            /* 
             out.println("<!DOCTYPE html>");
             out.println("<html>");
             out.println("<head>");
             out.println("<title>Servlet servletSolicitudes</title>");            
             out.println("</head>");
             out.println("<body>");
             out.println("<h1>Año de la solicitud " + anho + "</h1>");
             out.println("<h1>Año de la solicitud " + modalidad + "</h1>");
             out.println("<h1>Año de la solicitud " + periodo + "</h1>");
             out.println("<h1>Año de la solicitud " + codCurso + "</h1>");
             out.println("<h1>Año de la solicitud " + grupo + "</h1>");
             out.println("<h1>Año de la solicitud " + inconsistencia + "</h1>");
             out.println("<h1>Año de la solicitud " + idSolicitante + "</h1>");
             out.println("<h1>Año de la solicitud " + nombreSolictante + "</h1>");
             out.println("<h1>Año de la solicitud " + idAfectado + "</h1>");
             out.println("<h1>Año de la solicitud " + nombreAfectado + "</h1>");
             out.println("<h1>Año de la solicitud " + correoAfectado + "</h1>");
             out.println("<h1>Año de la solicitud " + telefonoAfectado + "</h1>");
             out.println("</body>");
             out.println("</html>");
             */
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
