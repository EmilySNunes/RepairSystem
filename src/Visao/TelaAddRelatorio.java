

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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Problema = new javax.swing.JTextField();
        empresasolicitante = new javax.swing.JTextField();
        Solucao = new javax.swing.JTextField();
        cpfvalido = new javax.swing.JFormattedTextField();
        nometecnico = new javax.swing.JTextField();
        Nderelatorio = new javax.swing.JTextField();
        Equipamentosreparados = new javax.swing.JTextField();
        Compoentestroca = new javax.swing.JTextField();
        BotaoAnexar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nº do Relatório:");

        BotonSair.setBackground(new java.awt.Color(255, 255, 255));
        BotonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/voltar.png"))); // NOI18N
        BotonSair.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CPF do Técnico:");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Equipamentos reparados:");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Problema identificado:");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nome do técnico:");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Empresa solicitante:");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Componentes trocados:");

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Solução adotada:");

        Problema.setBackground(new java.awt.Color(255, 255, 255));
        Problema.setForeground(new java.awt.Color(0, 0, 0));
        Problema.setToolTipText("");

        empresasolicitante.setBackground(new java.awt.Color(255, 255, 255));
        empresasolicitante.setForeground(new java.awt.Color(0, 0, 0));
        empresasolicitante.setToolTipText("");

        Solucao.setBackground(new java.awt.Color(255, 255, 255));
        Solucao.setForeground(new java.awt.Color(0, 0, 0));
        Solucao.setToolTipText("");

        cpfvalido.setBackground(new java.awt.Color(255, 255, 255));
        cpfvalido.setForeground(new java.awt.Color(0, 0, 0));
        try {
            cpfvalido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        nometecnico.setBackground(new java.awt.Color(255, 255, 255));
        nometecnico.setForeground(new java.awt.Color(0, 0, 0));
        nometecnico.setToolTipText("");

        Nderelatorio.setBackground(new java.awt.Color(255, 255, 255));
        Nderelatorio.setForeground(new java.awt.Color(0, 0, 0));
        Nderelatorio.setToolTipText("");

        Equipamentosreparados.setBackground(new java.awt.Color(255, 255, 255));
        Equipamentosreparados.setForeground(new java.awt.Color(0, 0, 0));
        Equipamentosreparados.setToolTipText("");

        Compoentestroca.setBackground(new java.awt.Color(255, 255, 255));
        Compoentestroca.setForeground(new java.awt.Color(0, 0, 0));
        Compoentestroca.setToolTipText("");

        BotaoAnexar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoAnexar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anexar30.png"))); // NOI18N
        BotaoAnexar.setBorder(null);

        BotaoExcluir.setBackground(new java.awt.Color(255, 255, 255));
        BotaoExcluir.setForeground(new java.awt.Color(0, 0, 0));
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removerUser30.png"))); // NOI18N
        BotaoExcluir.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonSair))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BotaoExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoAnexar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(Problema, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpfvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Equipamentosreparados, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nderelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empresasolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(nometecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(Solucao, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(Compoentestroca, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BotonSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresasolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nderelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nometecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Compoentestroca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equipamentosreparados, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Problema, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Solucao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BotaoAnexar))
                    .addComponent(BotaoExcluir))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JFormattedTextField cpfvalido;
    private javax.swing.JTextField empresasolicitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nometecnico;
    // End of variables declaration//GEN-END:variables
}
