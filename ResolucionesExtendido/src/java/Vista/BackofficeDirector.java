
package Vista;

public class BackofficeDirector extends TemplateBackoffice{

    public BackofficeDirector() {
        super();
        CargarComponentes();
    }
    
    @Override
    public void CargarComponentes() {
        backOffice.getPnlSuperUsuario().setVisible(false);
        backOffice.getPnlCoordinador().setVisible(false);
        
        PanelDireccion pDirec = new PanelDireccion(new java.awt.Frame(), true);
        pDirec.setVisible(true);
        
    }
    
}
