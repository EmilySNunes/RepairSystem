

package Controle;

import Visao.TelaAtendente;
import Visao.TelaRelatorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;


public class ControleMostraRelatorio  implements ActionListener{

    
    private final TelaRelatorio TR;
    private final RegraMostraRelatorio RR;
   
    public ControleMostraRelatorio() {
        
         this.TR = new TelaRelatorio(null, true);
         this.RR = new RegraMostraRelatorio(TR);
        
      
        addListerners();
        
        this.TR.setVisible(true);

    }
    
    public void addListerners(){
    
        this.TR.getBotonAbrir().addActionListener(this);
        this.TR.getBotonDetalhes().addActionListener(this);
        this.TR.getBotonEditar().addActionListener(this);
        this.TR.getBotonPesquisar().addActionListener(this);
        this.TR.getBotonSair().addActionListener(this);
    
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
        if(var.getSource().equals(this.TR.getBotonAbrir())){
        
          JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!","INFORMAÇÃO:",INFORMATION_MESSAGE);
        
        } else if(var.getSource().equals(this.TR.getBotonDetalhes())){
        
           JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!","INFORMAÇÃO:",INFORMATION_MESSAGE);
        
        }
         else if(var.getSource().equals(this.TR.getBotonEditar())){
        
           JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!","INFORMAÇÃO:",INFORMATION_MESSAGE);
        
        }
         else if(var.getSource().equals(this.TR.getBotonPesquisar())){
        
             JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!","INFORMAÇÃO:",INFORMATION_MESSAGE);
           
        
        }
         else if(var.getSource().equals(this.TR.getBotonSair())){
        
             ControleLogin CL = new ControleLogin();
             
             TR.dispose();
        
        }
         
        
          }

    
    
    
}
