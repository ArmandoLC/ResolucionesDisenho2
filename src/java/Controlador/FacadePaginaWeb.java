
package Controlador;

import DTOs.DTOSolicitud;
import DTOs.DTOResolucion;


public class FacadePaginaWeb extends Facade {

    public FacadePaginaWeb() {
        super();
    }    
    
    public int RegistrarSolicitud(DTOSolicitud dtoSolicitud)
    {
        return ctrl.RegistrarSolicitud(dtoSolicitud);
    }
    
    public DTOSolicitud ConsultarSolicitud(int nSolicitud)
    {        
        return null;
    }
    
    public DTOResolucion ConsultarResolucion(int nSolicitud)
    {
        super.ctrl.ConsultarResolucion(nSolicitud);
        return null;
    }
}
