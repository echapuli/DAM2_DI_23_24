/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dialog;

/**
 *
 * @author Eduardo
 */
public class VentanaSecundaria3 extends javax.swing.JDialog {

    /**
     * Creates new form VentanaSecundaria2
     */
    public VentanaSecundaria3(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNumeroVentana3 = new javax.swing.JLabel();
        jButtonVolver3 = new javax.swing.JButton();
        jButtonAbrirVentana3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNumeroVentana3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelNumeroVentana3.setForeground(new java.awt.Color(255, 0, 51));
        jLabelNumeroVentana3.setText("Ventana 3");

        jButtonVolver3.setText("Volver");
        jButtonVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolver3ActionPerformed(evt);
            }
        });

        jButtonAbrirVentana3.setText("Abrir Ventana");
        jButtonAbrirVentana3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirVentana3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelNumeroVentana3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButtonAbrirVentana3)
                        .addGap(58, 58, 58)
                        .addComponent(jButtonVolver3)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabelNumeroVentana3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver3)
                    .addComponent(jButtonAbrirVentana3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver3ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButtonVolver3ActionPerformed

    private void jButtonAbrirVentana3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirVentana3ActionPerformed

    }//GEN-LAST:event_jButtonAbrirVentana3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirVentana3;
    private javax.swing.JButton jButtonVolver3;
    private javax.swing.JLabel jLabelNumeroVentana3;
    // End of variables declaration//GEN-END:variables
}
