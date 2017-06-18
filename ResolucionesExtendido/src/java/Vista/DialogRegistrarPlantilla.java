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

    private DTOSolicitud solicitud;
    private String introduccion = "";

    private String resultado = "";

    private String considerandos = "";

    private String resuelvo = "";

    public DialogRegistrarPlantilla(java.awt.Frame parent, boolean modal, DTOSolicitud solicitud) {
        super(parent, modal);
        initComponents();
        initInconsistencias();

        uibackoffice = new UIBackoffice((HerramientasBackoffice) parent);
        txtEditor.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        txtEditor.setText(introduccion);
        btnIntroduccion.setSelected(true);
        this.solicitud = solicitud;

        uibackoffice.ConsultarResolucion(this);

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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEditor = new org.jdesktop.swingx.JXEditorPane();
        btnIntroduccion = new javax.swing.JToggleButton();
        btnResultado = new javax.swing.JToggleButton();
        btnConsiderandos = new javax.swing.JToggleButton();
        btnResuelvo = new javax.swing.JToggleButton();
        btnGuardar = new javax.swing.JButton();
        btnNombreCoordinador = new javax.swing.JToggleButton();
        btnNombreDirector = new javax.swing.JToggleButton();
        btnNombreDirectorAdm = new javax.swing.JToggleButton();
        btnIDSolicitante = new javax.swing.JToggleButton();
        btnCorreoAfectado = new javax.swing.JToggleButton();
        btnNombreAfectado = new javax.swing.JToggleButton();
        btnIDAfectado = new javax.swing.JToggleButton();
        btnNombreSolicitante = new javax.swing.JToggleButton();
        btnTelefonoAfectado = new javax.swing.JToggleButton();
        btnPeriodo = new javax.swing.JToggleButton();
        btnCurso = new javax.swing.JToggleButton();
        btnGrupo = new javax.swing.JToggleButton();
        btnInconsistencia = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtEditor.setBorder(null);
        txtEditor.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtEditor.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtEditor.setMargin(new java.awt.Insets(20, 20, 20, 20));
        txtEditor.setOpaque(false);
        jScrollPane3.setViewportView(txtEditor);

        btnIntroduccion.setText("Introducción");
        btnIntroduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntroduccionActionPerformed(evt);
            }
        });

        btnResultado.setText("Resultado");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        btnConsiderandos.setText("Considerandos");
        btnConsiderandos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsiderandosActionPerformed(evt);
            }
        });

        btnResuelvo.setText("Resuelvo");
        btnResuelvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResuelvoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNombreCoordinador.setText("Coordinador");
        btnNombreCoordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreCoordinadorActionPerformed(evt);
            }
        });

        btnNombreDirector.setText("Director Escuela");
        btnNombreDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreDirectorActionPerformed(evt);
            }
        });

        btnNombreDirectorAdm.setText("Director Adm&Reg");
        btnNombreDirectorAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreDirectorAdmActionPerformed(evt);
            }
        });

        btnIDSolicitante.setText("IDSolicitante");
        btnIDSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDSolicitanteActionPerformed(evt);
            }
        });

        btnCorreoAfectado.setText("CorreoAfectado");
        btnCorreoAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorreoAfectadoActionPerformed(evt);
            }
        });

        btnNombreAfectado.setText("NombreAfectado");
        btnNombreAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreAfectadoActionPerformed(evt);
            }
        });

        btnIDAfectado.setText("IDAfectado");
        btnIDAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDAfectadoActionPerformed(evt);
            }
        });

        btnNombreSolicitante.setText("Nombre Solicitante");
        btnNombreSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreSolicitanteActionPerformed(evt);
            }
        });

        btnTelefonoAfectado.setText("TelefonoAfectado");
        btnTelefonoAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonoAfectadoActionPerformed(evt);
            }
        });

        btnPeriodo.setText("Periodo");
        btnPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodoActionPerformed(evt);
            }
        });

        btnCurso.setText("Curso");
        btnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursoActionPerformed(evt);
            }
        });

        btnGrupo.setText("Grupo");
        btnGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupoActionPerformed(evt);
            }
        });

        btnInconsistencia.setText("Inconsistencia");
        btnInconsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInconsistenciaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de la Solicitud");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos del Solicitante");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Datos del Afectado");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Categoría");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIntroduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsiderandos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResuelvo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnIDSolicitante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnNombreCoordinador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNombreDirector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNombreDirectorAdm))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnTelefonoAfectado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInconsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNombreSolicitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIDAfectado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNombreAfectado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCorreoAfectado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNombreCoordinador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNombreDirector, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnIntroduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNombreDirectorAdm, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnIDSolicitante, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNombreSolicitante, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addGap(31, 31, 31)
                                .addComponent(btnIDAfectado, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNombreAfectado, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCorreoAfectado, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTelefonoAfectado, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(btnPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnResuelvo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(208, 208, 208))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnConsiderandos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(9, 9, 9)
                        .addComponent(btnGrupo)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInconsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
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

    public DTOSolicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(DTOSolicitud solicitud) {
        this.solicitud = solicitud;
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
