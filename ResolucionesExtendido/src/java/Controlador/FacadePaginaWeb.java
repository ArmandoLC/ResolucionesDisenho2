
package Controlador;

import DTOs.DTOSolicitud;
import DTOs.DTOResolucion;
import java.util.Properties;


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
    public String ConsultarScriptResolucion(int nSolicitud, Properties prop)
    {
        return ctrl.ConsultarScriptResolucion(nSolicitud, prop);
    }
}
