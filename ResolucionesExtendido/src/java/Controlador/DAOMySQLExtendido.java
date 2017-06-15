
package Controlador;

import DTOs.DTOLogin;
import DTOs.DTOPlantilla;
import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import DTOs.DTOUsuario;
import java.util.ArrayList;


public class DAOMySQLExtendido extends DAOMySQL implements IBackoffice{

    public DAOMySQLExtendido() {
    }
    
    public DTOUsuario RealizarLogin(DTOLogin dtoLogin)
    {
        return null;
    }

    @Override
    public ArrayList<DTOPlantilla> ConsultarPlantillas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean CrearPlantilla(DTOPlantilla dtoPlantilla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DTOResolucion InterpretarPlantilla(DTOPlantilla dtoPlantilla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ModificarPlantilla(DTOPlantilla dtoPlantilla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ModificarResolucion(DTOResolucion dtoResolucion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ModificarSolicitud(DTOSolicitud dtosolicitud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean CambiarContrasenha(DTOLogin dtoLogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
