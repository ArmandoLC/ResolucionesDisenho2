
package Controlador;

import DTOs.DTOSolicitud;
import DTOs.DTOResolucion;


public class FacadePaginaWeb extends Facade implements IConsultaSolicitud{

    public FacadePaginaWeb() {
        super();
    }    
    
    @Override
    public int RegistrarSolicitud(DTOSolicitud dtoSolicitud)
    {
        return ctrl.RegistrarSolicitud(dtoSolicitud);
    }
    
    @Override
    public DTOSolicitud ConsultarSolicitud(int nSolicitud)
    {        
        return ctrl.ConsultarSolicitud(nSolicitud);
    }
    
    @Override
    public DTOResolucion ConsultarResolucion(int nSolicitud, Properties prop)
    {
        return ctrl.ConsultarScriptResolucion(nSolicitud, prop);
    }
}
