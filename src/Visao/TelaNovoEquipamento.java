
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaNovoEquipamento extends javax.swing.JFrame {

  
    public TelaNovoEquipamento(java.awt.Frame parent, boolean modal) {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
        
    }

    public JButton getBotaoExcluir() {
        return BotaoExcluir;
    }

    public JButton getBotaoVoltar() {
        return BotaoVoltar;
    }

    public JButton getBotonSair() {
        return BotonSair;
    }

    public JTextField getNdemanutencao() {
        return Ndemanutencao;
    }

    public JTextField getNdeserie() {
        return Ndeserie;
    }

    public JTextField getDatafabricacao() {
        return datafabricacao;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JTextField getNcontrato() {
        return ncontrato;
    }

    public JTextField getNomeequipamento() {
        return nomeequipamento;
    }

    public JTextField getParcelasdepagamento() {
        return parcelasdepagamento;
    }

    public JTextField getTipodeequipamento() {
        return tipodeequipamento;
    }

    public JTextField getValorassociado() {
        return valorassociado;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ndeserie = new javax.swing.JTextField();
        tipodeequipamento = new javax.swing.JTextField();
        valorassociado = new javax.swing.JTextField();
        nomeequipamento = new javax.swing.JTextField();
        ncontrato = new javax.swing.JTextField();
        datafabricacao = new javax.swing.JTextField();
        parcelasdepagamento = new javax.swing.JTextField();
        Ndemanutencao = new javax.swing.JTextField();
        BotonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotaoExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BotaoVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ndeserie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Ndeserie.setText("222222222222");
        Ndeserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NdeserieActionPerformed(evt);
            }
        });
        getContentPane().add(Ndeserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 250, 40));

        tipodeequipamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tipodeequipamento.setText("Cirúrgicos");
        tipodeequipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodeequipamentoActionPerformed(evt);
            }
        });
        getContentPane().add(tipodeequipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 220, 40));

        valorassociado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        valorassociado.setText("2000");
        valorassociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorassociadoActionPerformed(evt);
            }
        });
        getContentPane().add(valorassociado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 250, 40));

        nomeequipamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nomeequipamento.setText("Bistúri");
        nomeequipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeequipamentoActionPerformed(evt);
            }
        });
        getContentPane().add(nomeequipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 250, 40));

        ncontrato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ncontrato.setText("12");
        ncontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ncontratoActionPerformed(evt);
            }
        });
        getContentPane().add(ncontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 300, 40));

        datafabricacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        datafabricacao.setText("01032015");
        datafabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datafabricacaoActionPerformed(evt);
            }
        });
        getContentPane().add(datafabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 260, 40));

        parcelasdepagamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        parcelasdepagamento.setText("10");
        parcelasdepagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcelasdepagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(parcelasdepagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 230, 40));

        Ndemanutencao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Ndemanutencao.setText("23");
        Ndemanutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NdemanutencaoActionPerformed(evt);
            }
        });
        getContentPane().add(Ndemanutencao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, 40));

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
        getContentPane().add(BotonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 60, 30));

        BotaoExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/excluir.png"))); // NOI18N
        BotaoExcluir.setBorderPainted(false);
        BotaoExcluir.setContentAreaFilled(false);
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoExcluir);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 140, 70));

        BotaoVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/salvar.png"))); // NOI18N
        BotaoVoltar.setBorderPainted(false);
        BotaoVoltar.setContentAreaFilled(false);
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoVoltar);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 140, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 7.1 Novo equipamento.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NdeserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NdeserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NdeserieActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void tipodeequipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodeequipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipodeequipamentoActionPerformed

    private void valorassociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorassociadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorassociadoActionPerformed

    private void nomeequipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeequipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeequipamentoActionPerformed

    private void ncontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ncontratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ncontratoActionPerformed

    private void datafabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datafabricacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datafabricacaoActionPerformed

    private void parcelasdepagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcelasdepagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parcelasdepagamentoActionPerformed

    private void NdemanutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NdemanutencaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NdemanutencaoActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovoEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JButton BotonSair;
    private javax.swing.JTextField Ndemanutencao;
    private javax.swing.JTextField Ndeserie;
    private javax.swing.JTextField datafabricacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ncontrato;
    private javax.swing.JTextField nomeequipamento;
    private javax.swing.JTextField parcelasdepagamento;
    private javax.swing.JTextField tipodeequipamento;
    private javax.swing.JTextField valorassociado;
    // End of variables declaration//GEN-END:variables
}
