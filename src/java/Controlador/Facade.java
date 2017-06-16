
package Controlador;


public abstract class Facade {
    
    protected final ControladorPrincipalExtendido ctrl;

    public Facade() {
        this.ctrl = new ControladorPrincipalExtendido();
    }   
    
}
