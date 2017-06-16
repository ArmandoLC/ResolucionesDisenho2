
package Controlador;

import DTOs.DTOEstadoSolicitud;
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
        super(); // se cargan las premisas
        
        this.plantillas = new ArrayList<Plantilla>();
        this.daoBD = new DAOMySQLExtendido();
        this.proxyContrasenha = new ControlPermiso();
        this.ConsultarPlantillas();
    }
    
    
    @Override
    public DTOUsuario RealizarLogin(DTOLogin dtoLogin) {
        DTOUsuario dtoUsuario = null;
                
        try {            
            dtoUsuario = daoBD.RealizarLogin(dtoLogin);            
            
        } catch (Exception e) {
        }
        
        return dtoUsuario;
    }

    @Override
    public ArrayList<DTOPlantilla> ConsultarPlantillas() {
        
        ArrayList<DTOPlantilla> listPlantillas = new ArrayList<>();
                
        try {            
            listPlantillas = daoBD.ConsultarPlantillas();            
            this.plantillas = new ArrayList<>();
            listPlantillas.forEach((DTOPlantilla) -> setPlantillas(DTOPlantilla));
            
        } catch (Exception e) {
        }
        
        return listPlantillas;
    }

    @Override
    public int CrearPlantilla(DTOPlantilla dtoPlantilla) {
        try {            
            int lastID = daoBD.CrearPlantilla(dtoPlantilla);
            
            if (lastID != -1) 
            {
                dtoPlantilla.setnConsecutivo(lastID);
                setPlantillas(dtoPlantilla);
            }
            return lastID;
            
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public DTOResolucion InterpretarPlantilla(DTOPlantilla dtoPlantilla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ModificarPlantilla(DTOPlantilla dtoPlantilla) {
        
        boolean modificada = false;
        try {
            modificada = daoBD.ModificarPlantilla(dtoPlantilla);            
            if (modificada) ConsultarPlantillas();
            
            modificada = true;
        } catch (Exception e) {
        }
        return modificada;
    }

    @Override
    public boolean ModificarResolucion(DTOResolucion dtoResolucion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ModificarSolicitud(DTOEstadoSolicitud dtoEstadoSolicitud) {
        
        boolean modificada = false;
        try {
            modificada = daoBD.ModificarSolicitud(dtoEstadoSolicitud);            
            if (modificada) ConsultarSolicitudes();
            
            modificada = true;
            
        } catch (Exception e) {
        }
        
        return modificada;
    }

    @Override
    public boolean CambiarContrasenha(DTOLogin dtoLogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private void setPlantillas(DTOPlantilla dtoPlantilla)
    {
        plantillas.add(new Plantilla(   dtoPlantilla.getnConsecutivo(),
                                        dtoPlantilla.getSiglas(),
                                        dtoPlantilla.getIntroduccion(),
                                        dtoPlantilla.getResultado(),
                                        dtoPlantilla.getConsiderandos(),
                                        dtoPlantilla.getResuelvo()
                                    ));
    }
    
    public ArrayList<Plantilla> getPlantillas()
    {
        return plantillas;
    }
    
}
