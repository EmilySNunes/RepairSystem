
package Visao;

import javax.swing.JButton;
import javax.swing.JLabel;


public class TelaTecnico extends javax.swing.JFrame {

   
    public TelaTecnico(java.awt.Frame parent, boolean modal) {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
        
    }

    public TelaTecnico(Object object, boolean b) {
      
        
    }

    public JButton getBotaoSair() {
        return BotaoSair;
    }

    public void setBotaoSair(JButton BotaoSair) {
        this.BotaoSair = BotaoSair;
    }

    public JButton getBotonChamado() {
        return BotonChamado;
    }

    public void setBotonChamado(JButton BotonChamado) {
        this.BotonChamado = BotonChamado;
    }

    public JButton getBotaoEquipamento() {
        return BotaoEquipamento;
    }

   

    public JButton getBotonRelatorios() {
        return BotonRelatorios;
    }

    public void setBotonRelatorios(JButton BotonRelatorios) {
        this.BotonRelatorios = BotonRelatorios;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BotaoSair = new javax.swing.JButton();
        BotonChamado = new javax.swing.JButton();
        BotaoEquipamento = new javax.swing.JButton();
        BotonRelatorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        BotaoSair.setBackground(new java.awt.Color(255, 255, 255));
        BotaoSair.setForeground(new java.awt.Color(0, 0, 0));
        BotaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Engrenagem20.png"))); // NOI18N
        BotaoSair.setText("Fazer Logout");
        BotaoSair.setBorder(null);

        BotonChamado.setBackground(new java.awt.Color(255, 255, 255));
        BotonChamado.setForeground(new java.awt.Color(0, 0, 0));
        BotonChamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chamado100.png"))); // NOI18N
        BotonChamado.setToolTipText("");
        BotonChamado.setAutoscrolls(true);
        BotonChamado.setBorder(null);

        BotaoEquipamento.setBackground(new java.awt.Color(255, 255, 255));
        BotaoEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        BotaoEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Equipamento100.png"))); // NOI18N
        BotaoEquipamento.setBorder(null);

        BotonRelatorios.setBackground(new java.awt.Color(255, 255, 255));
        BotonRelatorios.setForeground(new java.awt.Color(0, 0, 0));
        BotonRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Relatorio.png"))); // NOI18N
        BotonRelatorios.setBorder(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrador50.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tecnico");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo-1300.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BotaoSair)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BotonRelatorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonChamado)
                            .addComponent(BotaoEquipamento))
                        .addGap(262, 262, 262)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(380, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BotaoSair)
                        .addGap(18, 18, 18)
                        .addComponent(BotonRelatorios)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonChamado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoEquipamento))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BotaoEquipamento;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotonChamado;
    private javax.swing.JButton BotonRelatorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
