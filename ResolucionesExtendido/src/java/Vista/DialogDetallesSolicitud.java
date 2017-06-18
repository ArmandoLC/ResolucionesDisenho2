package Vista;

import DTOs.DTOSolicitud;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXTextArea;

public class DialogDetallesSolicitud extends javax.swing.JDialog {

    private final DTOSolicitud solicitud; 
    private final UIBackoffice uibackoffice;
    
    public DialogDetallesSolicitud(java.awt.Frame parent, boolean modal, DTOSolicitud solicitud) {
        super(parent, modal);
        initComponents();
        this.uibackoffice = new UIBackoffice((HerramientasBackoffice) parent);
        this.solicitud = solicitud;
        llenarCampos();
        setLocationRelativeTo(null);
    }
    
    public void llenarCampos(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String s = sdf.format(solicitud.getFecha());
        txtGrupo.setText(s);
        txtIdSolicitante.setText(solicitud.getIdSolicitante());
        txtNombreSolicitante.setText(solicitud.getNombreSolicitante());
        txtCodigoCurso.setText(solicitud.getCodigoCurso());
        txtFecha.setText(String.valueOf(solicitud.getnGrupo()));
        txtPeriodo.setText(solicitud.getPeriodo());
        txtIdAfectado.setText(solicitud.getIdAfectado());
        txtNombreAfectado.setText(solicitud.getNombreAfectado());
        txtCorreoAfectado.setText(solicitud.getCorreoAfectado());
        txtTelefono.setText(solicitud.getTelefonoAfectado());
        txtArchivoAdjunto.setText(solicitud.getRutaArchivoAdjunto());
        txtDescripcion.setText(solicitud.getDescripcionDetallada());
        txtEstado.setText(solicitud.getEstado());
        txtInconsistencia.setText(solicitud.getInconsistencia());
    }

    public JTextField getTxtArchivoAdjunto() {
        return txtArchivoAdjunto;
    }

    public void setTxtArchivoAdjunto(JTextField txtArchivoAdjunto) {
        this.txtArchivoAdjunto = txtArchivoAdjunto;
    }

    public JTextField getTxtCodigoCurso() {
        return txtCodigoCurso;
    }

    public void setTxtCodigoCurso(JTextField txtCodigoCurso) {
        this.txtCodigoCurso = txtCodigoCurso;
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

    public JTextField getTxtGrupo() {
        return txtFecha;
    }

    public void setTxtGrupo(JTextField txtGrupo) {
        this.txtFecha = txtGrupo;
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

    public JTextField getTxtPeriodo() {
        return txtPeriodo;
    }

    public void setTxtPeriodo(JTextField txtPeriodo) {
        this.txtPeriodo = txtPeriodo;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtTipoInconsistencia() {
        return txtFecha;
    }

    public void setTxtTipoInconsistencia(JTextField txtTipoInconsistencia) {
        this.txtFecha = txtTipoInconsistencia;
    }

    public JTextField getTxtInconsistencia() {
        return txtInconsistencia;
    }

    public void setTxtInconsistencia(JTextField txtInconsistencia) {
        this.txtInconsistencia = txtInconsistencia;
    }
    
    public DTOSolicitud getSolicitud(){
        return solicitud;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCompleto = new javax.swing.JPanel();
        btnActualizarInconsistencia = new javax.swing.JButton();
        onlInformacion = new javax.swing.JPanel();
        pnlDatosSolicitud = new javax.swing.JPanel();
        SolicitudIcon = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtInconsistencia = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCodigoCurso = new javax.swing.JTextField();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCompleto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizarInconsistencia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnActualizarInconsistencia.setText("Actualizar Inconsistencia");
        btnActualizarInconsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInconsistenciaActionPerformed(evt);
            }
        });
        pnlCompleto.add(btnActualizarInconsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 750, 1230, 40));

