package Controlador;

import DTOs.DTOEstadoSolicitud;
import DTOs.DTOLogin;
import DTOs.DTOPlantilla;
import DTOs.DTORegistroUsuario;
import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import DTOs.DTOUsuario;
import Enums.Formato;
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
        this.ConsultarPlantillas("");
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
    public ArrayList<DTOPlantilla> ConsultarPlantillas(String categoria) {
        ArrayList<DTOPlantilla> listPlantillas = new ArrayList<>();
        try {
            listPlantillas = daoBD.ConsultarPlantillas(categoria);
            this.plantillas = new ArrayList<>();
            listPlantillas.forEach((DTOPlantilla) -> setPlantillas(DTOPlantilla));
        } catch (Exception e) {
        }
        ArrayList<DTOPlantilla> listPlantillasResult = new ArrayList<>();
         for(DTOPlantilla dtoPlantilla: listPlantillas){
             if(dtoPlantilla.getSiglas().equals(categoria)){
                 listPlantillasResult.add(dtoPlantilla);
             }
         }
        return listPlantillasResult;
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

    public DTOResolucion InterpretarPlantilla(DTOPlantilla dtoPlantilla, DTOSolicitud dtoSolicitud, Interpretacion estrategia){
        IContext context;
        DTOResolucion dtoResolucion = new DTOResolucion();
        
        try
        {
            // Se crea la estrategia de interpretacion que se va implementar
            if (estrategia.equals(Interpretacion.Consultar)) {
                String nombreDirector = getPropiedad("nombreDirectorEscuela");
                String nombreCoordinador = getPropiedad("nombreCoordinador");
                String nombreDirectorAdmYReg = getPropiedad("nombreDirectorAdmYReg");

                context = new ContextConsultar(nombreDirector, nombreCoordinador, nombreDirectorAdmYReg);
            } else {
                context = new ContextGenerar(dtoSolicitud);
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
        }
        catch(Exception e){}
        return dtoResolucion;        
    }

    @Override
    public boolean ModificarPlantilla(DTOPlantilla dtoPlantilla) {

        boolean modificada = false;
        try {
            modificada = daoBD.ModificarPlantilla(dtoPlantilla);
            ConsultarPlantillas("");

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

    
    @Override
    public DTOPlantilla ConsultarPlantilla(String siglas) {
        DTOPlantilla dtoPlantilla = new DTOPlantilla();
        for(Plantilla plantilla: this.plantillas){
            if(plantilla.getSiglas().equals(siglas)){
                dtoPlantilla.setnConsecutivo(plantilla.getnConsecutivo());
                dtoPlantilla.setSiglas(plantilla.getSiglas());
                dtoPlantilla.setIntroduccion(plantilla.getIntroduccion());
                dtoPlantilla.setResultado(plantilla.getResultado());
                dtoPlantilla.setConsiderandos(plantilla.getConsiderandos());
                dtoPlantilla.setResulevo(plantilla.getResuelvo());
            }
        }
        return dtoPlantilla;
    }

    @Override
    public boolean RegistrarResolucion(DTOResolucion dtoResolucion, DTOSolicitud dtoSolicitud, Interpretacion estrategia) {
        /*Utilizacion del interprete para eliminar los tokens de la solicitud*/
        DTOPlantilla dtoPlantilla = new DTOPlantilla(-1, dtoSolicitud.getInconsistencia(), dtoResolucion.getIntroduccion(), dtoResolucion.getResultado(), dtoResolucion.getConsiderandos(), dtoResolucion.getResuelvo());
        dtoResolucion  = InterpretarPlantilla(dtoPlantilla, dtoSolicitud, estrategia);
        dtoResolucion.setIdSolicitud(dtoSolicitud.getId());
        
        return RegistrarResolucion(dtoResolucion);
    }
    
    @Override
    public DTOResolucion InterpretarResolucion(DTOResolucion dtoResolucion, DTOSolicitud dtoSolicitud, Interpretacion estrategia) {
        /*Utilizacion del interprete para eliminar los tokens de la solicitud*/
        DTOPlantilla dtoPlantilla = new DTOPlantilla(-1, dtoSolicitud.getInconsistencia(), dtoResolucion.getIntroduccion(), dtoResolucion.getResultado(), dtoResolucion.getConsiderandos(), dtoResolucion.getResuelvo());
        dtoResolucion  = InterpretarPlantilla(dtoPlantilla, dtoSolicitud, estrategia);
        dtoResolucion.setIdSolicitud(dtoSolicitud.getId());
        
        return dtoResolucion;
    }
    
    @Override
    public boolean GuardarResolucion(int nSolicitud, Formato formato, String ruta ) {
        
        FactoryDAOSolicitud factorySolicitudes = new FactoryDAOSolicitud();
        DAOMySQL DB = (DAOMySQL) factorySolicitudes.CrearDAOSolicitud(Recurso.MySQL);
        Resolucion resolucion = DB.ConsultarResolucion(nSolicitud);
        DTOResolucion dtoResolucion = InterpretarResolucion(ConsultarResolucion(nSolicitud), ConsultarSolicitud(nSolicitud), Interpretacion.Consultar);
        resolucion.setIntroduccion(dtoResolucion.getIntroduccion());
        resolucion.setConsiderandos(dtoResolucion.getConsiderandos());
        resolucion.setResultado(dtoResolucion.getResultado());
        resolucion.setResuelvo(dtoResolucion.getResuelvo());
        
        IGeneradorResolucion estrategiaGeneracion;
        if (formato.equals(Formato.HTML)) {
            estrategiaGeneracion = new GeneradorResolucionHTML();
        } else {
            estrategiaGeneracion = new GeneradorResolucionPDF();
        }
        
        return estrategiaGeneracion.Generar(resolucion, ruta);
    }
}
