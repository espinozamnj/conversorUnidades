package gui;

import javax.swing.JOptionPane;
import base.Conversor;

public class FrmTiempo extends javax.swing.JInternalFrame {
    Conversor conversor = new Conversor();
    public FrmTiempo() {
        initComponents();
        comboEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(conversor.unidadesTiempo));
        comboSalida.setModel(new javax.swing.DefaultComboBoxModel<>(conversor.unidadesTiempo));
        this.title = "Conversor de tiempo";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboEntrada = new javax.swing.JComboBox<>();
        lbl_a = new javax.swing.JLabel();
        comboSalida = new javax.swing.JComboBox<>();
        iptValorEntrada = new javax.swing.JTextField();
        lbl_a1 = new javax.swing.JLabel();
        iptValorSalida = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        setClosable(true);
        setIconifiable(true);

        comboEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1", "time2" }));
        comboEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEntradaActionPerformed(evt);
            }
        });

        lbl_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_a.setText("a");

        comboSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1", "time2" }));
        comboSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSalidaActionPerformed(evt);
            }
        });

        iptValorEntrada.setBackground(new java.awt.Color(238, 238, 238));
        iptValorEntrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        iptValorEntrada.setForeground(new java.awt.Color(0, 0, 0));
        iptValorEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iptValorEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40)));
        iptValorEntrada.setMargin(new java.awt.Insets(16, 22, 16, 22));
        iptValorEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iptValorEntradaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iptValorEntradaKeyTyped(evt);
            }
        });

        lbl_a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_a1.setText("=");

        iptValorSalida.setEditable(false);
        iptValorSalida.setBackground(new java.awt.Color(255, 255, 255));
        iptValorSalida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iptValorSalida.setForeground(new java.awt.Color(0, 0, 0));
        iptValorSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iptValorSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iptValorSalida.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        iptValorSalida.setMargin(new java.awt.Insets(6, 22, 6, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboEntrada, 0, 150, Short.MAX_VALUE)
                    .addComponent(iptValorEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_a, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iptValorSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(iptValorSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iptValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_a1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(comboEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_a)
                    .addComponent(comboSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEntradaActionPerformed
        actualizarSalida();
    }//GEN-LAST:event_comboEntradaActionPerformed

    private void comboSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSalidaActionPerformed
        actualizarSalida();
    }//GEN-LAST:event_comboSalidaActionPerformed

    private void iptValorEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptValorEntradaKeyTyped
        Character objTecla = evt.getKeyChar();
        boolean delKey = objTecla == '\b' || objTecla == '\u007F';
        boolean validDot = false;
        if (objTecla == '.') {;
            if (!iptValorEntrada.getText().contains(".")) {
                validDot = true;
            }
            if (getEntrada().equals("")) {
                iptValorEntrada.setText("0");
            }
        }
        if (!Character.isDigit(objTecla) && !delKey && !validDot) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "La entrada es numérica", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_iptValorEntradaKeyTyped

    private void iptValorEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptValorEntradaKeyReleased
        actualizarSalida();
    }//GEN-LAST:event_iptValorEntradaKeyReleased
    private String getEntrada() {
        return iptValorEntrada.getText().trim();
    }
    private void actualizarSalida() {
        float valorEntrada = getValorEntrada();
        String unidadA = comboEntrada.getSelectedItem().toString();
        String unidadB = comboSalida.getSelectedItem().toString();
        float valorSalida = conversor.convTiempo(unidadA, unidadB, valorEntrada);
        iptValorSalida.setText(String.valueOf(valorSalida));
        System.out.printf("%.3f %s = %.3f %s%n", valorEntrada, unidadA, valorSalida, unidadB);
    }
    private float getValorEntrada() {
        float valor = 0;
        String strEntrada = getEntrada();
        if (!strEntrada.equals("")) {
            if (strEntrada.endsWith(".")) {
                strEntrada += "0";
            }
            try {
                valor = Float.parseFloat(strEntrada);
            } catch (Exception ex) {
                iptValorEntrada.setText("");
                valor = 0;
            }
        }
        return valor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboEntrada;
    private javax.swing.JComboBox<String> comboSalida;
    private javax.swing.JTextField iptValorEntrada;
    private javax.swing.JTextField iptValorSalida;
    private javax.swing.JLabel lbl_a;
    private javax.swing.JLabel lbl_a1;
    // End of variables declaration//GEN-END:variables
}
