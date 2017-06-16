/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author Andrey
 */
public class DTOEstadoSolicitud {
    
    private int solicitudID;
    private String inconsistencia;

    public DTOEstadoSolicitud() {
    }

    public DTOEstadoSolicitud(int solicitudID, String inconsistencia) {
        this.solicitudID = solicitudID;
        this.inconsistencia = inconsistencia;
    }

    public int getSolicitudID() {
        return solicitudID;
    }

    public void setSolicitudID(int solicitudID) {
        this.solicitudID = solicitudID;
    }

    public String getInconsistencia() {
        return inconsistencia;
    }

    public void setInconsistencia(String incosistencia) {
        this.inconsistencia = incosistencia;
    }
    
}
