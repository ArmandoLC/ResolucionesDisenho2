
package Controlador;

import DTOs.*;
import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import Enums.Interpretacion;
import java.io.IOException;
import java.util.ArrayList;


public interface IBackoffice {
    
    public ArrayList<DTOPlantilla> ConsultarPlantillas(String categoria);
    
    public DTOPlantilla ConsultarPlantilla(String siglas);
    
    public int CrearPlantilla(DTOPlantilla dtoPlantilla);
        
    public boolean ModificarPlantilla(DTOPlantilla dtoPlantilla);
    
    public boolean ModificarResolucion(DTOResolucion dtoResolucion);
    
    public boolean ModificarSolicitud(DTOEstadoSolicitud dtoEstadoSolicitud);
    
    public boolean CambiarContrasenha(DTOLogin dtoLogin);
    
    public boolean RegistrarUsuario(DTORegistroUsuario dtoRegistroUsuario);
    
    public boolean RegistrarResolucion(DTOResolucion dtoResolucion, DTOSolicitud  dtoSolicitud, Interpretacion estrategia);
    
    public DTOResolucion InterpretarResolucion(DTOResolucion dtoResolucion, DTOSolicitud  dtoSolicitud, Interpretacion estrategia);
}
