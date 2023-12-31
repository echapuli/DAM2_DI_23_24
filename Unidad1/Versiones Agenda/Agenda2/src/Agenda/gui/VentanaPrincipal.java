/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda.gui;

import Agenda.dto.Contacto;
import Agenda.logica.LogicaNegocio;
import java.util.List;
import java.util.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        refrescaTabla();

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgenda = new javax.swing.JTable();
        jTextFieldError = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlta = new javax.swing.JMenu();
        jMenuBaja = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAgenda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableAgenda);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTextFieldError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jTextFieldError, java.awt.BorderLayout.PAGE_END);

        jMenuAlta.setText("Alta");
        jMenuAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuAltaMousePressed(evt);
            }
        });
        jMenuBar1.add(jMenuAlta);

        jMenuBaja.setText("Baja");
        jMenuBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBajaMousePressed(evt);
            }
        });
        jMenuBar1.add(jMenuBaja);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAltaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAltaMousePressed
        jTextFieldError.setText("");  //Borro el mensaje de error
        JDialogAlta DialogoAlta = new JDialogAlta(this, true); //creamos una ventana de diálogo
        DialogoAlta.setVisible(true);   //la visualizamos
        refrescaTabla();
    }//GEN-LAST:event_jMenuAltaMousePressed

    private void jMenuBajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBajaMousePressed
        jTextFieldError.setText("");  //Borro el mensaje de error
        //Comprobamos si hay una fila seleccionada
        int fila;
        fila=jTableAgenda.getSelectedRow();
        if (fila==-1){ //si no hay una fila seleccionada
            jTextFieldError.setText("Selecciona una fila");
        } else {  //si la fila esta seleccionada la borramos de si datatable
            LogicaNegocio.getListaContactos().remove(fila);
            refrescaTabla();
        }
    }//GEN-LAST:event_jMenuBajaMousePressed
    
    //Método que refresca la tabla
    private void refrescaTabla(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre","Apellidos","fecha Alta","Provincia"});
        List<Contacto> listaContactos = LogicaNegocio.getListaContactos();
        for(Contacto contacto:listaContactos){
            dtm.addRow(contacto.contactoArray());
        }
        jTableAgenda.setModel(dtm);
    }

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAlta;
    private javax.swing.JMenu jMenuBaja;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAgenda;
    private javax.swing.JTextField jTextFieldError;
    // End of variables declaration//GEN-END:variables
}
