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
    public boolean CambiarContrasenha(DTOLogin dtoLogin, DAOMySQLExtendido daoMySQL) {
        
        boolean modificada  = false;
        try
        {
            // Se verifica que la contrasenha de la sesion sea la misma que ingresó el usuario
            Sesion sesion = Sesion.getInstance();
            String contrSesion = sesion.getUsuario().getContrasenha();
            
            //Si son iguales, proceder a cambiar la contrasenha
            if (contrSesion.equals(dtoLogin.getContrasenhaAct()))
                modificada = cuenta.CambiarContrasenha(dtoLogin, daoMySQL);
        }
        catch (Exception e)
        {
            modificada = false;
        }          
        return modificada;
    }
    
}
