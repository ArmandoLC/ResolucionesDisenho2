
package Controlador;

import DTOs.DTOLogin;


public interface IContrasenha {
    
    public boolean CambiarContrasenha(String contrasenhaActual, 
                                      DTOLogin dtoLogin, 
                                      DAOMySQLExtendido daoMySQL
                                     );
    
}
