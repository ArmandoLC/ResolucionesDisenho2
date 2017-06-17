
package Vista;

public abstract class TemplateBackoffice {
    
    protected Backoffice backOffice;

    public TemplateBackoffice() {
        this.backOffice = new Backoffice();
    }
    
    public abstract void CargarComponentes();
    
}
