/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DTOs.DTOLogin;

/**
 *
 * @author Andrey
 */
public class ControlPermiso implements IContrasenha {
    
    protected CambioContrasenha cuenta;

    public ControlPermiso() {
        this.cuenta = new CambioContrasenha();
    }
    
    
    @Override
    public boolean CambiarContrasenha(String contrasenhaActual, DTOLogin dtoLogin, DAOMySQLExtendido daoMySQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
