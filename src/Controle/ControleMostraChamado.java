

package Controle;

import Visao.TelaAtendente;
import Visao.TelaChamado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class ControleMostraChamado  implements ActionListener{

    
    private final TelaChamado TC;
    private final RegraMostraChamado RMC;
   
    public ControleMostraChamado() {
        
         this.TC = new TelaChamado(null, true);
         this.RMC = new RegraMostraChamado(TC);
        
      
        addListerners();
        
        this.TC.setVisible(true);

    }
    
    public void addListerners(){
    
        this.TC.getBotonAbrir().addActionListener(this);
        this.TC.getBotonDetalhes().addActionListener(this);
        this.TC.getBotonEditar().addActionListener(this);
        this.TC.getBotonPesquisar().addActionListener(this);
        this.TC.getBotonSair().addActionListener(this);
       
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
        if(var.getSource().equals(this.TC.getBotonAbrir())){
        
          JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
        
        } else if(var.getSource().equals(this.TC.getBotonDetalhes())){
        
           JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
        
        
        } else if(var.getSource().equals(this.TC.getBotonEditar())){
        
          JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
        
        
        } else if(var.getSource().equals(this.TC.getBotonPesquisar())){
        
           JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
        
        
        } else if(var.getSource().equals(this.TC.getBotonSair())){
        
          ControleLogin CL = new ControleLogin();
          
          TC.dispose();
        
        }
         
        
          }

    
    
    
}
