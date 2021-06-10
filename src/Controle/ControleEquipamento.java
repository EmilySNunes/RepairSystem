
package Controle;


import Visao.TelaNovoEquipamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class ControleEquipamento implements ActionListener{
    
     private final TelaNovoEquipamento TNE;
    private final RegraEquipamento RE;

    public ControleEquipamento() {
      
          this.TNE = new TelaNovoEquipamento(null, true);
         this.RE = new RegraEquipamento(TNE);
        
      
        addListerners();
        
        this.TNE.setVisible(true);
        
        
    }
    

    
    public void addListerners(){
    
        this.TNE.getBotaoExcluir().addActionListener(this);
        this.TNE.getBotaoVoltar().addActionListener(this);
        this.TNE.getBotonSair().addActionListener(this);
       
       
       
    }
    
    

    @Override
    public void actionPerformed(ActionEvent var) {
      
        if(var.getSource().equals(this.TNE.getBotaoExcluir())){
        
         JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
         
        }
         
         else if(var.getSource().equals(this.TNE.getBotaoVoltar())){
        
             try {
                 
                 JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
                 
             } catch (Exception ex) {
                 
                 JOptionPane.showMessageDialog(null,"ERRO","XXXX",ERROR_MESSAGE);
             }
        
        }
         else if(var.getSource().equals(this.TNE.getBotonSair())){
        
             try {
                 
                      ControleLogin CL = new ControleLogin();
                      
                      TNE.dispose();
                 
             } catch (Exception ex) {
                 
                 JOptionPane.showMessageDialog(null,"ERRO","XXXX",ERROR_MESSAGE);
             }
        
        }
        
        
    }
    
    
    
}
