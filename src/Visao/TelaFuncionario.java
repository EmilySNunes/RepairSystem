
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class TelaFuncionario extends javax.swing.JFrame {

    
    public TelaFuncionario(Object object, boolean b) {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
        
    }

 

  

    public JButton getBotonAdicionaFuncionario() {
        return BotonAdicionaFuncionario;
    }

    public JButton getBotonDetalhes() {
        return BotonDetalhes;
    }

    public JButton getBotonEditar() {
        return BotonEditar;
    }

    public JButton getBotonPesquisar() {
        return BotonPesquisar;
    }

    public JTable getTabelaFuncionario() {
        return TabelaFuncionario;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTextField getPesquisar() {
        return pesquisar;
    }

    public JButton getBotonSair() {
        return BotonSair;
    }

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFuncionario = new javax.swing.JTable();
        pesquisar = new javax.swing.JTextField();
        BotonPesquisar = new javax.swing.JButton();
        BotonDetalhes = new javax.swing.JButton();
        BotonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotonAdicionaFuncionario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BotonEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
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
                "CPF", "Função", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(TabelaFuncionario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 760, 200));
        getContentPane().add(pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 230, 30));

        BotonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/iconePesquisar.png"))); // NOI18N
        BotonPesquisar.setBorderPainted(false);
        BotonPesquisar.setContentAreaFilled(false);
        BotonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 134, 80, -1));

        BotonDetalhes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonDetalhes.setText("Detalhes");
        BotonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetalhesActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetalhes, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 100, 50));

        BotonSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/botaoFechar.png"))); // NOI18N
        BotonSair.setBorderPainted(false);
        BotonSair.setContentAreaFilled(false);
        BotonSair.setDoubleBuffered(true);
        BotonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, 30));

        BotonAdicionaFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonAdicionaFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/adicionar.png"))); // NOI18N
        BotonAdicionaFuncionario.setBorderPainted(false);
        BotonAdicionaFuncionario.setContentAreaFilled(false);
        BotonAdicionaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdicionaFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAdicionaFuncionario);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 130, 70));

        BotonEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/editar.png"))); // NOI18N
        BotonEditar.setBorderPainted(false);
        BotonEditar.setContentAreaFilled(false);
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });
        jPanel2.add(BotonEditar);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 130, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 6.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAdicionaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdicionaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAdicionaFuncionarioActionPerformed

    private void BotonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetalhesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetalhesActionPerformed

    private void BotonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPesquisarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BotonAdicionaFuncionario;
    private javax.swing.JButton BotonDetalhes;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonPesquisar;
    private javax.swing.JButton BotonSair;
    private javax.swing.JTable TabelaFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisar;
    // End of variables declaration//GEN-END:variables
}
