
package Vista;


public class BackofficeAsistente extends TemplateBackoffice{

    public BackofficeAsistente() {
        super();
        CargarComponentes();
    }

    @Override
    public void CargarComponentes() {
        backOffice.getPnlSuperUsuario().setVisible(false);
        backOffice.getLinkEstadisticas().setVisible(false);
        backOffice.getLinkPlantillas().setVisible(false);
        backOffice.getLinkRegistroSolic().setVisible(false);
        
        backOffice.setVisible(true);
    }
    
    
}
