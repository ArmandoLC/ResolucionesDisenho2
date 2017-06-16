
package Controlador;

import DTOs.DTOUsuario;


public class Sesion {

    private static Sesion instance;
    private DTOUsuario usuario;

    public static Sesion getInstance() {
        if(instance == null)
            instance = new Sesion();
        return instance;
    }

    public DTOUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(DTOUsuario usuario) {
        this.usuario = usuario;
    }

}
