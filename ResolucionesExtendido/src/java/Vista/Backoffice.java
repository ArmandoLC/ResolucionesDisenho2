package Vista;

import DTOs.DTOSolicitud;
import Enums.Estado;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXHyperlink;

public class Backoffice extends HerramientasBackoffice{
    
    private JPopupMenu popup;
    private UIBackoffice uibackoffice = new UIBackoffice(this);;
            
    public Backoffice() {
        initLookAndFeel();
        initComponents();
        initVariables();
        initConsultaSolicitudes();
        
        Font f = new Font("Verdana", 0, 20);
        //new java.awt.Font("Verdana", 0, 16)
        linkEstadisticas.setFont(f);
        linkReporteSolicitudes.setFont(f);
        linkRegistroSolic.setFont(f);
    }
    
    private void initConsultaSolicitudes(){
        uibackoffice.ConsultarSolicitudes();
    }

    public JXHyperlink getLinkEstadisticas() {
        return linkEstadisticas;
    }

    public JXHyperlink getLinkReporteSolicitudes() {
        return linkReporteSolicitudes;
    }
    
    
    private void initVariables(){
        initModel(tabSolicitudes);
        setEstados();
        setFechas();
        setListeners();
        setLocationRelativeTo(null);
    }
    
    private void setEstados(){
        cbEstado.addItem("Todas");
        for(Estado estado : Estado.values())
            cbEstado.addItem(estado.toString());
    }
    
