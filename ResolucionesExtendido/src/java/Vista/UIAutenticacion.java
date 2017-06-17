
package Vista;

import Controlador.FacadeLogin;
import DTOs.DTOLogin;
import DTOs.DTOUsuario;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class UIAutenticacion {
    
    private FacadeLogin facade = new FacadeLogin();
    private DTOLogin dtoLogin = new DTOLogin();

    public UIAutenticacion() {
    }
    
    public void RealizarLogin(LoginFrame vLogin)
    {
        try
        {
            dtoLogin.setNombreUsuario(vLogin.getTxtUsuario().getText());
            dtoLogin.setContrasenhaAct(vLogin.getTxtContrasenha().getText());
            
            DTOUsuario usuario = facade.RealizarLogin(dtoLogin);
            
            if(usuario != null) 
                JOptionPane.showMessageDialog(vLogin, "El tipo de Usuario es: " + usuario.getTipoUsuario());
            
            else JOptionPane.showMessageDialog(vLogin, 
                    "El usuario y contraseña no son correctas.",
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
            
        }
    }
    
}
