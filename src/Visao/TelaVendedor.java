
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;


public class TelaVendedor extends javax.swing.JFrame {

    
    public TelaVendedor(java.awt.Frame parent, boolean modal) {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
    }

    public TelaVendedor(Object object, boolean b) {
       
        
    }

    public JButton getBotonContratos() {
        return BotonContratos;
    }

    public void setBotonContratos(JButton BotonContratos) {
        this.BotonContratos = BotonContratos;
    }

    public JButton getBotonEquipamento() {
        return BotonEquipamento;
    }

    public void setBotonEquipamento(JButton BotonEquipamento) {
        this.BotonEquipamento = BotonEquipamento;
    }

    public JButton getBotonSair() {
        return BotonSair;
    }

    public void setBotonSair(JButton BotonSair) {
        this.BotonSair = BotonSair;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonContratos = new javax.swing.JButton();
        BotonEquipamento = new javax.swing.JButton();
        BotonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/iconeContratos.png"))); // NOI18N
        BotonContratos.setBorderPainted(false);
        BotonContratos.setPreferredSize(new java.awt.Dimension(183, 159));
        BotonContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonContratosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 160, 180));

        BotonEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/equipamentos.png"))); // NOI18N
        BotonEquipamento.setBorderPainted(false);
        BotonEquipamento.setPreferredSize(new java.awt.Dimension(183, 159));
        getContentPane().add(BotonEquipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 180, 180));

        BotonSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/voltar.png"))); // NOI18N
        BotonSair.setBorderPainted(false);
        BotonSair.setDoubleBuffered(true);
        BotonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 50, 30));

        jPanel1.setBackground(java.awt.Color.white);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 2.1 - vendedor.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSairActionPerformed

    private void BotonContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonContratosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonContratosActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton BotonContratos;
    private javax.swing.JButton BotonEquipamento;
    private javax.swing.JButton BotonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
