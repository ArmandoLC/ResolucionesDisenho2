
package Vista;

import Controlador.FacadePaginaWeb;
import Controlador.IConsultaSolicitud;
import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import java.util.Properties;


public class UIPaginaWeb implements IConsultaSolicitud{
    
    private FacadePaginaWeb facade;
    
    public UIPaginaWeb() {
        this.facade = new FacadePaginaWeb();
    }   
    
    @Override
    public int RegistrarSolicitud(DTOSolicitud dtoSolicitud)
    {
        return facade.RegistrarSolicitud(dtoSolicitud);
    }
    
    @Override
    public DTOSolicitud ConsultarSolicitud(int nSolicitud) {
        return facade.ConsultarSolicitud(nSolicitud);
    }

    @Override
    public String ConsultarScriptResolucion(int nSolicitud, Properties prop) {
        return facade.ConsultarScriptResolucion(nSolicitud, prop);
    }
}
