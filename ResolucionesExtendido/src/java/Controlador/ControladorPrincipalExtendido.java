
package Controlador;

import DTOs.DTOLogin;
import DTOs.DTOPlantilla;
import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import DTOs.DTOUsuario;
import Modelo.Plantilla;
import java.util.ArrayList;


public class ControladorPrincipalExtendido extends ControladorPrincipal implements ILogin, IBackoffice{

    private ArrayList<Plantilla> plantillas;
    private DAOMySQLExtendido daoBD;
    private IContrasenha proxyContrasenha;

    public ControladorPrincipalExtendido() {
        super();
        this.plantillas = new ArrayList<Plantilla>();
        this.daoBD = new DAOMySQLExtendido();
        this.proxyContrasenha = new ControlPermiso();
        this.CargarPlantillas();
    }
    
    public void CargarPlantillas()
    {
        // Escribir metodo
    }
    @Override
    public DTOUsuario RealizarLogin(DTOLogin dtoLogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
