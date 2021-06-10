
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class TelaRelatorio extends javax.swing.JFrame {

       
        
        
   
    public TelaRelatorio(Object object, boolean b) {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);

        
    }

    public JButton getBotonAbrir() {
        return BotonAbrir;
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

    public JTable getTabelarelatorio() {
        return Tabelarelatorio;
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
        Tabelarelatorio = new javax.swing.JTable();
        pesquisar = new javax.swing.JTextField();
        BotonPesquisar = new javax.swing.JButton();
        BotonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotonAbrir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BotonEditar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BotonDetalhes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabelarelatorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tabelarelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nº do Série", "Equipamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabelarelatorio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 760, 200));

        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 220, 40));

        BotonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/iconePesquisar.png"))); // NOI18N
        BotonPesquisar.setBorderPainted(false);
        BotonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 80, 40));

        BotonSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/voltar.png"))); // NOI18N
        BotonSair.setBorderPainted(false);
        BotonSair.setDoubleBuffered(true);
        BotonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 60, 30));

        BotonAbrir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/adicionar.png"))); // NOI18N
        BotonAbrir.setBorderPainted(false);
        BotonAbrir.setContentAreaFilled(false);
        BotonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbrirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAbrir);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 170, 70));

        BotonEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/editar.png"))); // NOI18N
        BotonEditar.setToolTipText("");
        BotonEditar.setBorderPainted(false);
        BotonEditar.setContentAreaFilled(false);
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });
        jPanel2.add(BotonEditar);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 160, 70));

        BotonDetalhes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/detalhes.png"))); // NOI18N
        BotonDetalhes.setBorderPainted(false);
        BotonDetalhes.setContentAreaFilled(false);
        BotonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetalhesActionPerformed(evt);
            }
        });
        jPanel3.add(BotonDetalhes);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, 120, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 5 Relatorio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 7, 1000, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAbrirActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    private void BotonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPesquisarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEditarActionPerformed

    private void BotonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetalhesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetalhesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BotonAbrir;
    private javax.swing.JButton BotonDetalhes;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonPesquisar;
    private javax.swing.JButton BotonSair;
    private javax.swing.JTable Tabelarelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisar;
    // End of variables declaration//GEN-END:variables
}
