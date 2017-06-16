
package DTOs;


public class DTOPlantilla {
    
    private int nConsecutivo;
    private String siglas;
    private String introduccion;
    private String resultado;
    private String considerandos;
    private String resulevo;

    public DTOPlantilla() {
    }

    public DTOPlantilla(int nConsecutivo, String siglas, String introduccion, String resultado, String considerandos, String resulevo) {
        this.nConsecutivo = nConsecutivo;
        this.siglas = siglas;
        this.introduccion = introduccion;
        this.resultado = resultado;
        this.considerandos = considerandos;
        this.resulevo = resulevo;
    }
    
    

    public int getnConsecutivo() {
        return nConsecutivo;
    }

    public void setnConsecutivo(int nConsecutivo) {
        this.nConsecutivo = nConsecutivo;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getConsiderandos() {
        return considerandos;
    }

    public void setConsiderandos(String considerandos) {
        this.considerandos = considerandos;
    }

    public String getResuelvo() {
        return resulevo;
    }

    public void setResulevo(String resulevo) {
        this.resulevo = resulevo;
    }
    
    
}
