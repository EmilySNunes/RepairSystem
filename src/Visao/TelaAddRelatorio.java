

package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaAddRelatorio extends javax.swing.JFrame {

    
    public TelaAddRelatorio(Object object, boolean b) {
       
        
        initComponents();
        
          this.setLocationRelativeTo(null);
          
          this.setResizable(false);
        
    }

    public JButton getBotaoAnexar() {
        return BotaoAnexar;
    }

    public JButton getBotaoExcluir() {
        return BotaoExcluir;
    }

    public JTextField getCompoentestroca() {
        return Compoentestroca;
    }

    public JTextField getEquipamentosreparados() {
        return Equipamentosreparados;
    }

    public JTextField getNderelatorio() {
        return Nderelatorio;
    }

    public JTextField getProblema() {
        return Problema;
    }

    public JTextField getSolucao() {
        return Solucao;
    }

    public JTextField getCpfvalido() {
        return cpfvalido;
    }

    public JTextField getEmpresasolicitante() {
        return empresasolicitante;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JTextField getNometecnico() {
        return nometecnico;
    }

    public JButton getBotonSair() {
        return BotonSair;
    }
    
    

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Equipamentosreparados = new javax.swing.JTextField();
        Problema = new javax.swing.JTextField();
        empresasolicitante = new javax.swing.JTextField();
        nometecnico = new javax.swing.JTextField();
        Compoentestroca = new javax.swing.JTextField();
        Solucao = new javax.swing.JTextField();
        Nderelatorio = new javax.swing.JTextField();
        cpfvalido = new javax.swing.JTextField();
        BotonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotaoAnexar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BotaoExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Equipamentosreparados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Equipamentosreparados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipamentosreparadosActionPerformed(evt);
            }
        });
        getContentPane().add(Equipamentosreparados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 400, 40));

        Problema.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Problema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProblemaActionPerformed(evt);
            }
        });
        getContentPane().add(Problema, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 400, 60));

        empresasolicitante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        empresasolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresasolicitanteActionPerformed(evt);
            }
        });
        getContentPane().add(empresasolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 250, 40));

        nometecnico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nometecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nometecnicoActionPerformed(evt);
            }
        });
        getContentPane().add(nometecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 250, 40));

        Compoentestroca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Compoentestroca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompoentestrocaActionPerformed(evt);
            }
        });
        getContentPane().add(Compoentestroca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 420, 40));

        Solucao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Solucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolucaoActionPerformed(evt);
            }
        });
        getContentPane().add(Solucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 420, 60));

        Nderelatorio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nderelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NderelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(Nderelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, 40));

        cpfvalido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cpfvalido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfvalidoActionPerformed(evt);
            }
        });
        getContentPane().add(cpfvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, 40));

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
        getContentPane().add(BotonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 60, 30));

        BotaoAnexar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoAnexar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/anexar.png"))); // NOI18N
        BotaoAnexar.setToolTipText("");
        BotaoAnexar.setBorderPainted(false);
        BotaoAnexar.setContentAreaFilled(false);
        BotaoAnexar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnexarActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoAnexar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 140, 80));

        BotaoExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/excluir.png"))); // NOI18N
        BotaoExcluir.setBorderPainted(false);
        BotaoExcluir.setContentAreaFilled(false);
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoExcluir);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 140, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 5.1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 7, 1000, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAnexarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnexarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoAnexarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void NderelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NderelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NderelatorioActionPerformed

    private void cpfvalidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfvalidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfvalidoActionPerformed

    private void EquipamentosreparadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipamentosreparadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EquipamentosreparadosActionPerformed

    private void ProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProblemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProblemaActionPerformed

    private void empresasolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresasolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresasolicitanteActionPerformed

    private void nometecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nometecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nometecnicoActionPerformed

    private void CompoentestrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompoentestrocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompoentestrocaActionPerformed

    private void SolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SolucaoActionPerformed

    private void BotonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BotaoAnexar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotonSair;
    private javax.swing.JTextField Compoentestroca;
    private javax.swing.JTextField Equipamentosreparados;
    private javax.swing.JTextField Nderelatorio;
    private javax.swing.JTextField Problema;
    private javax.swing.JTextField Solucao;
    private javax.swing.JTextField cpfvalido;
    private javax.swing.JTextField empresasolicitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nometecnico;
    // End of variables declaration//GEN-END:variables
}
