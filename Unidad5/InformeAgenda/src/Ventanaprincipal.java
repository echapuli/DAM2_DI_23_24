import java.io.File;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class Ventanaprincipal extends javax.swing.JFrame {

    /**
     * Creates new form Ventanaprincipal
     */
    public Ventanaprincipal() {
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

        jButtonMostrarInforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonMostrarInforme.setText("Informe");
        jButtonMostrarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButtonMostrarInforme)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonMostrarInforme)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarInformeActionPerformed
        //al pulsar el botón mostramos el informe
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();   //primero se carga el driver (en este caso es de HSQLDB
                    Connection conexion=DriverManager.getConnection("jdbc:mysql://192.168.8.49:3306/Agenda","usuario","1234");  //ctreamos la conexión, los datos los sacamos del iReport en la definición del dataSource
                                                                                                                      //Debeis poner vuestro usuario y contraseña
                    //ahora generamos el informe
                    // Cuando se utilizan SubReport se crea automaticamente un parámetro SUBREPORT_DIR con la ruta donde estan los subreport
                    //para los parámetros utilizamos la clase Map de Java (la clase Map almacenapares de clave-valor    
                    Map parametros=new HashMap();
                    parametros.put("SUBREPORT_DIR", "");    //como esta en el mismo lugar que el report principal dejo el parámetro vacio               
                    //ahora vamos a utilizar la librería de Casper y para eso debemos tebnerla importada
                    JasperPrint print=JasperFillManager.fillReport("informes"+File.separator+"ReportAgenda.jasper", parametros,conexion);
                    JasperExportManager.exportReportToPdfFile(print,"informes"+File.separator+"reportAgenda.pdf");
                }
                catch(Throwable e){
                    e.printStackTrace();

                }
    }//GEN-LAST:event_jButtonMostrarInformeActionPerformed

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
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMostrarInforme;
    // End of variables declaration//GEN-END:variables
}
