package DTOs;

public class DTORegistroUsuario extends DTOUsuario {

    private String nombreUsuario;
    private String contrasenha;

    public DTORegistroUsuario() {
    }

    public DTORegistroUsuario(String nombreUsuario, String contrasenha) {
        super();
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