        onlInformacion.setBackground(new java.awt.Color(255, 255, 255));
        onlInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDatosSolicitud.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosSolicitud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SolicitudIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        SolicitudIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/solicitudIcon.PNG"))); // NOI18N
        SolicitudIcon.setText("Datos de la Solicitud");
        pnlDatosSolicitud.add(SolicitudIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lblEstado.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblEstado.setText("Estado: ");
        pnlDatosSolicitud.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 160, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel7.setText("Fecha:");
        pnlDatosSolicitud.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("Período:");
        pnlDatosSolicitud.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel3.setText("Código del curso:");
        pnlDatosSolicitud.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel5.setText("Grupo:");
        pnlDatosSolicitud.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 160, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel11.setText("Tipo de inconsistencia:");
        pnlDatosSolicitud.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 230, -1));

        txtEstado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtEstado.setEnabled(false);
        pnlDatosSolicitud.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 310, 30));

        txtInconsistencia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtInconsistencia.setEnabled(false);
        pnlDatosSolicitud.add(txtInconsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 310, 30));

        txtGrupo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtGrupo.setEnabled(false);
        pnlDatosSolicitud.add(txtGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 30));

        txtPeriodo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPeriodo.setEnabled(false);
        pnlDatosSolicitud.add(txtPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 310, 30));

        txtFecha.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtFecha.setEnabled(false);
        pnlDatosSolicitud.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, 30));

        txtCodigoCurso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtCodigoCurso.setEnabled(false);
        pnlDatosSolicitud.add(txtCodigoCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, 30));

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
        txtIdAfectado.setEnabled(false);
        pnlAfectado.add(txtIdAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, -1));

        txtNombreAfectado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtNombreAfectado.setEnabled(false);
        pnlAfectado.add(txtNombreAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 360, -1));

        txtCorreoAfectado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtCorreoAfectado.setEnabled(false);
        txtCorreoAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoAfectadoActionPerformed(evt);
            }
        });
        pnlAfectado.add(txtCorreoAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 360, 30));

        txtTelefono.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTelefono.setEnabled(false);
        pnlAfectado.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 360, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel9.setText("Adjuntar archivo: ");
        pnlAfectado.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 190, -1));

        txtArchivoAdjunto.setEditable(false);
        txtArchivoAdjunto.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtArchivoAdjunto.setEnabled(false);
        txtArchivoAdjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArchivoAdjuntoActionPerformed(evt);
            }
        });
        pnlAfectado.add(txtArchivoAdjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 280, -1));

        btnAbrirArchivoAdjunto.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnAbrirArchivoAdjunto.setText("Abrir");
        btnAbrirArchivoAdjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirArchivoAdjuntoActionPerformed(evt);
            }
        });
        pnlAfectado.add(btnAbrirArchivoAdjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

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
        txtIdSolicitante.setEnabled(false);
        pnlDatosSolicitante.add(txtIdSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 350, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setText("Nombre:");
        pnlDatosSolicitante.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, -1));

        txtNombreSolicitante.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtNombreSolicitante.setEnabled(false);
        pnlDatosSolicitante.add(txtNombreSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 350, -1));

        lblDescripProblemIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblDescripProblemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/preguntaIcon.PNG"))); // NOI18N
        lblDescripProblemIcon.setText("Descripción del Problema");
        pnlDatosSolicitante.add(lblDescripProblemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 370, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setEnabled(false);
        jScrollPane2.setViewportView(txtDescripcion);

        pnlDatosSolicitante.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 350, 200));

        onlInformacion.add(pnlDatosSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 410, 520));

        pnlCompleto.add(onlInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 1340, 530));

        lblIcono.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        lblIcono.setForeground(new java.awt.Color(240, 0, 0));
        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/regSolic.PNG"))); // NOI18N
        lblIcono.setText("Registro de Solicitudes");
        pnlCompleto.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 70));
        pnlCompleto.add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 820));

        getContentPane().add(pnlCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarInconsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarInconsistenciaActionPerformed
        uibackoffice.ModificarSolicitud(this);
    }//GEN-LAST:event_btnActualizarInconsistenciaActionPerformed

    private void txtCorreoAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoAfectadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoAfectadoActionPerformed

    private void txtArchivoAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArchivoAdjuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArchivoAdjuntoActionPerformed

    private void btnAbrirArchivoAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirArchivoAdjuntoActionPerformed
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
        File archivo = file.getSelectedFile();
        txtArchivoAdjunto.setText(archivo.getAbsolutePath());
    }//GEN-LAST:event_btnAbrirArchivoAdjuntoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SolicitudIcon;
    private javax.swing.JButton btnAbrirArchivoAdjunto;
    private javax.swing.JButton btnActualizarInconsistencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDatosAfectadoIcon;
    private javax.swing.JLabel lblDescripProblemIcon;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblSolicitanteIcon;
    private javax.swing.JPanel onlInformacion;
    private javax.swing.JPanel pnlAfectado;
    private javax.swing.JPanel pnlCompleto;
    private javax.swing.JPanel pnlDatosSolicitante;
    private javax.swing.JPanel pnlDatosSolicitud;
    private Vista.PanelGeneral pnlFondo;
    private javax.swing.JTextField txtArchivoAdjunto;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCorreoAfectado;
    private org.jdesktop.swingx.JXTextArea txtDescripcion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtIdAfectado;
    private javax.swing.JTextField txtIdSolicitante;
    private javax.swing.JTextField txtInconsistencia;
    private javax.swing.JTextField txtNombreAfectado;
    private javax.swing.JTextField txtNombreSolicitante;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
