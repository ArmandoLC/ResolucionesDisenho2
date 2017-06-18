/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Andrey
 */
public class DialogContrasenha extends javax.swing.JDialog {

    /**
     * Creates new form DialogContrasenha
     */
    UIBackoffice uiBackoffice;
    
    public DialogContrasenha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        uiBackoffice = new UIBackoffice();
        setLocationRelativeTo(null);
    }

    public JPasswordField getTxtPass() {
        return txtPass;
    }

    public JPasswordField getTxtPassRP() {
        return txtPassRP;
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

        lblPassRP = new javax.swing.JLabel();
        lblPassAct = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btCambiar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtPassRP = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        pnlFondo = new Vista.PanelGeneral();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPassRP.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPassRP.setText("Contraseña nueva");
        getContentPane().add(lblPassRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        lblPassAct.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPassAct.setText("Contraseña actual");
        getContentPane().add(lblPassAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(240, 0, 0));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/passIcon.png"))); // NOI18N
        lblTitulo.setText("Cambio de Contraseña");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        btCambiar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btCambiar.setText("Cambiar");
        btCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiarActionPerformed(evt);
            }
        });
        getContentPane().add(btCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 270, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 270, 30));

        txtPassRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassRPActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 270, 30));

        txtUsuario.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 270, -1));
        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPassRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassRPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassRPActionPerformed

    private void btCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambiarActionPerformed
        uiBackoffice.CambiarContrasenha(this);
    }//GEN-LAST:event_btCambiarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogContrasenha dialog = new DialogContrasenha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCambiar;
    private javax.swing.JLabel lblPassAct;
    private javax.swing.JLabel lblPassRP;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private Vista.PanelGeneral pnlFondo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassRP;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
