/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.gui;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author eduardo
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private String textoInicial;
    private String textoJuego;
    private String noAcertadas;
    private int parteMuneco=0;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jTTexto = new javax.swing.JTextField();
        jBEmpezar = new javax.swing.JButton();
        jTLetra = new javax.swing.JTextField();
        jBJuega = new javax.swing.JButton();
        jLError = new javax.swing.JLabel();
        jLNoAcertadas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCabeza = new javax.swing.JLabel();
        jLabelTronco = new javax.swing.JLabel();
        jLabelBrazoDer = new javax.swing.JLabel();
        jLabelBarzoIzq = new javax.swing.JLabel();
        jLabelPiernaIzq = new javax.swing.JLabel();
        jLabelPiernaDer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTTexto.setEditable(false);
        jTTexto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTTexto.setForeground(new java.awt.Color(0, 0, 255));
        jTTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jBEmpezar.setText("EMPEZAR JUEGO");
        jBEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmpezarActionPerformed(evt);
            }
        });

        jTLetra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTLetra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTLetra.setEnabled(false);
        jTLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTLetraKeyTyped(evt);
            }
        });

        jBJuega.setText(">");
        jBJuega.setEnabled(false);
        jBJuega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJuegaActionPerformed(evt);
            }
        });

        jLError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLError.setForeground(new java.awt.Color(255, 0, 51));
        jLError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLNoAcertadas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNoAcertadas.setForeground(new java.awt.Color(255, 0, 51));

        jLabelCabeza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCabeza.setText("0");

        jLabelTronco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTronco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTronco.setText("|");

        jLabelBrazoDer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelBrazoDer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBrazoDer.setText("-");

        jLabelBarzoIzq.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelBarzoIzq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBarzoIzq.setText("-");

        jLabelPiernaIzq.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPiernaIzq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPiernaIzq.setText("/");

        jLabelPiernaDer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPiernaDer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPiernaDer.setText("\\");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelBarzoIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCabeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelTronco, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelBrazoDer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelPiernaIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPiernaDer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE)))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCabeza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTronco)
                            .addComponent(jLabelBrazoDer)
                            .addComponent(jLabelBarzoIzq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPiernaIzq)
                            .addComponent(jLabelPiernaDer))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );

            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel1.setText("Letras Fallidas:");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBJuega))
                                .addComponent(jBEmpezar))
                            .addGap(107, 107, 107)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30))
                        .addComponent(jTTexto)
                        .addComponent(jLError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLNoAcertadas, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jTTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLError, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLNoAcertadas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBJuega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(jBEmpezar)
                            .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jBEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpezarActionPerformed
        VentanaPalabra ventanaHija=new VentanaPalabra(this, true);
        ventanaHija.setVisible(true);
    }//GEN-LAST:event_jBEmpezarActionPerformed

    private void jBJuegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJuegaActionPerformed
       juegaLetra();
    }//GEN-LAST:event_jBJuegaActionPerformed

    private void juegaLetra(){
        if (jTLetra.getText().equals("")) jLError.setText("Debes de introducir una letra"); //si no se introdujo ninguna letra
        else{
            if ((noAcertadas.contains(jTLetra.getText()))||(textoJuego.contains(jTLetra.getText()))) jLError.setText("Esta letra ya a sido seleccionada escoge otra");
            else{
                char[] auxArray = textoJuego.toCharArray();
                boolean encontrado=false;
                for (int x=0;x<textoInicial.length();x++){
                    if (textoInicial.charAt(x)==jTLetra.getText().charAt(0)){
                        auxArray[x] = jTLetra.getText().charAt(0); // Donde 'x' es la posición encontrada
                        encontrado=true;
                    } 
                }       
                if (encontrado){ //El caracter está en el texto
                    textoJuego = String.valueOf(auxArray);
                    jTTexto.setText(textoJuego);
                    if (!(textoJuego.contains("-"))){
                        jTLetra.setEnabled(false);
                        jBJuega.setEnabled(false);
                        jLError.setText("Ganaste la partida");
                    }
                } else {//el caracter no está en el texto
                    noAcertadas+=jTLetra.getText()+" ";
                    jLNoAcertadas.setText(noAcertadas);
                    parteMuneco+=1;
                    mostrarMuneco();
                }
            }
            jTLetra.setText("");
        }
    }
    
    private void jTLetraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLetraKeyTyped
        jLError.setText("");
        if (
                (
                    (((evt.getKeyChar()>='A')&&(evt.getKeyChar()<='Z')) //sea una letra de la A a la Z
                    ||((evt.getKeyChar()>='a')&&(evt.getKeyChar()<='z')) // o sea una letra de la A a la Z
                    ||(evt.getKeyChar()=='ñ')||(evt.getKeyChar()=='Ñ')
                    ||(evt.getKeyChar()==KeyEvent.VK_DELETE))  //o sea la tecla de borrar
                )
                &&(jTLetra.getText().length()<1) // y no exceda el tamaño de un caracter y no sea la tecla de borrar
            ){
              char c = evt.getKeyChar();
              if (Character.isLowerCase(c)) 
                        evt.setKeyChar(Character.toUpperCase(c));        // pasa el caracter a mayúscula
              
        } else if (evt.getKeyChar()==KeyEvent.VK_ENTER){
                juegaLetra();
            
        } else evt.consume();
     //en caso de que no sea lo anterior no realiza el evento (cancela la tecla pulsada)
    }//GEN-LAST:event_jTLetraKeyTyped

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
    
    private void mostrarMuneco(){
        switch (parteMuneco){
            case 1: jLabelCabeza.setVisible(true);
                    break;
            case 2: jLabelTronco.setVisible(true);
                    break;                    
            case 3: jLabelBarzoIzq.setVisible(true);
                    break;       
            case 4: jLabelBrazoDer.setVisible(true);
                    break;  
            case 5: jLabelPiernaIzq.setVisible(true);
                    break;       
            case 6: jLabelPiernaDer.setVisible(true);
                    jTLetra.setEnabled(false);
                    jBJuega.setEnabled(false);
                    jLError.setText("Perdiste la partida");
                    break;                        
        }
    }    
    
    public void cogerValor(String valor){
        //inicialoiza variables del juego
        textoInicial=valor;
        textoJuego="";
        noAcertadas="";
        parteMuneco=0;
        //oculta todas las letras de la palabra
        for (int i=0;i<textoInicial.length();i++)
            textoJuego+="-";
        jTTexto.setText(textoJuego);
        //habilita controles del juego
        jTLetra.setEnabled(true);
        jBJuega.setEnabled(true);
        jLNoAcertadas.setText("");
        jLError.setText("");
        //oculta muñeco
        jLabelBarzoIzq.setVisible(false);
        jLabelBrazoDer.setVisible(false);
        jLabelPiernaIzq.setVisible(false);
        jLabelPiernaDer.setVisible(false);
        jLabelCabeza.setVisible(false);
        jLabelTronco.setVisible(false);

                
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEmpezar;
    private javax.swing.JButton jBJuega;
    private javax.swing.JLabel jLError;
    private javax.swing.JLabel jLNoAcertadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBarzoIzq;
    private javax.swing.JLabel jLabelBrazoDer;
    private javax.swing.JLabel jLabelCabeza;
    private javax.swing.JLabel jLabelPiernaDer;
    private javax.swing.JLabel jLabelPiernaIzq;
    private javax.swing.JLabel jLabelTronco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTLetra;
    private javax.swing.JTextField jTTexto;
    // End of variables declaration//GEN-END:variables
}