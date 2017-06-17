
package Vista;

import Controlador.ControladorPrincipalExtendido;
import DTOs.DTOEstadoSolicitud;
import DTOs.DTOLogin;
import DTOs.DTOPlantilla;
import DTOs.DTOResolucion;
import DTOs.DTOUsuario;
import Modelo.Plantilla;
import java.util.ArrayList;

public class MainFrame extends javax.swing.JFrame {

  
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btWeb = new javax.swing.JButton();
        Backoffice = new javax.swing.JButton();
        lblIngresarA = new javax.swing.JLabel();
        lblBackoffice = new javax.swing.JLabel();
        lblPaginaWeb = new javax.swing.JLabel();
        panelPlantilla1 = new Vista.PanelPlantilla();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selección de Sistema");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconoWeb.jpg"))); // NOI18N
        btWeb.setToolTipText("<html>\n\n\t<p>Se pueden registrar y ver solicitudes</p>\n\t<p>o resoluciones con el identificador.</p>\n\n</html>");
        btWeb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWebActionPerformed(evt);
            }
        });
        getContentPane().add(btWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, -1));

        Backoffice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconoBackoffice.jpg"))); // NOI18N
        Backoffice.setToolTipText("<html>\n\n\t<p>Permite realizar funcionalidades distintas</p>\n\t<p>dependiendo del rol de la cuenta con la que</p>\n\t<p>el usuario ingresa al sistema.</p>\n\n</html>");
        Backoffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackofficeActionPerformed(evt);
            }
        });
        getContentPane().add(Backoffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 110, -1));

        lblIngresarA.setFont(new java.awt.Font("Verdana", 3, 22)); // NOI18N
        lblIngresarA.setForeground(new java.awt.Color(255, 0, 0));
        lblIngresarA.setText("Ingresar a");
        getContentPane().add(lblIngresarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        lblBackoffice.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblBackoffice.setText("Backoffice");
        getContentPane().add(lblBackoffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        lblPaginaWeb.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblPaginaWeb.setText("Página Web");
        getContentPane().add(lblPaginaWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));
        getContentPane().add(panelPlantilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        setBounds(0, 0, 608, 457);
    }// </editor-fold>//GEN-END:initComponents

    private void btWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btWebActionPerformed

    private void BackofficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackofficeActionPerformed
        try
        {
           LoginFrame vLogin = new LoginFrame();
           vLogin.setVisible(true);
           this.setVisible(false);
        }
        catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_BackofficeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backoffice;
    private javax.swing.JButton btWeb;
    private javax.swing.JLabel lblBackoffice;
    private javax.swing.JLabel lblIngresarA;
    private javax.swing.JLabel lblPaginaWeb;
    private Vista.PanelPlantilla panelPlantilla1;
    // End of variables declaration//GEN-END:variables
}
