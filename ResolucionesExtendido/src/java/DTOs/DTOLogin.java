
package DTOs;

public class DTOLogin {
    
    private String nombreUsuario;
    private String contrasenha;

    public DTOLogin() {
    }
    
    public DTOLogin(String nombreUsuario, String contrasenha) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenha = contrasenha;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }
    
}
