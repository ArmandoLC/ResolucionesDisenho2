
package Controlador;

import DTOs.DTOLogin;
import DTOs.DTORegistroUsuario;
import DTOs.DTOUsuario;


public class FacadeLogin extends Facade implements ILogin{

    public FacadeLogin() {
        super();
    }

    
    
    @Override
    public DTOUsuario RealizarLogin(DTOLogin dtoLogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
