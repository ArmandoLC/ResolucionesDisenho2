
package Vista;

import org.jdesktop.swingx.JXTable;


public class DialogEstadisticas extends javax.swing.JDialog {

    private final UIBackoffice uibackoffice;

    public DialogEstadisticas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        uibackoffice = new UIBackoffice((HerramientasBackoffice) parent);
        initEstadisticas();
        setLocationRelativeTo(null);
    }
    
    private void initEstadisticas(){
        uibackoffice.ConsultarTopCursos(this);
        uibackoffice.ConsultarTopProfesores(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCursos = new org.jdesktop.swingx.JXTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabProfesores = new org.jdesktop.swingx.JXTable();
        jLabel2 = new javax.swing.JLabel();
        lblTituloIcon = new javax.swing.JLabel();
        panelGeneral1 = new Vista.PanelGeneral();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Profesores con más modificaciones de actas");
        pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 27, -1, -1));

        tabCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabCursos);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 260, 541, 145));

        tabProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabProfesores);

        pnlPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 61, 541, 147));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setText("Cursos con más resoluciones");
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 226, -1, -1));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 610, 440));

        lblTituloIcon.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        lblTituloIcon.setForeground(new java.awt.Color(240, 0, 0));
        lblTituloIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/estadisticaIcon.png"))); // NOI18N
        lblTituloIcon.setText("Estadísticas");
        getContentPane().add(lblTituloIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));
        getContentPane().add(panelGeneral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTituloIcon;
    private Vista.PanelGeneral panelGeneral1;
    private javax.swing.JPanel pnlPrincipal;
    private org.jdesktop.swingx.JXTable tabCursos;
    private org.jdesktop.swingx.JXTable tabProfesores;
    // End of variables declaration//GEN-END:variables

    public JXTable getTabCursos() {
        return tabCursos;
    }

    public void setTabCursos(JXTable tabCursos) {
        this.tabCursos = tabCursos;
    }

    public JXTable getTabProfesores() {
        return tabProfesores;
    }

    public void setTabProfesores(JXTable tabProfesores) {
        this.tabProfesores = tabProfesores;
    }

}
