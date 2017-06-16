
package Controlador;

import DTOs.DTOLogin;


public interface IContrasenha {
    
    public boolean CambiarContrasenha(DTOLogin dtoLogin, 
                                      DAOMySQLExtendido daoMySQL
                                     );
    
}
