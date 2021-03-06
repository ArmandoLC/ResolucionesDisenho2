
package Vista;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginFrame extends javax.swing.JFrame {

    private UIAutenticacion uiAutenticacion;
    
    public LoginFrame() {
        initComponents();
        this.uiAutenticacion = new UIAutenticacion();
        setLocationRelativeTo(null);
    }

    public JPasswordField getTxtContrasenha() {
        return txtContrasenha;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btIniciarSesion = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        lblContrasenha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        txtContrasenha = new javax.swing.JPasswordField();
        panelPlantilla1 = new Vista.PanelPlantilla();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btIniciarSesion.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btIniciarSesion.setText("Iniciar Sesión");
        btIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 160, 40));

        txtUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 180, 30));

        lblContrasenha.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lblContrasenha.setText("Contraseña");
        getContentPane().add(lblContrasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        lblIniciarSesion.setFont(new java.awt.Font("Verdana", 3, 22)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(255, 0, 0));
        lblIniciarSesion.setText("Inicio de Sesión");
        getContentPane().add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));
        getContentPane().add(txtContrasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 262, 180, 30));
        getContentPane().add(panelPlantilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarSesionActionPerformed
        
        uiAutenticacion.RealizarLogin(this);
    }//GEN-LAST:event_btIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIniciarSesion;
    private javax.swing.JLabel lblContrasenha;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblUsuario;
    private Vista.PanelPlantilla panelPlantilla1;
    private javax.swing.JPasswordField txtContrasenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
