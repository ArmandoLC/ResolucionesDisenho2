package Controlador;

import DTOs.DTOEstadoSolicitud;
import DTOs.DTOLogin;
import DTOs.DTOPlantilla;
import DTOs.DTORegistroUsuario;
import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import DTOs.DTOUsuario;
import Enums.Interpretacion;
import Enums.Recurso;
import Modelo.Plantilla;
import Modelo.Resolucion;
import Modelo.Solicitud;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControladorPrincipalExtendido extends ControladorPrincipal implements ILogin, IBackoffice, IConsultaSolicitud {

    private ArrayList<Plantilla> plantillas;
    private DAOMySQLExtendido daoBD;
    private IContrasenha proxyContrasenha;

    public ControladorPrincipalExtendido() {
        super(); // se cargan las premisas

        this.plantillas = new ArrayList<Plantilla>();
        this.daoBD = new DAOMySQLExtendido();
        this.ConsultarPlantillas();
    }

    @Override
    public DTOUsuario RealizarLogin(DTOLogin dtoLogin) {
        DTOUsuario dtoUsuario = null;

        try {
            dtoUsuario = daoBD.RealizarLogin(dtoLogin);

            if (dtoUsuario != null) {
                Sesion s = Sesion.getInstance();
                DTORegistroUsuario usr = new DTORegistroUsuario();

                usr.setContrasenha(dtoLogin.getContrasenhaAct());
                usr.setCorreo(dtoUsuario.getCorreo());
                usr.setId(dtoUsuario.getId());
                usr.setNombre(dtoUsuario.getNombre());
                usr.setNombreUsuario(dtoLogin.getNombreUsuario());
                usr.setTelefono(dtoUsuario.getTelefono());
                usr.setTipoUsuario(dtoUsuario.getTipoUsuario());

                s.setUsuario(usr);
            }

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

            if (lastID != -1) {
                dtoPlantilla.setnConsecutivo(lastID);
                setPlantillas(dtoPlantilla);
            }
            return lastID;

        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public DTOResolucion InterpretarPlantilla(DTOPlantilla dtoPlantilla, DTOSolicitud dtoSolicitud, Interpretacion estrategia){
        IContext context;
        DTOResolucion dtoResolucion = new DTOResolucion();
        
        // Se crea la estrategia de interpretacion que se va implementar
        if (estrategia.equals(Interpretacion.Consultar)) {
            context = new ContextGenerar(dtoSolicitud);
        } else {
            String nombreDirector = getPropiedad("nombreDirectorEscuela");
            String nombreCoordinador = getPropiedad("nombreCoordinador");
            String nombreDirectorAdmYReg = getPropiedad("nombreDirectorAdmYReg");
            
            context = new ContextConsultar(nombreDirector, nombreCoordinador, nombreDirectorAdmYReg);
        }
        
        /*Se procede a interpretar la introduccion de la plantilla*/
        ArrayList<Expresion> tree = new ArrayList();        
        // Añadimos los tokens pasados como argumentos
        for (String token : dtoPlantilla.getIntroduccion().split("\\s", 0)) {
            tree.add(new InterpreteTerminal(token));
        }
        // Interpretamos cada expresión
        for (Expresion e : tree) {
            e.interpretar(context);
        }
        dtoResolucion.setIntroduccion(context.getOutput());
        
        
        /*Se procede a interpretar el resuelvo de la plantilla*/
        tree = new ArrayList();        
        context.setOutput("");
        // Añadimos los tokens pasados como argumentos
        for (String token : dtoPlantilla.getResuelvo().split("\\s", 0)) {
            tree.add(new InterpreteTerminal(token));
        }
        // Interpretamos cada expresión
        for (Expresion e : tree) {
            e.interpretar(context);
        }
        dtoResolucion.setResuelvo(context.getOutput());
        
        
        /*Se procede a interpretar el resultado de la plantilla*/
        tree = new ArrayList();        
        context.setOutput("");
        // Añadimos los tokens pasados como argumentos
        for (String token : dtoPlantilla.getResultado().split("\\s", 0)) {
            tree.add(new InterpreteTerminal(token));
        }
        // Interpretamos cada expresión
        for (Expresion e : tree) {
            e.interpretar(context);
        }
        dtoResolucion.setResultado(context.getOutput());
        
        
        /*Se procede a interpretar las consideraciones de la plantilla*/
        tree = new ArrayList();        
        context.setOutput("");
        // Añadimos los tokens pasados como argumentos
        for (String token : dtoPlantilla.getConsiderandos().split("\\s", 0)) {
            tree.add(new InterpreteTerminal(token));
        }
        // Interpretamos cada expresión
        for (Expresion e : tree) {
            e.interpretar(context);
        }
        dtoResolucion.setConsiderandos(context.getOutput());
        
        dtoResolucion.setIdSolicitud(dtoSolicitud.getId());
        
        return dtoResolucion;        
    }

    @Override
    public boolean ModificarPlantilla(DTOPlantilla dtoPlantilla) {

        boolean modificada = false;
        try {
            modificada = daoBD.ModificarPlantilla(dtoPlantilla);
            ConsultarPlantillas();

            modificada = true;
        } catch (Exception e) {
        }
        return modificada;
    }

    @Override
    public boolean ModificarResolucion(DTOResolucion dtoResolucion) {

        boolean modificada = false;
        try {
            modificada = daoBD.ModificarResolucion(dtoResolucion);
            modificada = true;

        } catch (Exception e) {
        }

        return modificada;
    }

    @Override
    public boolean ModificarSolicitud(DTOEstadoSolicitud dtoEstadoSolicitud) {

        boolean modificada = false;
        try {
            modificada = daoBD.ModificarSolicitud(dtoEstadoSolicitud);
            ConsultarSolicitudes();
            modificada = true;

        } catch (Exception e) {
        }

        return modificada;
    }

    @Override
    public boolean RegistrarUsuario(DTORegistroUsuario dtoRegistroUsuario) {
        try {
            return daoBD.RegistrarUsuario(dtoRegistroUsuario);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean CambiarContrasenha(DTOLogin dtoLogin) {

        try {
            proxyContrasenha = new ControlPermiso();

            return proxyContrasenha.CambiarContrasenha(dtoLogin, daoBD);
        } catch (Exception e) {
            return false;
        }
    }

    private void setPlantillas(DTOPlantilla dtoPlantilla) {
        plantillas.add(new Plantilla(dtoPlantilla.getnConsecutivo(),
                dtoPlantilla.getSiglas(),
                dtoPlantilla.getIntroduccion(),
                dtoPlantilla.getResultado(),
                dtoPlantilla.getConsiderandos(),
                dtoPlantilla.getResuelvo()
        ));
    }

    public ArrayList<Plantilla> getPlantillas() {
        return plantillas;
    }

    @Override
    public DTOSolicitud ConsultarSolicitud(int nSolicitud) {
        FactoryDAOSolicitud factoryDAOSolicitud = getFactorySolicitudes();
        DAOMySQL DB = (DAOMySQL) factoryDAOSolicitud.CrearDAOSolicitud(Recurso.MySQL);
        ArrayList<DTOSolicitud> dtoSolicitudes = DB.ConsultarSolicitudes();

        for (DTOSolicitud dto : dtoSolicitudes) {
            if (dto.getId() == nSolicitud) {
                return dto;
            }
        }
        return null;
    }

    public DTOResolucion ConsultarResolucion(int nSolicitud, Properties prop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
