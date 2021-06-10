
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TelaRecuperaSenha extends javax.swing.JFrame {

   
    public TelaRecuperaSenha(java.awt.Frame parent, boolean modal) {
        
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
        
        
    }

    public JButton getBotonCadastrar() {
        return BotonCadastrar;
    }

    public JButton getConfirmar() {
        return Confirmar;
    }


    public JButton getBotonSair() {
        return BotonSair;
    }

    public JPasswordField getCamposenha() {
        return camposenha;
    }

    public JPasswordField getCamponovasenha() {
        return camponovasenha;
    }

    


    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonCadastrar = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();
        BotonSair = new javax.swing.JButton();
        camposenha = new javax.swing.JPasswordField();
        camponovasenha = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        BotonCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonCadastrar.setText("CADASTRAR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Confirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Confirmar.setText("CONFIRMAR");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 120, 50));

        BotonSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/voltar.png"))); // NOI18N
        BotonSair.setBorderPainted(false);
        BotonSair.setDoubleBuffered(true);
        BotonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 60, 30));
        getContentPane().add(camposenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 270, 30));
        getContentPane().add(camponovasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 257, 300, 30));

        jPanel1.setBackground(java.awt.Color.white);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 1.2.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 450, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void BotonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSairActionPerformed

  
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
            java.util.logging.Logger.getLogger(TelaRecuperaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRecuperaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRecuperaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRecuperaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                System.exit(0);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCadastrar;
    private javax.swing.JButton BotonSair;
    private javax.swing.JButton Confirmar;
    private javax.swing.JPasswordField camponovasenha;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

     public void dispose(boolean b) {
       
        
    }

}
