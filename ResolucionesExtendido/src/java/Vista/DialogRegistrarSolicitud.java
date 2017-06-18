package Vista;


import Enums.Modalidad;
import java.awt.event.ItemEvent;
import java.io.File;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXTextArea;

public class DialogRegistrarSolicitud extends javax.swing.JDialog {

    private final UIBackoffice uibackoffice;
    
    public DialogRegistrarSolicitud(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initModalidad();
       
        //if(parent instanceof DashboardCoordinador){
        uibackoffice = new UIBackoffice(((HerramientasBackoffice) parent));
        /*}
        else {
           uibackoffice = (UIBackoffice) new UIBackofficeEstudiante(((Backoffice) parent));
        }*/
        this.setLocationRelativeTo(null);
        initConsultas();
        setLocationRelativeTo(null);
    }
    
    private void initConsultas(){
        
        uibackoffice.ConsultarSituaciones(this);
        uibackoffice.ConsultarSolicitudes();
        uibackoffice.ConsultarCursos(this);
        uibackoffice.ConsultarGrupos(this);
        cbCurso.addItemListener((ItemEvent e) -> { uibackoffice.ConsultarGrupos(this); });
    }
    
    private void initModalidad(){
        for(Modalidad m : Modalidad.values())
            cbModalidad.addItem(m.toString());
        initPeriodo();
        cbModalidad.addItemListener((ItemEvent e) -> { initPeriodo(); });
    }
    
