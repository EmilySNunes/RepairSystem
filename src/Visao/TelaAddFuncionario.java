
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class TelaAddFuncionario extends javax.swing.JFrame {

   
    public TelaAddFuncionario(Object object, boolean b) {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
    }

    public JButton getBotaoExcluir() {
        return BotaoExcluir;
    }

    public JButton getBotaoSalvar() {
        return BotaoSalvar;
    }

    public JTextField getCpf() {
        return cpf;
    }

    public JTextField getEmail() {
        return email;
    }

    public JTextField getEndereco() {
        return endereco;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JRadioButton getMarcaAdm() {
        return marcaAdm;
    }

    public JRadioButton getMarcaAtende() {
        return marcaAtende;
    }

    public JRadioButton getMarcaSuper() {
        return marcaSuper;
    }

    public JRadioButton getMarcaTecni() {
        return marcaTecni;
    }

    public JRadioButton getMarcaVende() {
        return marcaVende;
    }

    

    public JTextField getHorasdetrabalho() {
        return horasdetrabalho;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JTextField getNome() {
        return nome;
    }

    public JTextField getTelefone() {
        return telefone;
    }

    public JButton getBotonSair() {
        return BotonSair;
    }

    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cpf = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        horasdetrabalho = new javax.swing.JTextField();
        marcaAdm = new javax.swing.JRadioButton();
        marcaAtende = new javax.swing.JRadioButton();
        marcaSuper = new javax.swing.JRadioButton();
        marcaVende = new javax.swing.JRadioButton();
        marcaTecni = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        BotonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotaoExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BotaoSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 490, 30));

        endereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 470, 30));

        email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 490, 30));

        telefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 470, 30));

        nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 490, 30));

        horasdetrabalho.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(horasdetrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 390, 30));

        marcaAdm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        marcaAdm.setText("Administrador");
        marcaAdm.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                marcaAdmComponentRemoved(evt);
            }
        });
        marcaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaAdmActionPerformed(evt);
            }
        });
        getContentPane().add(marcaAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 200, -1));

        marcaAtende.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        marcaAtende.setText("Atendente");
        marcaAtende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaAtendeActionPerformed(evt);
            }
        });
        getContentPane().add(marcaAtende, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 200, 30));

        marcaSuper.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        marcaSuper.setText("Supervisor");
        marcaSuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaSuperActionPerformed(evt);
            }
        });
        getContentPane().add(marcaSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 200, -1));

        marcaVende.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        marcaVende.setText("Vendedor");
        marcaVende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaVendeActionPerformed(evt);
            }
        });
        getContentPane().add(marcaVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 200, -1));

        marcaTecni.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        marcaTecni.setText("Técnico");
        marcaTecni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTecniActionPerformed(evt);
            }
        });
        getContentPane().add(marcaTecni, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 200, -1));

        jLabel2.setBackground(java.awt.Color.lightGray);
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 200, 110));

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
        getContentPane().add(BotonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 50, 30));

        BotaoExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/excluir.png"))); // NOI18N
        BotaoExcluir.setBorderPainted(false);
        BotaoExcluir.setContentAreaFilled(false);
        BotaoExcluir.setDefaultCapable(false);
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoExcluir);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 120, 90));

        BotaoSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/salvar.png"))); // NOI18N
        BotaoSalvar.setBorderPainted(false);
        BotaoSalvar.setContentAreaFilled(false);
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoSalvar);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 120, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela 6.1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void marcaAdmComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_marcaAdmComponentRemoved

    }//GEN-LAST:event_marcaAdmComponentRemoved

    private void marcaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaAdmActionPerformed

        marcaAtende.setSelected(false);
        marcaSuper.setSelected(false);
        marcaTecni.setSelected(false);
        marcaVende.setSelected(false);

    }//GEN-LAST:event_marcaAdmActionPerformed

    private void marcaAtendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaAtendeActionPerformed

        marcaAdm.setSelected(false);
        marcaSuper.setSelected(false);
        marcaTecni.setSelected(false);
        marcaVende.setSelected(false);

    }//GEN-LAST:event_marcaAtendeActionPerformed

    private void marcaSuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaSuperActionPerformed

        marcaAdm.setSelected(false);
        marcaAtende.setSelected(false);
        marcaTecni.setSelected(false);
        marcaVende.setSelected(false);

    }//GEN-LAST:event_marcaSuperActionPerformed

    private void marcaVendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaVendeActionPerformed

        marcaAdm.setSelected(false);
        marcaAtende.setSelected(false);
        marcaSuper.setSelected(false);
        marcaTecni.setSelected(false);

    }//GEN-LAST:event_marcaVendeActionPerformed

    private void marcaTecniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTecniActionPerformed

        marcaAdm.setSelected(false);
        marcaAtende.setSelected(false);
        marcaSuper.setSelected(false);
        marcaVende.setSelected(false);

    }//GEN-LAST:event_marcaTecniActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JButton BotonSair;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField horasdetrabalho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton marcaAdm;
    private javax.swing.JRadioButton marcaAtende;
    private javax.swing.JRadioButton marcaSuper;
    private javax.swing.JRadioButton marcaTecni;
    private javax.swing.JRadioButton marcaVende;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
