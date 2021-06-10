
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;


public class TelaSupervisor extends javax.swing.JFrame {

   
    public TelaSupervisor(java.awt.Frame parent, boolean modal) {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
    }

    public TelaSupervisor(Object object, boolean b) {
      
        
        
    }

    public JButton getBotonChamado() {
        return BotonChamado;
    }

    public void setBotonChamado(JButton BotonChamado) {
        this.BotonChamado = BotonChamado;
    }

    public JButton getBotonSair() {
        return BotonSair;
    }

    public void setBotonSair(JButton BotonSair) {
        this.BotonSair = BotonSair;
    }

    public JButton getBotonTecnicos() {
        return BotonTecnicos;
    }

    public void setBotonTecnicos(JButton BotonTecnicos) {
        this.BotonTecnicos = BotonTecnicos;
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

        BotonChamado = new javax.swing.JButton();
        BotonTecnicos = new javax.swing.JButton();
        BotonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonChamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/botaoChamado.png"))); // NOI18N
        BotonChamado.setBorderPainted(false);
        BotonChamado.setPreferredSize(new java.awt.Dimension(183, 159));
        getContentPane().add(BotonChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 190, 180));

        BotonTecnicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/iconeTecn.png"))); // NOI18N
        BotonTecnicos.setBorderPainted(false);
        BotonTecnicos.setPreferredSize(new java.awt.Dimension(183, 159));
        getContentPane().add(BotonTecnicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 190, 180));

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

        jPanel1.setBackground(java.awt.Color.white);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 2.4 - supervisor.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BotonChamado;
    private javax.swing.JButton BotonSair;
    private javax.swing.JButton BotonTecnicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
