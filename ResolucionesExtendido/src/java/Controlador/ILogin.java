
package Controlador;

import DTOs.DTOLogin;
import DTOs.DTOUsuario;


public interface ILogin {
    
    public DTOUsuario RealizarLogin(DTOLogin dtoLogin);
    
}
