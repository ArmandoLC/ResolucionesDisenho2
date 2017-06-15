
package Controlador;

import DTOs.DTOSolicitud;
import DTOs.DTOResolucion;


public class FacadePaginaWeb extends Facade {

    public FacadePaginaWeb() {
        super();
    }    
    
    public int RegistrarSolicitud(DTOSolicitud dtoSolicitud)
    {
        return 0;
    }
    
    public DTOSolicitud ConsultarSolicitud(int nSolicitud)
    {
        return null;
    }
    
    public DTOResolucion ConsultarResolucion(int nSolicitud)
    {
        return null;
    }
}
