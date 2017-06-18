
package Vista;

import org.netbeans.lib.awtextra.AbsoluteLayout;


public class BackofficeCoordinador extends TemplateBackoffice{

    public BackofficeCoordinador() {
        super();
        CargarComponentes();
    }

    @Override
    public void CargarComponentes() {
       backOffice.getPnlSuperUsuario().setVisible(false);      
              
       backOffice.setVisible(true);
    }
    
}