    public void initPeriodo(){
        cbPeriodo.removeAllItems();
        Modalidad m = Modalidad.valueOf( (String) cbModalidad.getSelectedItem());
        Modalidad.getPeriodos(m).forEach((periodo) -> { cbPeriodo.addItem(periodo); });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCompleto = new javax.swing.JPanel();
        btnRegistrarSolicitud = new javax.swing.JButton();
        onlInformacion = new javax.swing.JPanel();
        pnlDatosSolicitud = new javax.swing.JPanel();
        SolicitudIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbModalidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbPeriodo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbCurso = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbGrupo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbSituacion = new javax.swing.JComboBox<>();
        txtAnho = new javax.swing.JFormattedTextField();
        pnlAfectado = new javax.swing.JPanel();
        lblDatosAfectadoIcon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIdAfectado = new javax.swing.JTextField();
        txtNombreAfectado = new javax.swing.JTextField();
        txtCorreoAfectado = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtArchivoAdjunto = new javax.swing.JTextField();
        btnAbrirArchivoAdjunto = new javax.swing.JButton();
        pnlDatosSolicitante = new javax.swing.JPanel();
        lblSolicitanteIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIdSolicitante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreSolicitante = new javax.swing.JTextField();
        lblDescripProblemIcon = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new org.jdesktop.swingx.JXTextArea();
        lblIcono = new javax.swing.JLabel();
        pnlFondo = new Vista.PanelGeneral();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCompleto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarSolicitud.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnRegistrarSolicitud.setText("Registrar solicitud");
        btnRegistrarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSolicitudActionPerformed(evt);
            }
        });
        pnlCompleto.add(btnRegistrarSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, 1230, 40));

        onlInformacion.setBackground(new java.awt.Color(255, 255, 255));
        onlInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDatosSolicitud.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosSolicitud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SolicitudIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        SolicitudIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/solicitudIcon.PNG"))); // NOI18N
        SolicitudIcon.setText("Datos de la Solicitud");
        pnlDatosSolicitud.add(SolicitudIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel7.setText("Año:");
        pnlDatosSolicitud.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel6.setText("Modalidad:");
        pnlDatosSolicitud.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, -1));

        cbModalidad.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        cbModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModalidadActionPerformed(evt);
            }
        });
        pnlDatosSolicitud.add(cbModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 310, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("Período:");
        pnlDatosSolicitud.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, -1));

        cbPeriodo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        pnlDatosSolicitud.add(cbPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel3.setText("Código del curso:");
        pnlDatosSolicitud.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 160, -1));

        cbCurso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        pnlDatosSolicitud.add(cbCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel5.setText("Grupo:");
        pnlDatosSolicitud.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, -1));

        cbGrupo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        cbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        pnlDatosSolicitud.add(cbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 310, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel11.setText("Tipo de inconsistencia:");
        pnlDatosSolicitud.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 230, -1));

        cbSituacion.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        pnlDatosSolicitud.add(cbSituacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 310, -1));

        try {
            txtAnho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlDatosSolicitud.add(txtAnho, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 30));

        onlInformacion.add(pnlDatosSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 410, 520));

        pnlAfectado.setBackground(new java.awt.Color(255, 255, 255));
        pnlAfectado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDatosAfectadoIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblDatosAfectadoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/iconoDatosPersonales.PNG"))); // NOI18N
        lblDatosAfectadoIcon.setText("Información del afectado");
        pnlAfectado.add(lblDatosAfectadoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel8.setText("Identificación");
        pnlAfectado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel12.setText("Nombre");
        pnlAfectado.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel13.setText("Correo");
        pnlAfectado.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel14.setText("Teléfono");
        pnlAfectado.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtIdAfectado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        pnlAfectado.add(txtIdAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, -1));

        txtNombreAfectado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        pnlAfectado.add(txtNombreAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 360, -1));

        txtCorreoAfectado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtCorreoAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoAfectadoActionPerformed(evt);
            }
        });
        pnlAfectado.add(txtCorreoAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 360, 30));

        txtTelefono.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        pnlAfectado.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 360, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel9.setText("Adjuntar archivo: ");
        pnlAfectado.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 190, -1));

        txtArchivoAdjunto.setEditable(false);
        txtArchivoAdjunto.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtArchivoAdjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArchivoAdjuntoActionPerformed(evt);
            }
        });
        pnlAfectado.add(txtArchivoAdjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 297, -1));

        btnAbrirArchivoAdjunto.setText("...");
        btnAbrirArchivoAdjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirArchivoAdjuntoActionPerformed(evt);
            }
        });
        pnlAfectado.add(btnAbrirArchivoAdjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        onlInformacion.add(pnlAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 410, 520));

        pnlDatosSolicitante.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosSolicitante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSolicitanteIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblSolicitanteIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/usuarioIcon.jpg"))); // NOI18N
        lblSolicitanteIcon.setText("Datos del Solicitante");
        pnlDatosSolicitante.add(lblSolicitanteIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Identificación:");
        pnlDatosSolicitante.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        txtIdSolicitante.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        pnlDatosSolicitante.add(txtIdSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 350, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setText("Nombre:");
        pnlDatosSolicitante.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, -1));

        txtNombreSolicitante.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        pnlDatosSolicitante.add(txtNombreSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 350, -1));

        lblDescripProblemIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblDescripProblemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/preguntaIcon.PNG"))); // NOI18N
        lblDescripProblemIcon.setText("Descripción del Problema");
        pnlDatosSolicitante.add(lblDescripProblemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 370, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        pnlDatosSolicitante.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 350, 200));

        onlInformacion.add(pnlDatosSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 410, 520));

        pnlCompleto.add(onlInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 1340, 540));

        lblIcono.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        lblIcono.setForeground(new java.awt.Color(240, 0, 0));
        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/regSolic.PNG"))); // NOI18N
        lblIcono.setText("Registro de Solicitudes");
        pnlCompleto.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 70));
        pnlCompleto.add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 820));

        getContentPane().add(pnlCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirArchivoAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirArchivoAdjuntoActionPerformed
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
        File archivo = file.getSelectedFile();
        txtArchivoAdjunto.setText(archivo.getAbsolutePath());
    }//GEN-LAST:event_btnAbrirArchivoAdjuntoActionPerformed

    private void btnRegistrarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSolicitudActionPerformed
        uibackoffice.RegistrarSolicitud(this);
    }//GEN-LAST:event_btnRegistrarSolicitudActionPerformed

    private void txtArchivoAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArchivoAdjuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArchivoAdjuntoActionPerformed

    private void txtCorreoAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoAfectadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoAfectadoActionPerformed

    private void cbModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbModalidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SolicitudIcon;
    private javax.swing.JButton btnAbrirArchivoAdjunto;
    private javax.swing.JButton btnRegistrarSolicitud;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JComboBox<String> cbGrupo;
    private javax.swing.JComboBox<String> cbModalidad;
    private javax.swing.JComboBox<String> cbPeriodo;
    private javax.swing.JComboBox<String> cbSituacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDatosAfectadoIcon;
    private javax.swing.JLabel lblDescripProblemIcon;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblSolicitanteIcon;
    private javax.swing.JPanel onlInformacion;
    private javax.swing.JPanel pnlAfectado;
    private javax.swing.JPanel pnlCompleto;
    private javax.swing.JPanel pnlDatosSolicitante;
    private javax.swing.JPanel pnlDatosSolicitud;
    private Vista.PanelGeneral pnlFondo;
    private javax.swing.JFormattedTextField txtAnho;
    private javax.swing.JTextField txtArchivoAdjunto;
    private javax.swing.JTextField txtCorreoAfectado;
    private org.jdesktop.swingx.JXTextArea txtDescripcion;
    private javax.swing.JTextField txtIdAfectado;
    private javax.swing.JTextField txtIdSolicitante;
    private javax.swing.JTextField txtNombreAfectado;
    private javax.swing.JTextField txtNombreSolicitante;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getCbCurso() {
        return cbCurso;
    }

    public void setCbCurso(JComboBox<String> cbCurso) {
        this.cbCurso = cbCurso;
    }

    public JComboBox<String> getCbModalidad() {
        return cbModalidad;
    }

    public void setCbModalidad(JComboBox<String> cbModalidad) {
        this.cbModalidad = cbModalidad;
    }

    public JComboBox<String> getCbSituacion() {
        return cbSituacion;
    }

    public void setCbSituacion(JComboBox<String> cbSituacion) {
        this.cbSituacion = cbSituacion;
    }

    public JFormattedTextField getTxtAnho() {
        return txtAnho;
    }

    public void setTxtAnho(JFormattedTextField txtAnho) {
        this.txtAnho = txtAnho;
    }

    public JTextField getTxtArchivoAdjunto() {
        return txtArchivoAdjunto;
    }

    public void setTxtArchivoAdjunto(JTextField txtArchivoAdjunto) {
        this.txtArchivoAdjunto = txtArchivoAdjunto;
    }

    public JTextField getTxtCorreoAfectado() {
        return txtCorreoAfectado;
    }

    public void setTxtCorreoAfectado(JTextField txtCorreoAfectado) {
        this.txtCorreoAfectado = txtCorreoAfectado;
    }

    public JXTextArea getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JXTextArea txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public JComboBox<String> getCbGrupo() {
        return cbGrupo;
    }

    public void setCbGrupo(JComboBox<String> cbGrupo) {
        this.cbGrupo = cbGrupo;
    }
    
    public JTextField getTxtIdAfectado() {
        return txtIdAfectado;
    }

    public void setTxtIdAfectado(JTextField txtIdAfectado) {
        this.txtIdAfectado = txtIdAfectado;
    }

    public JTextField getTxtIdSolicitante() {
        return txtIdSolicitante;
    }

    public void setTxtIdSolicitante(JTextField txtIdSolicitante) {
        this.txtIdSolicitante = txtIdSolicitante;
    }

    public JTextField getTxtNombreAfectado() {
        return txtNombreAfectado;
    }

    public void setTxtNombreAfectado(JTextField txtNombreAfectado) {
        this.txtNombreAfectado = txtNombreAfectado;
    }

    public JTextField getTxtNombreSolicitante() {
        return txtNombreSolicitante;
    }

    public void setTxtNombreSolicitante(JTextField txtNombreSolicitante) {
        this.txtNombreSolicitante = txtNombreSolicitante;
    }

    public JComboBox<String> getCbPeriodo() {
        return cbPeriodo;
    }

    public void setCbPeriodo(JComboBox<String> cbPeriodo) {
        this.cbPeriodo = cbPeriodo;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

}
