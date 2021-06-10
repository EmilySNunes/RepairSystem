

package Controle;

import Visao.TelaAddRelatorio;
import Visao.TelaAtendente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class ControleRelatorio  implements ActionListener{

    
    private final TelaAddRelatorio TAR;
    private final RegraRelatorio RR;
   
    public ControleRelatorio() {
        
         this.TAR = new TelaAddRelatorio(null, true);
         this.RR = new RegraRelatorio(TAR);
        
      
        addListerners();
        
        this.TAR.setVisible(true);

    }
    
    public void addListerners(){
    
        this.TAR.getBotaoAnexar().addActionListener(this);
        this.TAR.getBotaoExcluir().addActionListener(this);
        this.TAR.getBotonSair().addActionListener(this);
        
    
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
        if(var.getSource().equals(this.TAR.getBotaoAnexar())){
        
           JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
        
        } else if(var.getSource().equals(this.TAR.getBotonSair())){
        
             ControleLogin CL = new ControleLogin();
            
            this.TAR.dispose();
        
        
        } else if(var.getSource().equals(this.TAR.getBotaoExcluir())){
        
             JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
        
        
        } 
         
        
          }

    
    
    
}
