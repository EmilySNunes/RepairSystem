
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class TelaContrato extends javax.swing.JFrame {

    
    public TelaContrato(Object object, boolean b) {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
        
    }

    public JButton getBotaoDetalhes() {
        return BotaoDetalhes;
    }

    public JButton getBotaonovocontrato() {
        return Botaonovocontrato;
    }

    public JButton getBotaopesquisa() {
        return Botaopesquisa;
    }

    public JButton getBotonApagar() {
        return BotonApagar;
    }

    public JTable getTabelaContrato() {
        return TabelaContrato;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JButton getBotonSair() {
        return BotonSair;
    }
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisa = new javax.swing.JTextField();
        Botaopesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaContrato = new javax.swing.JTable();
        BotonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotaoDetalhes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Botaonovocontrato = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BotonApagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 220, 40));

        Botaopesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/iconePesquisar.png"))); // NOI18N
        Botaopesquisa.setBorderPainted(false);
        Botaopesquisa.setContentAreaFilled(false);
        Botaopesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaopesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(Botaopesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, -1, 40));

        TabelaContrato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TabelaContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nº de Sequencia", "Cliente", "Contrato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaContrato);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 770, 210));

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
        getContentPane().add(BotonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, 30));

        BotaoDetalhes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/detalhes.png"))); // NOI18N
        BotaoDetalhes.setBorderPainted(false);
        BotaoDetalhes.setContentAreaFilled(false);
        BotaoDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDetalhesActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoDetalhes);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 170, 80));

        Botaonovocontrato.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Botaonovocontrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/adicionar.png"))); // NOI18N
        Botaonovocontrato.setBorderPainted(false);
        Botaonovocontrato.setContentAreaFilled(false);
        Botaonovocontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaonovocontratoActionPerformed(evt);
            }
        });
        jPanel2.add(Botaonovocontrato);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 130, 70));

        BotonApagar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/excluir.png"))); // NOI18N
        BotonApagar.setBorderPainted(false);
        BotonApagar.setContentAreaFilled(false);
        BotonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonApagarActionPerformed(evt);
            }
        });
        jPanel3.add(BotonApagar);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 190, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 4 Contrato.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 990, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void BotaopesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaopesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaopesquisaActionPerformed

    private void BotaoDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDetalhesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoDetalhesActionPerformed

    private void BotonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonApagarActionPerformed

    private void BotaonovocontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaonovocontratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaonovocontratoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BotaoDetalhes;
    private javax.swing.JButton Botaonovocontrato;
    private javax.swing.JButton Botaopesquisa;
    private javax.swing.JButton BotonApagar;
    private javax.swing.JButton BotonSair;
    private javax.swing.JTable TabelaContrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisa;
    // End of variables declaration//GEN-END:variables
}
