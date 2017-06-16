
package Controlador;

import DTOs.DTOLogin;
import DTOs.DTORegistroUsuario;


public class CambioContrasenha implements IContrasenha {
 
    
    @Override
    public boolean CambiarContrasenha(DTOLogin dtoLogin, DAOMySQLExtendido daoMySQL) {
        
        boolean modificada = false;
        try
        {
            modificada = daoMySQL.CambiarContrasenha(dtoLogin);
            
            if (modificada)
            {
                Sesion s = Sesion.getInstance();
                DTORegistroUsuario dto = s.getUsuario();
                
                dto.setContrasenha(dtoLogin.getContrasenhaNueva());                
                s.setUsuario(dto);
            }
            
        }
        catch (Exception e)
        {
            return false;
        }  
        
        return modificada;
    }
    
    
}
