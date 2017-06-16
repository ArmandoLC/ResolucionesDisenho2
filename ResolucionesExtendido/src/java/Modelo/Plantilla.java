
package Modelo;


public class Plantilla {
    
    private int nConsecutivo;
    private String siglas;
    private String introduccion;
    private String resultado;
    private String considerandos;
    private String resuelvo;

    public Plantilla() {
    }

    public Plantilla(int nConsecutivo, String siglas, String introduccion, String resultado, String considerandos, String resuelvo) {
        this.nConsecutivo = nConsecutivo;
        this.siglas = siglas;
        this.introduccion = introduccion;
        this.resultado = resultado;
        this.considerandos = considerandos;
        this.resuelvo = resuelvo;
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
        return resuelvo;
    }

    public void setResuelvo(String resuelvo) {
        this.resuelvo = resuelvo;
    }

    @Override
    public String toString() {
        return "Plantilla{" + "nConsecutivo=" + nConsecutivo + ", siglas=" + siglas + ", introduccion=" + introduccion + ", resultado=" + resultado + ", considerandos=" + considerandos + ", resuelvo=" + resuelvo + '}';
    }
    
    
    
}