    private void setFechas(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -30);
        dpDesde.setDate(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 31);
        dpHasta.setDate(calendar.getTime());
    }
    
    private void setListeners(){
        tabSolicitudes.addMouseListener(mouseAdapter);
        cbEstado.addItemListener(itemListener);
    }

    private final ItemListener itemListener = new ItemListener (){
        @Override
        public void itemStateChanged(ItemEvent e) {
            uibackoffice.ConsultarSolicitudes();
        }
    };
    
    private final MouseAdapter mouseAdapter = new MouseAdapter() {
        @Override
        public void mouseReleased(MouseEvent e) {
            if (e.isPopupTrigger()) {
                int i = tabSolicitudes.rowAtPoint( e.getPoint() );
                int j = tabSolicitudes.columnAtPoint( e.getPoint() );
                if (! tabSolicitudes.isRowSelected(i)) tabSolicitudes.changeSelection(i, j, false, false);
                popup = new JPopupMenu(); addPopupMenuOptions();
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        }     
    };
    
    public void addPopupMenuOptions(){
        DTOSolicitud solicitud = tabModelSolicitudes.getSolicitud(tabSolicitudes.getSelectedRow());
        switch(Estado.valueOf(solicitud.getEstado())){
            case Anulada: setPopupOptionsSolicitudAnulada(solicitud); break;
            case Tramitada: setPopupOptionsSolicitudTramitada(solicitud); break;
            case Pendiente: setPopupOptionsSolicitudPendiente(solicitud); break;
        }
        setPopupOptionsSolicitud(solicitud);
    }
    
    public void setPopupOptionsSolicitudAnulada(DTOSolicitud solicitud){
        JMenuItem item = new JMenuItem("Motivo de anulación");
        item.addActionListener((ActionEvent e) -> {
            Dialog dialog = new DialogAclaracion(this, true, solicitud);
            dialog.setVisible(true);
        }); popup.add(item);
    }
    
    public void setPopupOptionsSolicitudTramitada(DTOSolicitud solicitud){
        JMenuItem item = new JMenuItem();
        item.setText("Resolución");
        item.addActionListener((ActionEvent e) -> {
            Dialog dialog = new DialogRegistrarResolucion(this, true, solicitud);
            dialog.setVisible(true);
        }); popup.add(item);
    }
    
    public void setPopupOptionsSolicitudPendiente(DTOSolicitud solicitud){
        JMenuItem itemGenerar = new JMenuItem("Tramitar solicitud");
        itemGenerar.addActionListener((ActionEvent e) -> {
            uibackoffice.TramitarSolicitud(solicitud);
        }); popup.add(itemGenerar);
        JMenuItem itemVer = new JMenuItem("Anular solicitud");
        itemVer.addActionListener((ActionEvent e) -> {
            Dialog dialog = new DialogAclaracion(this, true, solicitud);
            dialog.setVisible(true);
        }); popup.add(itemVer);
    }
    
    public void setPopupOptionsSolicitud(DTOSolicitud solicitud){
        JMenuItem itemVer = new JMenuItem("Visualizar detalles");
        itemVer.addActionListener((ActionEvent e) -> {
            Dialog dialog = new DialogDetallesSolicitud(this, true, solicitud);
            dialog.setVisible(true);
        }); popup.add(itemVer);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busyPainter1 = new org.jdesktop.swingx.painter.BusyPainter();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        panelFondo = new javax.swing.JPanel();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dpDesde = new org.jdesktop.swingx.JXDatePicker();
        dpHasta = new org.jdesktop.swingx.JXDatePicker();
        lblDesde = new javax.swing.JLabel();
        lblHasta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabSolicitudes = new org.jdesktop.swingx.JXTable();
        linkReporteSolicitudes = new org.jdesktop.swingx.JXHyperlink();
        lblTitulo = new javax.swing.JLabel();
        lblIconoAdminSolic = new javax.swing.JLabel();
        linkRegistroSolic = new org.jdesktop.swingx.JXHyperlink();
        linkEstadisticas = new org.jdesktop.swingx.JXHyperlink();
        pnlFondo = new Vista.PanelGeneral();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbEstado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        cbEstado.setToolTipText("Filtrar las solicitudes por estado");
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });
        panelFondo.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 159, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel1.setText("Filtrar por estado:");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));
        panelFondo.add(dpDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        dpHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpHastaActionPerformed(evt);
            }
        });
        panelFondo.add(dpHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        lblDesde.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lblDesde.setText("Desde:");
        panelFondo.add(lblDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 31, -1, -1));

        lblHasta.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lblHasta.setText("Hasta:");
        panelFondo.add(lblHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        tabSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabSolicitudes);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 64, 1060, 378));

        linkReporteSolicitudes.setText("Reporte de solicitudes según las fechas indicadas");
        linkReporteSolicitudes.setClickedColor(new java.awt.Color(0, 51, 255));
        linkReporteSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkReporteSolicitudesActionPerformed(evt);
            }
        });
        panelFondo.add(linkReporteSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 1120, 499));

        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(240, 0, 0));
        lblTitulo.setText("Administración de Solicitudes");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        lblIconoAdminSolic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/adminSolicIcon.jpg"))); // NOI18N
        getContentPane().add(lblIconoAdminSolic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        linkRegistroSolic.setForeground(new java.awt.Color(255, 255, 255));
        linkRegistroSolic.setText("Registrar Solicitud");
        linkRegistroSolic.setClickedColor(new java.awt.Color(255, 255, 255));
        linkRegistroSolic.setUnclickedColor(new java.awt.Color(255, 255, 255));
        linkRegistroSolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkRegistroSolicActionPerformed(evt);
            }
        });
        getContentPane().add(linkRegistroSolic, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, 20));
        linkRegistroSolic.getAccessibleContext().setAccessibleName("Registrar Solicitud");

        linkEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        linkEstadisticas.setText("Estadísticas");
        linkEstadisticas.setClickedColor(new java.awt.Color(255, 255, 255));
        linkEstadisticas.setUnclickedColor(new java.awt.Color(255, 255, 255));
        linkEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(linkEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, -1, 20));
        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkEstadisticasActionPerformed
        JDialog dialog = new DialogEstadisticas(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_linkEstadisticasActionPerformed

    private void linkReporteSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkReporteSolicitudesActionPerformed
        JDialog dialog = new DialogSolicitudesAtendidas(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_linkReporteSolicitudesActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void dpHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpHastaActionPerformed

    private void linkRegistroSolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkRegistroSolicActionPerformed
        JDialog dialog = new DialogRegistrarSolicitud(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_linkRegistroSolicActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.painter.BusyPainter busyPainter1;
    private javax.swing.JComboBox<String> cbEstado;
    private org.jdesktop.swingx.JXDatePicker dpDesde;
    private org.jdesktop.swingx.JXDatePicker dpHasta;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblIconoAdminSolic;
    private javax.swing.JLabel lblTitulo;
    private org.jdesktop.swingx.JXHyperlink linkEstadisticas;
    private org.jdesktop.swingx.JXHyperlink linkRegistroSolic;
    private org.jdesktop.swingx.JXHyperlink linkReporteSolicitudes;
    private javax.swing.JPanel panelFondo;
    private Vista.PanelGeneral pnlFondo;
    private org.jdesktop.swingx.JXTable tabSolicitudes;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Backoffice().setVisible(true);
        });
    }

    public JComboBox<String> getCbEstado() {
        return cbEstado;
    }

    public void setCbEstado(JComboBox<String> cbEstado) {
        this.cbEstado = cbEstado;
    }

    public JXDatePicker getDpDesde() {
        return dpDesde;
    }

    public void setDpDesde(JXDatePicker dpDesde) {
        this.dpDesde = dpDesde;
    }

    public JXDatePicker getDpHasta() {
        return dpHasta;
    }

    public void setDpHasta(JXDatePicker dpHasta) {
        this.dpHasta = dpHasta;
    }
    
}
