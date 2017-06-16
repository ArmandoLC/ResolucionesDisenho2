
package Controlador;

import DTOs.DTORegistroUsuario;


public class Sesion {

    private static Sesion instance;
    private DTORegistroUsuario usuario;

    public static Sesion getInstance() {
        if(instance == null)
            instance = new Sesion();
        return instance;
    }

    public DTORegistroUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(DTORegistroUsuario usuario) {
        this.usuario = usuario;
    }

}
