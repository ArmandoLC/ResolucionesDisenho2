
package Controlador;

import DTOs.*;
import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import java.util.ArrayList;


public interface IBackoffice {
    
    public ArrayList<DTOPlantilla> ConsultarPlantillas();
    
    public int CrearPlantilla(DTOPlantilla dtoPlantilla);
    
    public DTOResolucion InterpretarPlantilla(DTOPlantilla dtoPlantilla);
    
    public boolean ModificarPlantilla(DTOPlantilla dtoPlantilla);
    
    public boolean ModificarResolucion(DTOResolucion dtoResolucion);
    
    public boolean ModificarSolicitud(DTOEstadoSolicitud dtoEstadoSolicitud);
    
    public boolean CambiarContrasenha(DTOLogin dtoLogin);
}