/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DTOs.DTOSolicitud;
import Vista.UIPaginaWeb;
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
@WebServlet(name = "servletConsultarSolic", urlPatterns = {"/servletConsultarSolic"})
public class servletConsultarSolic extends HttpServlet {

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

            /*ID de la consulta*/
            int nSolicitud = Integer.parseInt(request.getParameter("txtIDSolicitud"));

            /*Se procede a ejecutar el registro de la solicitud*/
            DTOSolicitud dtoSolicitud = uiPaginaWeb.ConsultarSolicitud(nSolicitud);
            String msj;
            String carousel;
            if (dtoSolicitud != null) {
                String resolucion = "</h2>La solicitud aún no cuenta con una resolución</h2>";
                if (dtoSolicitud.getnResolucion()!=-1) {
                    resolucion = "<h2>La solicitud ya cuenta con una resolución</h2>";
                }
                msj = "<div class=\"margin alert alert-success\"><strong>Éxito!</strong> Estos son los datos de la solicitud con ID #" + nSolicitud +"<br>"+ resolucion+ "</div>";
                carousel = "<div class=\"container marginTop\"><div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\"><ol class=\"carousel-indicators\"><li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\" title=\"Datos de la solicitud\"></li><li data-target=\"#myCarousel\" data-slide-to=\"1\" title=\"Datos del Solicitante\"></li><li data-target=\"#myCarousel\" data-slide-to=\"2\" title=\"Datos del Afectado\"></li><li data-target=\"#myCarousel\" data-slide-to=\"3\" title=\"Descripción\"></li></ol><div class=\"carousel-inner h200\"><div class=\"item active \"><div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12 col-centered\"><div class=\"txt-block\"><h3><i class=\"fa fa-clipboard fa-2x\"></i> Datos de la Solicitud</h3><div class=\"form-group\"><label for=\"txtAnhoVer\">Fecha de Registro:</label><label class=\"form-control\" name=\"txtAnhoVer\">"+dtoSolicitud.getFecha()+"</label></div><div class=\"form-group\"><label for=\"selectModalidadVer\">Periodo:</label><label class=\"form-control\" name=\"selectModalidadVer\">"+dtoSolicitud.getPeriodo()+"</label></div><div class=\"form-group\"><label for=\"selectCodigoCursoVer\">Código del Curso:</label><label class=\"form-control\" name=\"selectCodigoCursoVer\">"+dtoSolicitud.getCodigoCurso()+"</label></div><div class=\"form-group\"><label for=\"selectGrupoVer\">Grupo:</label><label class=\"form-control\" name=\"selectGrupoVer\">"+String.valueOf(dtoSolicitud.getnGrupo())+"</label></div><div class=\"form-group\"><label for=\"selectTipoInconsVer\">Tipo de Inconsistencia:</label><label class=\"form-control\" name=\"selectTipoInconsVer\">"+dtoSolicitud.getInconsistencia()+"</label></div></div></div></div><div class=\"item\"><div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12 col-centered\"><div class=\"txt-block\"><h3><i class=\"fa fa-user fa-2x\"></i> Datos del Solicitante</h3><div class=\"form-group\"><label for=\"txtIDSolicitanteVer\">Identificación:</label><label class=\"form-control\" id=\"txtIDSolicitante\" >"+dtoSolicitud.getIdSolicitante()+"</label></div><div class=\"form-group\"><label for=\"txtNombreSolicitanteVer\">Nombre:</label><label class=\"form-control\" id=\"txtNombreSolicitanteVer\">"+dtoSolicitud.getNombreSolicitante()+"</label></div></div></div></div><div class=\"item\"><div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12 col-centered\"><div class=\"txt-block\"><h3><i class=\"fa fa-address-card-o fa-2x\"></i> Datos del afectado</h3><div class=\"form-group\"><label for=\"txtIDAfectadoVer\">Identificación:</label><label class=\"form-control\" id=\"txtIDAfectadoVer\">"+dtoSolicitud.getIdAfectado()+"</label></div><div class=\"form-group\"><label for=\"txtNombreAfectadoVer\">Nombre:</label><label class=\"form-control\" id=\"txtNombreAfectadoVer\">"+dtoSolicitud.getNombreAfectado()+"</label></div><div class=\"form-group\"><label for=\"txtCorreoAfectadoVer\">Correo:</label><label class=\"form-control\" id=\"txtCorreoAfectadoVer\">"+dtoSolicitud.getCorreoAfectado()+"</label></div><div class=\"form-group\"><label for=\"txtTelefonoAfectadoVer\">Telefono:</label><label class=\"form-control\" id=\"txtTelefonoAfectadoVer\">"+dtoSolicitud.getTelefonoAfectado()+"</label></div></div></div></div><div class=\"item\"><div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12 col-centered\"><div class=\"txt-block\"><h3><i class=\"fa fa-question-circle-o fa-2x\"></i> Descripción del Problema</h3><div class=\"form-group\"><textarea class=\"form-control\" rows=\"10\" id=\"descProblema\" disabled>"+dtoSolicitud.getDescripcionDetallada()+"</textarea></div></div></div></div></div><a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\"><span class=\"glyphicon glyphicon-chevron-left\"></span><span class=\"sr-only\">Anterior</span></a><a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\"><span class=\"glyphicon glyphicon-chevron-right\"></span><span class=\"sr-only\">Siguiente</span></a></div></div>";

            } else {
                msj = "<div class=\"margin alert alert-danger\"><strong>Error!</strong> La solicitud <strong>no</strong> pudo ser consultada</div>";
                carousel = "";
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

            out.println("<form id=\"consulta-sec\" name=\"registro\" class=\"marginTop2\" action=\"servletConsultarSolic\" method=\"POST\">");
            out.println("<div class=\"container\" >");
            out.println("<div class=\"row text-center\">");
            out.println("<div class=\"col-md-12 marginTop2\">");
            out.println("<h3 class=\"head-line\"><span class=\"cGris fa-2x\"><i class=\"fa fa-list-alt\" aria-hidden=\"true\"></i></span> Consulta de la Solicitud<span ></span> </h3>");
            out.println("<h3 >"+msj+"</h3>");
            out.println("</div></div></div>");
            out.println("</form>");
            
            out.println(carousel);
            
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
