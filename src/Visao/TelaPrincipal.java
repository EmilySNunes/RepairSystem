
package Visao;

import Controle.ControleLogin;
import javax.swing.JButton;


public class TelaPrincipal extends javax.swing.JFrame {

    

    public TelaPrincipal(Object object, boolean b) {
       
         initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
        
      
        
        
    }

    public JButton getBotonSair() {
        return BotonSair;
    }

    public JButton getBotonCadastro() {
        return BotonCadastro;
    }

    public JButton getBotonContratos() {
        return BotonContratos;
    }

    public JButton getBotonEquipamento() {
        return BotonEquipamento;
    }

    public JButton getBotonFuncionaios() {
        return BotonFuncionaios;
    }

    public JButton getBotonRelatorios() {
        return BotonRelatorios;
    }

    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSair = new javax.swing.JButton();
        BotonEquipamento = new javax.swing.JButton();
        BotonContratos = new javax.swing.JButton();
        BotonRelatorios = new javax.swing.JButton();
        BotonFuncionaios = new javax.swing.JButton();
        BotonCadastro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/voltar.png"))); // NOI18N
        BotonSair.setBorderPainted(false);
        BotonSair.setContentAreaFilled(false);
        BotonSair.setDoubleBuffered(true);
        BotonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 70, 30));

        BotonEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/botaoEquipamento.png"))); // NOI18N
        BotonEquipamento.setBorderPainted(false);
        BotonEquipamento.setContentAreaFilled(false);
        BotonEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEquipamentoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEquipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 190, 180));

        BotonContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/botaoContrato.png"))); // NOI18N
        BotonContratos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BotonContratos.setContentAreaFilled(false);
        getContentPane().add(BotonContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 190, 180));

        BotonRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/botaoRelatorio.png"))); // NOI18N
        BotonRelatorios.setBorderPainted(false);
        BotonRelatorios.setContentAreaFilled(false);
        getContentPane().add(BotonRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 190, 180));

        BotonFuncionaios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/botaoFuncionario.png"))); // NOI18N
        BotonFuncionaios.setBorderPainted(false);
        BotonFuncionaios.setContentAreaFilled(false);
        getContentPane().add(BotonFuncionaios, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 190, 180));

        BotonCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/botaoChamado.png"))); // NOI18N
        BotonCadastro.setBorderPainted(false);
        BotonCadastro.setContentAreaFilled(false);
        getContentPane().add(BotonCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 190, 180));

        jPanel1.setBackground(java.awt.Color.white);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 2- admin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 7, 1000, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSairActionPerformed

    private void BotonEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEquipamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCadastro;
    private javax.swing.JButton BotonContratos;
    private javax.swing.JButton BotonEquipamento;
    private javax.swing.JButton BotonFuncionaios;
    private javax.swing.JButton BotonRelatorios;
    private javax.swing.JButton BotonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
