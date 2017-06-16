
package DTOs;

public class DTOLogin {
    
    private String nombreUsuario;
    private String contrasenhaAct;
    private String contrasenhaNueva;

    public DTOLogin() {
    }
    
    public DTOLogin(String nombreUsuario, String contrasenhaAct, String contrasenhaNueva) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenhaAct = contrasenhaAct;
        this.contrasenhaNueva = contrasenhaNueva;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenhaAct() {
        return contrasenhaAct;
    }

    public void setContrasenhaAct(String contrasenhaAct) {
        this.contrasenhaAct = contrasenhaAct;
    }

    public String getContrasenhaNueva() {
        return contrasenhaNueva;
    }

    public void setContrasenhaNueva(String contrasenhaNueva) {
        this.contrasenhaNueva = contrasenhaNueva;
    }
    
    
}
