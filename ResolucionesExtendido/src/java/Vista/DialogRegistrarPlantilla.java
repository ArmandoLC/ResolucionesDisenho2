package Vista;

import DTOs.DTOSolicitud;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.text.BadLocationException;
import org.jdesktop.swingx.JXEditorPane;

public class DialogRegistrarPlantilla extends javax.swing.JDialog {

    private final UIBackoffice uibackoffice;

    private String introduccion = "";

    private String resultado = "";

    private String considerandos = "";

    private String resuelvo = "";

    public DialogRegistrarPlantilla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initInconsistencias();

        uibackoffice = new UIBackoffice((HerramientasBackoffice) parent);
        txtEditor.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        txtEditor.setText(introduccion);
        btnIntroduccion.setSelected(true);

        setLocationRelativeTo(null);
    }

    private void initInconsistencias() {
        ArrayList<String> inconsistencias = new ArrayList();
        inconsistencias.add("INCLUSION ACTA");
        inconsistencias.add("EXCLUSION ACTA");
        inconsistencias.add("ERROR NOTA");
        for (String item : inconsistencias) {
            cbCategoria.addItem(item);
        };
        cbCategoria.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        pnlAfectado = new javax.swing.JPanel();
        lblTitAfect = new javax.swing.JLabel();
        btnIDAfectado = new javax.swing.JToggleButton();
        btnNombreAfectado = new javax.swing.JToggleButton();
        btnCorreoAfectado = new javax.swing.JToggleButton();
        btnTelefonoAfectado = new javax.swing.JToggleButton();
        pnlSolicitante = new javax.swing.JPanel();
        lblTitSolicitante = new javax.swing.JLabel();
        btnIDSolicitante = new javax.swing.JToggleButton();
        btnNombreSolicitante = new javax.swing.JToggleButton();
        pnlAdministrativos = new javax.swing.JPanel();
        lblTitAdmin = new javax.swing.JLabel();
        btnNombreCoordinador = new javax.swing.JToggleButton();
        btnNombreDirector = new javax.swing.JToggleButton();
        btnNombreDirectorAdm = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEditor = new org.jdesktop.swingx.JXEditorPane();
        btnIntroduccion = new javax.swing.JToggleButton();
        btnResultado = new javax.swing.JToggleButton();
        btnConsiderandos = new javax.swing.JToggleButton();
        btnResuelvo = new javax.swing.JToggleButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        pnlSolicitud = new javax.swing.JPanel();
        lblTitSolicitud = new javax.swing.JLabel();
        btnPeriodo = new javax.swing.JToggleButton();
        btnCurso = new javax.swing.JToggleButton();
        btnGrupo = new javax.swing.JToggleButton();
        btnInconsistencia = new javax.swing.JToggleButton();
        lblTitAdmin1 = new javax.swing.JLabel();
        lblTituloIcon = new javax.swing.JLabel();
        panelGeneral1 = new Vista.PanelGeneral();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGeneral.setBackground(new java.awt.Color(255, 255, 255));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAfectado.setBackground(new java.awt.Color(255, 255, 255));
        pnlAfectado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitAfect.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTitAfect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitAfect.setText("Afectado");
        lblTitAfect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlAfectado.add(lblTitAfect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 19));

        btnIDAfectado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnIDAfectado.setText("Identificación");
        btnIDAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDAfectadoActionPerformed(evt);
            }
        });
        pnlAfectado.add(btnIDAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, -1));

        btnNombreAfectado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnNombreAfectado.setText("Nombre");
        btnNombreAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreAfectadoActionPerformed(evt);
            }
        });
        pnlAfectado.add(btnNombreAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 30));

        btnCorreoAfectado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnCorreoAfectado.setText("Correo");
        btnCorreoAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorreoAfectadoActionPerformed(evt);
            }
        });
        pnlAfectado.add(btnCorreoAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 30));

        btnTelefonoAfectado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnTelefonoAfectado.setText("Teléfono");
        btnTelefonoAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonoAfectadoActionPerformed(evt);
            }
        });
        pnlAfectado.add(btnTelefonoAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 30));

        pnlGeneral.add(pnlAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, 180, 200));

        pnlSolicitante.setBackground(new java.awt.Color(255, 255, 255));
        pnlSolicitante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitSolicitante.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTitSolicitante.setText("Solicitante");
        pnlSolicitante.add(lblTitSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        btnIDSolicitante.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnIDSolicitante.setText("Identificación");
        btnIDSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDSolicitanteActionPerformed(evt);
            }
        });
        pnlSolicitante.add(btnIDSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 30));

        btnNombreSolicitante.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnNombreSolicitante.setText("Nombre");
        btnNombreSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreSolicitanteActionPerformed(evt);
            }
        });
        pnlSolicitante.add(btnNombreSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 30));

        pnlGeneral.add(pnlSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 50, 180, 120));

        pnlAdministrativos.setBackground(new java.awt.Color(255, 255, 255));
        pnlAdministrativos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitAdmin.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTitAdmin.setText("Administradores");
        pnlAdministrativos.add(lblTitAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        btnNombreCoordinador.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnNombreCoordinador.setText("Coordinador");
        btnNombreCoordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreCoordinadorActionPerformed(evt);
            }
        });
        pnlAdministrativos.add(btnNombreCoordinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, -1));

        btnNombreDirector.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnNombreDirector.setText("Director Escuela");
        btnNombreDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreDirectorActionPerformed(evt);
            }
        });
        pnlAdministrativos.add(btnNombreDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 30));

        btnNombreDirectorAdm.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnNombreDirectorAdm.setText("Director Adm&Reg");
        btnNombreDirectorAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreDirectorAdmActionPerformed(evt);
            }
        });
        pnlAdministrativos.add(btnNombreDirectorAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        pnlGeneral.add(pnlAdministrativos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 220, 160));

        txtEditor.setBorder(null);
        txtEditor.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtEditor.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtEditor.setMargin(new java.awt.Insets(20, 20, 20, 20));
        txtEditor.setOpaque(false);
        jScrollPane3.setViewportView(txtEditor);

        pnlGeneral.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 627, 440));

        btnIntroduccion.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnIntroduccion.setText("Introducción");
        btnIntroduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntroduccionActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnIntroduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 45));

        btnResultado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnResultado.setText("Resultado");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 48));

        btnConsiderandos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnConsiderandos.setText("Considerandos");
        btnConsiderandos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsiderandosActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnConsiderandos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 45));

        btnResuelvo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnResuelvo.setText("Resuelvo");
        btnResuelvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResuelvoActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnResuelvo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 45));

        btnGuardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnGuardar.setText("Guardar Plantilla");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 469, 1210, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Categoría");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlGeneral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 117, 19));

        cbCategoria.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        pnlGeneral.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, -1));

        pnlSolicitud.setBackground(new java.awt.Color(255, 255, 255));
        pnlSolicitud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitSolicitud.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTitSolicitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitSolicitud.setText("Solicitud");
        lblTitSolicitud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlSolicitud.add(lblTitSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 19));

        btnPeriodo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnPeriodo.setText("Periodo");
        btnPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodoActionPerformed(evt);
            }
        });
        pnlSolicitud.add(btnPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 30));

        btnCurso.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnCurso.setText("Curso");
        btnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursoActionPerformed(evt);
            }
        });
        pnlSolicitud.add(btnCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 80, 180, 30));

        btnGrupo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnGrupo.setText("Grupo");
        btnGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupoActionPerformed(evt);
            }
        });
        pnlSolicitud.add(btnGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 120, 180, -1));

        btnInconsistencia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnInconsistencia.setText("Inconsistencia");
        btnInconsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInconsistenciaActionPerformed(evt);
            }
        });
        pnlSolicitud.add(btnInconsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 160, 180, -1));

        pnlGeneral.add(pnlSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 210, 210));

        lblTitAdmin1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        lblTitAdmin1.setText("Datos de una solicitud");
        pnlGeneral.add(lblTitAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        getContentPane().add(pnlGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 1240, 510));

        lblTituloIcon.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        lblTituloIcon.setForeground(new java.awt.Color(240, 0, 0));
        lblTituloIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/templateIcon.png"))); // NOI18N
        lblTituloIcon.setText("Creación de Plantillas");
        getContentPane().add(lblTituloIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));
        getContentPane().add(panelGeneral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntroduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntroduccionActionPerformed
        if (btnIntroduccion.isSelected()) {
            if (btnResultado.isSelected()) {
                resultado = txtEditor.getText();
            }
            if (btnConsiderandos.isSelected()) {
                considerandos = txtEditor.getText();
            }
            if (btnResuelvo.isSelected()) {
                resuelvo = txtEditor.getText();
            }
            btnResultado.setSelected(false);
            btnConsiderandos.setSelected(false);
            btnResuelvo.setSelected(false);
            txtEditor.setText(introduccion);
        }
    }//GEN-LAST:event_btnIntroduccionActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        if (btnResultado.isSelected()) {
            if (btnIntroduccion.isSelected()) {
                introduccion = txtEditor.getText();
            }
            if (btnConsiderandos.isSelected()) {
                considerandos = txtEditor.getText();
            }
            if (btnResuelvo.isSelected()) {
                resuelvo = txtEditor.getText();
            }
            btnIntroduccion.setSelected(false);
            btnConsiderandos.setSelected(false);
            btnResuelvo.setSelected(false);
            txtEditor.setText(resultado);
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnConsiderandosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsiderandosActionPerformed
        if (btnConsiderandos.isSelected()) {
            if (btnIntroduccion.isSelected()) {
                introduccion = txtEditor.getText();
            }
            if (btnResultado.isSelected()) {
                resultado = txtEditor.getText();
            }
            if (btnResuelvo.isSelected()) {
                resuelvo = txtEditor.getText();
            }
            btnIntroduccion.setSelected(false);
            btnResultado.setSelected(false);
            btnResuelvo.setSelected(false);
            txtEditor.setText(considerandos);
        }
    }//GEN-LAST:event_btnConsiderandosActionPerformed

    private void btnResuelvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResuelvoActionPerformed
        if (btnResuelvo.isSelected()) {
            if (btnIntroduccion.isSelected()) {
                introduccion = txtEditor.getText();
            }
            if (btnResultado.isSelected()) {
                resultado = txtEditor.getText();
            }
            if (btnConsiderandos.isSelected()) {
                considerandos = txtEditor.getText();
            }
            btnIntroduccion.setSelected(false);
            btnResultado.setSelected(false);
            btnConsiderandos.setSelected(false);
            txtEditor.setText(resuelvo);
        }
    }//GEN-LAST:event_btnResuelvoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (btnResuelvo.isSelected()) {
            resuelvo = txtEditor.getText();
        }else if(btnIntroduccion.isSelected()){
            introduccion = txtEditor.getText();
        }else if(btnResultado.isSelected()){
            resultado = txtEditor.getText();
        }else if(btnConsiderandos.isSelected()){
            considerandos = txtEditor.getText();
        }
        
        uibackoffice.CrearPlantilla(this);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNombreCoordinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreCoordinadorActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#nombreCoordinador", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnNombreCoordinador.setSelected(false);
    }//GEN-LAST:event_btnNombreCoordinadorActionPerformed

    private void btnNombreDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreDirectorActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#nombreDirectorEscuela", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnNombreDirector.setSelected(false);
    }//GEN-LAST:event_btnNombreDirectorActionPerformed

    private void btnNombreDirectorAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreDirectorAdmActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#nombreDirectorAdmYReg", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnNombreDirectorAdm.setSelected(false);
    }//GEN-LAST:event_btnNombreDirectorAdmActionPerformed

    private void btnIDSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDSolicitanteActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#idSolicitante", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnIDSolicitante.setSelected(false);
    }//GEN-LAST:event_btnIDSolicitanteActionPerformed

    private void btnCorreoAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorreoAfectadoActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#correoAfectado", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnCorreoAfectado.setSelected(false);
    }//GEN-LAST:event_btnCorreoAfectadoActionPerformed

    private void btnNombreAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreAfectadoActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#nombreAfectado", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnNombreAfectado.setSelected(false);
    }//GEN-LAST:event_btnNombreAfectadoActionPerformed

    private void btnIDAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDAfectadoActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#idAfectado", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnIDAfectado.setSelected(false);
    }//GEN-LAST:event_btnIDAfectadoActionPerformed

    private void btnNombreSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreSolicitanteActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#nombreSolicitante", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnNombreSolicitante.setSelected(false);
    }//GEN-LAST:event_btnNombreSolicitanteActionPerformed

    private void btnTelefonoAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefonoAfectadoActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#telefonoAfectado", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnTelefonoAfectado.setSelected(false);
    }//GEN-LAST:event_btnTelefonoAfectadoActionPerformed

    private void btnPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodoActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#periodo", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnPeriodo.setSelected(false);
    }//GEN-LAST:event_btnPeriodoActionPerformed

    private void btnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursoActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#codigoCurso", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnCurso.setSelected(false);
    }//GEN-LAST:event_btnCursoActionPerformed

    private void btnGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupoActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#nGrupo", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnGrupo.setSelected(false);
    }//GEN-LAST:event_btnGrupoActionPerformed

    private void btnInconsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInconsistenciaActionPerformed
        txtEditor.replaceSelection("");
        try {
            txtEditor.getDocument().insertString(txtEditor.getCaretPosition(), "#inconsistencia", null);
        } catch (BadLocationException ex) {
            Logger.getLogger(DialogRegistrarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnInconsistencia.setSelected(false);
    }//GEN-LAST:event_btnInconsistenciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConsiderandos;
    private javax.swing.JToggleButton btnCorreoAfectado;
    private javax.swing.JToggleButton btnCurso;
    private javax.swing.JToggleButton btnGrupo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JToggleButton btnIDAfectado;
    private javax.swing.JToggleButton btnIDSolicitante;
    private javax.swing.JToggleButton btnInconsistencia;
    private javax.swing.JToggleButton btnIntroduccion;
    private javax.swing.JToggleButton btnNombreAfectado;
    private javax.swing.JToggleButton btnNombreCoordinador;
    private javax.swing.JToggleButton btnNombreDirector;
    private javax.swing.JToggleButton btnNombreDirectorAdm;
    private javax.swing.JToggleButton btnNombreSolicitante;
    private javax.swing.JToggleButton btnPeriodo;
    private javax.swing.JToggleButton btnResuelvo;
    private javax.swing.JToggleButton btnResultado;
    private javax.swing.JToggleButton btnTelefonoAfectado;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTitAdmin;
    private javax.swing.JLabel lblTitAdmin1;
    private javax.swing.JLabel lblTitAfect;
    private javax.swing.JLabel lblTitSolicitante;
    private javax.swing.JLabel lblTitSolicitud;
    private javax.swing.JLabel lblTituloIcon;
    private Vista.PanelGeneral panelGeneral1;
    private javax.swing.JPanel pnlAdministrativos;
    private javax.swing.JPanel pnlAfectado;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlSolicitante;
    private javax.swing.JPanel pnlSolicitud;
    private org.jdesktop.swingx.JXEditorPane txtEditor;
    // End of variables declaration//GEN-END:variables

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getConsiderandos() {
        return considerandos;
    }

    public void setConsiderandos(String considerandos) {
        this.considerandos = considerandos;
    }

    public String getResuelvo() {
        return resuelvo;
    }

    public void setResuelvo(String resuelvo) {
        this.resuelvo = resuelvo;
    }

    public JXEditorPane getTxtEditor() {
        return txtEditor;
    }

    public void setTxtEditor(JXEditorPane txtEditor) {
        this.txtEditor = txtEditor;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JToggleButton getBtnConsiderandos() {
        return btnConsiderandos;
    }

    public void setBtnConsiderandos(JToggleButton btnConsiderandos) {
        this.btnConsiderandos = btnConsiderandos;
    }

    public JToggleButton getBtnIntroduccion() {
        return btnIntroduccion;
    }

    public void setBtnIntroduccion(JToggleButton btnIntroduccion) {
        this.btnIntroduccion = btnIntroduccion;
    }

    public JToggleButton getBtnResuelvo() {
        return btnResuelvo;
    }

    public void setBtnResuelvo(JToggleButton btnResuelvo) {
        this.btnResuelvo = btnResuelvo;
    }

    public JToggleButton getBtnResultado() {
        return btnResultado;
    }

    public void setBtnResultado(JToggleButton btnResultado) {
        this.btnResultado = btnResultado;
    }

    public JComboBox getCbCategoria() {
        return cbCategoria;
    }

    public void setCbCategoria(JComboBox cbCategoria) {
        this.cbCategoria = cbCategoria;
    }
    
    

}
