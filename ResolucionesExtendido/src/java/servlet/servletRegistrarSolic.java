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

import DTOs.DTOSolicitud;
import Vista.UIPaginaWeb;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Armando
 */
@WebServlet(name = "servletRegistrarSolic", urlPatterns = {"/servletRegistrarSolic"})
public class servletRegistrarSolic extends HttpServlet {

    private final UIPaginaWeb uiPaginaWeb = new UIPaginaWeb();

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
            int anho = Integer.parseInt(request.getParameter("txtAnho"));
            String modalidad = request.getParameter("selectModalidad");
            String periodo = request.getParameter("selectPeriodo");
            periodo = periodo + modalidad + String.valueOf(anho);
            String codCurso = request.getParameter("selectCodigoCurso");
            int grupo = Integer.parseInt(request.getParameter("selectGrupo"));
            String inconsistencia = request.getParameter("selectTipoIncons");

            /*Datos del Solicitante*/
            String idSolicitante = request.getParameter("txtIDSolicitante");
            String nombreSolictante = request.getParameter("txtNombreSolicitante");

            /*Datos del Afectado*/
            String idAfectado = request.getParameter("txtIDAfectado");
            String nombreAfectado = request.getParameter("txtNombreAfectado");
            String correoAfectado = request.getParameter("txtCorreoAfectado");
            String telefonoAfectado = request.getParameter("txtTelefonoAfectado");

            /*Descripción del problema*/
            String descProblema = request.getParameter("descProblema");

            /*Contrucción del DTOSolicitud que se envia para el registro*/
            DTOSolicitud dtoSolicitud = new DTOSolicitud(0, Calendar.getInstance().getTime(), idSolicitante, nombreSolictante, periodo, codCurso, 1, idAfectado, nombreAfectado, correoAfectado, telefonoAfectado, inconsistencia, descProblema, "", "Pendiente", "", -1);

            //String x = getServletContext().getRealPath("WEB-INF\\PropertiesFile.properties");
            //FileInputStream file = new FileInputStream(new File(getServletContext().getRealPath("WEB-INF\\PropertiesFile.properties")));

            /*Se procede a ejecutar el registro de la solicitud*/
            int idIngresado = uiPaginaWeb.RegistrarSolicitud(dtoSolicitud);
            String msj;
            if (idIngresado != -1) {
                msj = "<div class=\"margin alert alert-success\"><strong>Éxito!</strong> Solicitud Registrada satisfactoriamente<br>El identificador es: "+idIngresado+"</div>";
            } else {
                msj = "<div class=\"margin alert alert-danger\"><strong>Error!</strong> La solicitud <strong>no</strong> pudo ser registrada</div>";
            }

            out.println("﻿<!DOCTYPE html>");
            out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
            out.println("<head>");
            out.println("<title>Resoluciones</title>");
            out.println("<link rel=\"icon\" href=\"assets/img/logo3.png\">");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />");
            out.println("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />");
            out.println("<link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />");
            out.println("<link href=\"assets/css/prettyPhoto.css\" rel=\"stylesheet\" />");
            out.println("<link href=\"assets/css/custom.css\" rel=\"stylesheet\" />    ");
            out.println("<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />");
            out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">");
            out.println("</head>");

            out.println("<body  >");
            out.println("<div id=\"nav-wrapper\" >");
            out.println("<div class=\"navbar navbar-inverse \" >");
            out.println("<div class=\"container\">");
            out.println("<div class=\"navbar-header \">");
            out.println("<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">");
            out.println("<span class=\"icon-bar\"></span>");
            out.println("<span class=\"icon-bar\"></span>");
            out.println("<span class=\"icon-bar\"></span>");
            out.println("</button>");
            out.println("<a class=\"navbar-brand\" href=\"#\"><img src=\"assets/img/logo2.png\" alt=\"\" /></a>");
            out.println("</div>");
            out.println("<div class=\"navbar-collapse collapse \">");
            out.println("<ul class=\"nav navbar-nav navbar-right\">");
            out.println("<li><a href=\"index.html\">Registrar Solicitud</a></li>");
            out.println("<li><a href=\"consultarSolicitud.html\">Consultar Solicitud</a></li>");
            out.println("<li><a href=\"consultarResolucion.html\">Consultar Resolucion</a></li>");
            out.println("</ul>");
            out.println("</div></div></div></div>");

            out.println("<form id=\"consulta-sec\" name=\"registro\" class=\"marginTop2\" action=\"servletRegistrarSolic\" method=\"POST\">");
            out.println("<div class=\"container\" >");
            out.println("<div class=\"row text-center\">");
            out.println("<div class=\"col-md-12 marginTop2\">");
            out.println("<h3 class=\"head-line\"><span class=\"cGris fa-2x\"><i class=\"fa fa-list-alt\" aria-hidden=\"true\"></i></span> Registro de Solicitudes<span ></span> </h3>");
            out.println("<h3 >"+msj+"</h3>");
            out.println("</div></div></div>");
            
            
            out.println("</form>");

            out.println("<script src=\"assets/js/jquery-1.11.1.js\"></script>");
            out.println("<script src=\"assets/js/bootstrap.js\"></script>");
            out.println("<script src=\"assets/js/jquery.easing.min.js\"></script>");
            out.println("<script src=\"assets/js/jquery.mb.YTPlayer.js\"></script>");
            out.println("<script src=\"assets/js/jquery.prettyPhoto.js\"></script>");
            out.println("<script src=\"assets/js/jquery.mixitup.min.js\"></script>");
            out.println("<script src=\"assets/js/jquery.nicescroll.min.js\"></script>");
            out.println("<script src=\"assets/js/custom.js\"></script>");
            out.println("</body>");
            out.println("</html>");


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
