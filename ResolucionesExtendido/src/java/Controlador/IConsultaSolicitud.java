/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import java.util.Properties;

/**
 *
 * @author Armando
 */
public interface IConsultaSolicitud {

    public int RegistrarSolicitud(DTOSolicitud dtoSolicitud);

    public DTOSolicitud ConsultarSolicitud(int nSolicitud);

    public DTOResolucion ConsultarResolucion(int nSolicitud, Properties prop);
}
