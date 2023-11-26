package gui;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class ConversorUnidades_GUI extends javax.swing.JFrame {

    public ConversorUnidades_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneMain = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnLongitud = new javax.swing.JMenuItem();
        btnArea = new javax.swing.JMenuItem();
        btnTiempo = new javax.swing.JMenuItem();
        btnMasa = new javax.swing.JMenuItem();
        btnPresion = new javax.swing.JMenuItem();
        btnTemperatura = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnGuide = new javax.swing.JMenuItem();
        btnGH = new javax.swing.JMenuItem();
        btnDocs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de unidades");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPaneMain.setPreferredSize(new java.awt.Dimension(776, 384));

        javax.swing.GroupLayout jDesktopPaneMainLayout = new javax.swing.GroupLayout(jDesktopPaneMain);
        jDesktopPaneMain.setLayout(jDesktopPaneMainLayout);
        jDesktopPaneMainLayout.setHorizontalGroup(
            jDesktopPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        jDesktopPaneMainLayout.setVerticalGroup(
            jDesktopPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPaneMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 774, 390));

        jMenuBar1.setBackground(new java.awt.Color(102, 204, 255));

        jMenu1.setText("Conversores");

        btnLongitud.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnLongitud.setText("Longitud");
        btnLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLongitudActionPerformed(evt);
            }
        });
        jMenu1.add(btnLongitud);

        btnArea.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnArea.setText("Área");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });
        jMenu1.add(btnArea);

        btnTiempo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnTiempo.setText("Tiempo");
        btnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoActionPerformed(evt);
            }
        });
        jMenu1.add(btnTiempo);

        btnMasa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnMasa.setText("Masa");
        btnMasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasaActionPerformed(evt);
            }
        });
        jMenu1.add(btnMasa);

        btnPresion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnPresion.setText("Presión");
        btnPresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresionActionPerformed(evt);
            }
        });
        jMenu1.add(btnPresion);

        btnTemperatura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnTemperatura.setText("Temperatura");
        btnTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperaturaActionPerformed(evt);
            }
        });
        jMenu1.add(btnTemperatura);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Más");

        btnGuide.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnGuide.setText("Guía de uso");
        btnGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuideActionPerformed(evt);
            }
        });
        jMenu2.add(btnGuide);

        btnGH.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnGH.setText("Sitio web");
        btnGH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGHActionPerformed(evt);
            }
        });
        jMenu2.add(btnGH);

        btnDocs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnDocs.setText("Documentación");
        btnDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocsActionPerformed(evt);
            }
        });
        jMenu2.add(btnDocs);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGHActionPerformed
        String enlace = "https://github.com/espinozamnj/conversorUnidades/";
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI(enlace);
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGHActionPerformed

    private void btnLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLongitudActionPerformed
        FrmLongitud frmLongitud = new FrmLongitud();
        jDesktopPaneMain.add(frmLongitud);
        frmLongitud.setVisible(true);
    }//GEN-LAST:event_btnLongitudActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        FrmArea frmArea = new FrmArea();
        jDesktopPaneMain.add(frmArea);
        frmArea.setVisible(true);
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoActionPerformed
        FrmTiempo frmTiempo = new FrmTiempo();
        jDesktopPaneMain.add(frmTiempo);
        frmTiempo.setVisible(true);
    }//GEN-LAST:event_btnTiempoActionPerformed

    private void btnMasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasaActionPerformed
        FrmMasa frmMasa = new FrmMasa();
        jDesktopPaneMain.add(frmMasa);
        frmMasa.setVisible(true);
    }//GEN-LAST:event_btnMasaActionPerformed

    private void btnPresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresionActionPerformed
        FrmPresion frmPresion = new FrmPresion();
        jDesktopPaneMain.add(frmPresion);
        frmPresion.setVisible(true);
    }//GEN-LAST:event_btnPresionActionPerformed

    private void btnTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperaturaActionPerformed
        FrmTemperatura frmTemperatura = new FrmTemperatura();
        jDesktopPaneMain.add(frmTemperatura);
        frmTemperatura.setVisible(true);
    }//GEN-LAST:event_btnTemperaturaActionPerformed

    private void btnGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuideActionPerformed
        String enlace = "https://github.com/espinozamnj/conversorUnidades/blob/main/GUIDE.md";
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI(enlace);
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuideActionPerformed

    private void btnDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocsActionPerformed
        String enlace = "https://github.com/espinozamnj/conversorUnidades/blob/main/DOCUMENTATION.md";
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI(enlace);
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDocsActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorUnidades_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorUnidades_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorUnidades_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorUnidades_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorUnidades_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnArea;
    private javax.swing.JMenuItem btnDocs;
    private javax.swing.JMenuItem btnGH;
    private javax.swing.JMenuItem btnGuide;
    private javax.swing.JMenuItem btnLongitud;
    private javax.swing.JMenuItem btnMasa;
    private javax.swing.JMenuItem btnPresion;
    private javax.swing.JMenuItem btnTemperatura;
    private javax.swing.JMenuItem btnTiempo;
    private javax.swing.JDesktopPane jDesktopPaneMain;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
