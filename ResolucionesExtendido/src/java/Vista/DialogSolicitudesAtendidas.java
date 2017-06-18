package Vista;

import org.jdesktop.swingx.JXEditorPane;

public class DialogSolicitudesAtendidas extends javax.swing.JDialog {

    private final UIBackoffice uibackoffice;
    
    public DialogSolicitudesAtendidas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        uibackoffice = new UIBackoffice(((HerramientasBackoffice) parent));
        uibackoffice.ConsultarSolicitudesAtendidas(this);
        setLocationRelativeTo(null);
        
    }

    public JXEditorPane getEditor() {
        return editor;
    }

    public void setEditor(JXEditorPane editor) {
        this.editor = editor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloIcon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editor = new org.jdesktop.swingx.JXEditorPane();
        pnlFondo = new Vista.PanelGeneral();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloIcon.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        lblTituloIcon.setForeground(new java.awt.Color(240, 0, 0));
        lblTituloIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/calendarIcon.jpg"))); // NOI18N
        lblTituloIcon.setText("Solicitudes Atendidas");
        getContentPane().add(lblTituloIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(editor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 590, 450));
        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXEditorPane editor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloIcon;
    private Vista.PanelGeneral pnlFondo;
    // End of variables declaration//GEN-END:variables
}
