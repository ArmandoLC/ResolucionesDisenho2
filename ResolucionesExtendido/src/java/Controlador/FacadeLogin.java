
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
        return ctrl.RealizarLogin(dtoLogin);
    }    
}
