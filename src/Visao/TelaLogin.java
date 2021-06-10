
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TelaLogin extends javax.swing.JFrame {

   
    public TelaLogin(Object object, boolean b) {
        
        initComponents();
        
         this.setLocationRelativeTo(null);
         
         this.setResizable(false);
         
         
        
    }


    

    public JButton getBotonEnviar() {
        return BotonEnviar;
    }

    public JButton getBotonEsqueceuSenha() {
        return BotonEsqueceuSenha;
    }

    public JTextField getCnpj() {
        return cnpj;
    }

    
    public JPasswordField getCamposenha() {
        return camposenha;
    }

    
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonEsqueceuSenha = new javax.swing.JButton();
        BotonEnviar = new javax.swing.JButton();
        cnpj = new javax.swing.JTextField();
        camposenha = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonEsqueceuSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonEsqueceuSenha.setText("<html>     <p> <u> Esqueceu a senha? </u> </p>       </html>");
        BotonEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEsqueceuSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEsqueceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 160, 30));

        BotonEnviar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonEnviar.setText("Entrar");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 110, 40));

        cnpj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjActionPerformed(evt);
            }
        });
        getContentPane().add(cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 310, 40));

        camposenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposenhaActionPerformed(evt);
            }
        });
        getContentPane().add(camposenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 320, 40));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 140, 40));

        jPanel2.setBackground(java.awt.Color.white);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 1.png"))); // NOI18N
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjActionPerformed

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEnviarActionPerformed

    private void BotonEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEsqueceuSenhaActionPerformed
       
        
    }//GEN-LAST:event_BotonEsqueceuSenhaActionPerformed

    private void camposenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camposenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camposenhaActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               System.exit(0);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JButton BotonEsqueceuSenha;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JTextField cnpj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
    
}
