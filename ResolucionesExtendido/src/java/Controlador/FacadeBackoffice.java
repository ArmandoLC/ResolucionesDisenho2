
package Controlador;

import DTOs.DTOCurso;
import DTOs.DTOEstadoSolicitud;
import DTOs.DTOLogin;
import DTOs.DTOPersona;
import DTOs.DTOPlantilla;
import DTOs.DTORegistroUsuario;
import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import Enums.Estado;
import Enums.Formato;
import java.util.ArrayList;
import java.util.Date;


public class FacadeBackoffice extends Facade implements IBackoffice, ISolicitud, ICoordinador{

    public FacadeBackoffice() {
        super();
    }

    
    
    @Override
    public ArrayList<DTOPlantilla> ConsultarPlantillas() {
        return ctrl.ConsultarPlantillas();
    }

    @Override
    public int CrearPlantilla(DTOPlantilla dtoPlantilla) {
        return ctrl.CrearPlantilla(dtoPlantilla);
    }

    @Override
    public DTOResolucion InterpretarPlantilla(DTOPlantilla dtoPlantilla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ModificarPlantilla(DTOPlantilla dtoPlantilla) {
        return ctrl.ModificarPlantilla(dtoPlantilla);
    }

    @Override
    public boolean ModificarResolucion(DTOResolucion dtoResolucion) {
        return ctrl.ModificarResolucion(dtoResolucion);
    }

    @Override
    public boolean ModificarSolicitud(DTOEstadoSolicitud dtoEstadoSolicitud) {
        return ctrl.ModificarSolicitud(dtoEstadoSolicitud);
    }

    @Override
    public boolean CambiarContrasenha(DTOLogin dtoLogin) {
        return ctrl.CambiarContrasenha(dtoLogin);
    }

    @Override
    public ArrayList<DTOSolicitud> ConsultarSolicitudes() {
        return ctrl.ConsultarSolicitudes();
    }

    @Override
    public int RegistrarSolicitud(DTOSolicitud dtos) {
        return ctrl.RegistrarSolicitud(dtos);
    }

    @Override
    public DTOCurso ConsultarCurso(int i) {
        return ctrl.ConsultarCurso(i);
    }

    @Override
    public ArrayList<DTOCurso> ConsultarCursos() {
        return ctrl.ConsultarCursos();
    }

    @Override
    public ArrayList<String> ConsultarInconsistencias() {
        return ctrl.ConsultarInconsistencias();
    }

    @Override
    public ArrayList<Integer> ConsultarGrupos(String string) {
        return ctrl.ConsultarGrupos(string);
    }

    @Override
    public ArrayList<DTOSolicitud> consultarSolicitudesEstudiante(String string) {
        return ctrl.consultarSolicitudesEstudiante(string);
    }

    @Override
    public boolean RegistrarInconsistencia(String string) {
        return ctrl.RegistrarInconsistencia(string);
    }

    @Override
    public ArrayList<DTOSolicitud> ConsultarSolicitudes(Estado estado) {
        return ctrl.ConsultarSolicitudes(estado);
    }

    @Override
    public boolean RegistrarSolicitudes(String string) {
        return ctrl.RegistrarSolicitudes(string);
    }

    @Override
    public boolean TramitarSolicitud(int i) {
        return ctrl.TramitarSolicitud(i);
    }

    @Override
    public boolean AnularSolicitud(int i, String string) {
        return ctrl.AnularSolicitud(i, string);
    }

    @Override
    public boolean RegistrarResolucion(DTOResolucion dtor) {
        return ctrl.RegistrarResolucion(dtor);
    }

    @Override
    public DTOResolucion ConsultarResolucion(int i) {
        return ctrl.ConsultarResolucion(i);
    }

    @Override
    public boolean GuardarResolucion(int i, Formato frmt, String string) {
        return ctrl.GuardarResolucion(i, frmt, string);
    }

    @Override
    public DTOPersona ConsultarProfesor(int i) {
        return ctrl.ConsultarProfesor(i);
    }

    @Override
    public ArrayList<DTOSolicitud> ConsultarSolicitudesAtendidas(Date date, Date date1) {
        return ctrl.ConsultarSolicitudesAtendidas(date, date);
    }

    @Override
    public ArrayList<DTOPersona> ConsultarTopProfesores(int i) {
        return ctrl.ConsultarTopProfesores(i);
    }

    @Override
    public ArrayList<DTOCurso> ConsultarTopCursos(int i) {
        return ctrl.ConsultarTopCursos(i);
    }

    @Override
    public boolean RegistrarUsuario(DTORegistroUsuario dtoRegistroUsuario) {
        return ctrl.RegistrarUsuario(dtoRegistroUsuario);
    }
    
}
