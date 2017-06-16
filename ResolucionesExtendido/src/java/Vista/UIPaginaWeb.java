
package Vista;

import Controlador.FacadePaginaWeb;
import DTOs.DTOSolicitud;


public class UIPaginaWeb {
    
    private FacadePaginaWeb facade;
    
    public UIPaginaWeb() {
        this.facade = new FacadePaginaWeb();
    }   
    
    public int RegistrarSolicitud(DTOSolicitud dtoSolicitud)
    {
        return facade.RegistrarSolicitud(dtoSolicitud);
    }
    
    public void ConsultarSolicitud()
    {
        
    }
    
    public void ConsultarResolucion()
    {
        
    }
}
