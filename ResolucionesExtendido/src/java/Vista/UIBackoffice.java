
package Vista;

import Controlador.FacadeBackoffice;
import DTOs.DTORegistroUsuario;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class UIBackoffice {

    private FacadeBackoffice facade;
    
    public UIBackoffice() {
        this.facade = new FacadeBackoffice();
    }   
    
    
    public void ConsultarSolicitudesAtendidas(JDialog pdialog)
    {
        
    }
    
    public void ConsultarTopProfesores(JDialog pdialog)
    {
        
    }
    
    public void ConsultarTopCursos(JDialog pdialog)
    {
        
    }
    
    public void TramitarSolicitud(JDialog pdialog)
    {
        
    }
    
    public void AnularSolicitud(JDialog pdialog)
    {
        
    }
    
    public void RegistrarInconsistencias(JDialog pdialog)
    {
        
    }
    
    public void RegistrarSolicitudes()
    {
        
    }
    
    public void ConsultarSolucion()
    {
        
    }
    
    public void RegistrarResolucion(JDialog pdialog)
    {
        
    }
    
    public void GuardarResolucion()
    {
        
    }
    
    public void ConsultarIncosistencias(JDialog pdialog)
    {
        
    }
    
    public void ConsultarSolicitudesEstudiante(String idEstudiante)
    {
        
    }
    
    public void RegistrarSolicitud(JDialog pdialog)
    {
        
    }
    
    public void ConsultarSolicitudes(JDialog pdialog)
    {
        
    }
    
    public void ConsultarCursos(JDialog pdialog)
    {
        
    }
    
    public void ConsultarGrupos(JDialog pdialog)
    {
        
    }
    
    public void CambiarContrasenha(JDialog pdialog)
    {
        
    }
    
    public void RegistrarUsuario(Backoffice vOffice)
    {
        try
        {
            // Verificar si las dos contrasenhas coinciden
            String pass = vOffice.getPanelSuper().getTxtPassword().getText();
            String passRP = vOffice.getPanelSuper().getTxtPasswordRp().getText();
            
            if (!(pass.equals(passRP)))
            {
                JOptionPane.showMessageDialog(vOffice, 
                        "Las contraseñas no coinciden.", 
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Crear el DTO para enviar los datos
            DTORegistroUsuario dto = new DTORegistroUsuario();
            
            dto.setId(vOffice.getPanelSuper().getTxtID().getText());
            dto.setNombre(vOffice.getPanelSuper().getTxtNombre().getText());
            dto.setCorreo(vOffice.getPanelSuper().getTxtCorreo().getText());
            dto.setTelefono(vOffice.getPanelSuper().getTxtTelefono().getText());
            dto.setNombreUsuario(vOffice.getPanelSuper().getTxtUsuario().getText());
            dto.setTipoUsuario(vOffice.getPanelSuper().getCbRol().getSelectedItem().toString());
            dto.setContrasenha(pass);
            
            boolean result = facade.RegistrarUsuario(dto);
            
            if (result) JOptionPane.showMessageDialog(vOffice,
                    "Usuario agregado correctamente");
            
            else JOptionPane.showMessageDialog(vOffice, 
                        "El usuario no pudo ser agregado.", 
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(vOffice, 
                        "Alguno de los datos no tiene el formato correcto.", 
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
    }
}
