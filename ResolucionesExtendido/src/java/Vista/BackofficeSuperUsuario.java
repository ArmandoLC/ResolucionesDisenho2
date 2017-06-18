/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Andrey
 */
public class BackofficeSuperUsuario extends TemplateBackoffice {

    public BackofficeSuperUsuario() {
        super();
        CargarComponentes();
    }

    @Override
    public void CargarComponentes() {
       backOffice.getPnlCoordinador().setVisible(false);       
       
       backOffice.setVisible(true);
    }
}
