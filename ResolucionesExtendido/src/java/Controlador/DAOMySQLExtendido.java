
package Controlador;

import DTOs.DTOEstadoSolicitud;
import DTOs.DTOLogin;
import DTOs.DTOPlantilla;
import DTOs.DTOResolucion;
import DTOs.DTOSolicitud;
import DTOs.DTOUsuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DAOMySQLExtendido extends DAOMySQL implements IBackoffice{

    
    public DTOUsuario RealizarLogin(DTOLogin dtoLogin)
    {
        DTOUsuario dtoUsuario = null;
        ResultSet rs;
        
        try {
                       
            CallableStatement conexionSP = obtenerConexionSP("{call RealizarLogin(?,?)}");
                        
            
            conexionSP.setString("usuario", dtoLogin.getNombreUsuario());
            conexionSP.setString("contrasenha", dtoLogin.getContrasenhaAct());
            
            rs = conexionSP.executeQuery(); 

            while (rs.next() )
            {
             dtoUsuario = new DTOUsuario(   rs.getString("tipoUsuario"),
                                            rs.getString("id"),
                                            rs.getString("nombre"),
                                            rs.getString("correo"),
                                            rs.getString("telefono")
                                        );   
            }
        } 
        catch (Exception e) 
        {
            dtoUsuario = null;
        }
        
        return dtoUsuario;
    }

    @Override
    public ArrayList<DTOPlantilla> ConsultarPlantillas() {
              
        ResultSet rs;
        ArrayList<DTOPlantilla> retorno = new ArrayList<>();
        
        try {
            
            CallableStatement conexionSP = obtenerConexionSP("{call consultarPlantillas()}");
            
            rs = conexionSP.executeQuery(); 

            while (rs.next() )
            {
                retorno.add(new DTOPlantilla(   rs.getInt("idPlantilla"),
                                                rs.getString("siglas"),
                                                rs.getString("introduccion"),
                                                rs.getString("resultado"),
                                                rs.getString("considerandos"),
                                                rs.getString("resuelvo")
                                            ));
            }
        } 
        catch (Exception e) 
        {
            return new ArrayList<>();
        }
  
        return retorno;
    }

    @Override
    public int CrearPlantilla(DTOPlantilla dtoPlantilla) {      
        
        ResultSet rs; int lastID = -1;
        
        try {
                       
            CallableStatement conexionSP = obtenerConexionSP("{call registrarPlantilla(?,?,?,?,?)}");
                        
            
            conexionSP.setString("siglas", dtoPlantilla.getSiglas());
            conexionSP.setString("introduccion", dtoPlantilla.getIntroduccion());
            conexionSP.setString("resultado", dtoPlantilla.getResultado());
            conexionSP.setString("considerandos", dtoPlantilla.getConsiderandos());
            conexionSP.setString("resuelvo", dtoPlantilla.getResuelvo());
            
            rs = conexionSP.executeQuery(); 

            while (rs.next() )
            {
                lastID = rs.getInt("ultimoID");
            }
        } 
        catch (Exception e) 
        {
            return -1;
        }
        return lastID;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DTOResolucion InterpretarPlantilla(DTOPlantilla dtoPlantilla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ModificarPlantilla(DTOPlantilla dtoPlantilla) {
        try {
                       
            CallableStatement conexionSP = obtenerConexionSP("{call actualizarPlantilla(?,?,?,?,?,?)}");
                        
            conexionSP.setInt("nConsecutivo", dtoPlantilla.getnConsecutivo());
            conexionSP.setString("siglas", dtoPlantilla.getSiglas());
            conexionSP.setString("introduccion", dtoPlantilla.getIntroduccion());
            conexionSP.setString("resultado", dtoPlantilla.getResultado());
            conexionSP.setString("considerandos", dtoPlantilla.getConsiderandos());
            conexionSP.setString("resuelvo", dtoPlantilla.getResuelvo());
            
            conexionSP.executeQuery(); 
            
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
    }

    @Override
    public boolean ModificarResolucion(DTOResolucion dtoResolucion) {
        try {
                       
            CallableStatement conexionSP = obtenerConexionSP("{call ModificarResolucion(?,?,?,?,?)}");
                        
            conexionSP.setInt("idSolicitud", dtoResolucion.getIdSolicitud());
            conexionSP.setString("introduccion", dtoResolucion.getIntroduccion());
            conexionSP.setString("resultado", dtoResolucion.getResultado());
            conexionSP.setString("considerandos", dtoResolucion.getConsiderandos());
            conexionSP.setString("resuelvo", dtoResolucion.getResuelvo());
            
            conexionSP.executeQuery(); 
            
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
    }

    @Override
    public boolean ModificarSolicitud(DTOEstadoSolicitud dtoEstadoSolicitud) {
        try {
                       
            CallableStatement conexionSP = obtenerConexionSP("{call ActIncostSolicitud(?,?)}");
                        
            conexionSP.setInt("id", dtoEstadoSolicitud.getSolicitudID());
            conexionSP.setString("inconsistencia", dtoEstadoSolicitud.getInconsistencia());
            
            conexionSP.executeQuery(); 
            
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
    }

    @Override
    public boolean CambiarContrasenha(DTOLogin dtoLogin) {
        
        boolean modificada = false;
        ResultSet rs;
        
        try {
                       
            CallableStatement conexionSP = obtenerConexionSP("{call CambiarContrasenha(?,?,?)}");
                        
            conexionSP.setString("usuario", dtoLogin.getNombreUsuario());
            conexionSP.setString("contrasenhaAct", dtoLogin.getContrasenhaAct());
            conexionSP.setString("contrasenhaNueva", dtoLogin.getContrasenhaNueva());
            
            rs = conexionSP.executeQuery(); 
            
            while (rs.next()) modificada = true;
        } 
        catch (Exception e) 
        {
            modificada = false;
        }
        return modificada;
    }
    
    
    private CallableStatement obtenerConexionSP(String procAlmacenado) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        conexion = DriverManager.getConnection(ruta, user, pass);            
        return conexion.prepareCall(procAlmacenado);
        
    }
    
    public DAOMySQLExtendido() {
        super();
        setRutaConexion("jdbc:mysql://localhost:3306/resolucionesbd?useSSL=false");
    }
    
    
    private String user = "root"; 
    private String pass = "1234";
    private Connection conexion;
    
}
