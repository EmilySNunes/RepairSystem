
package Controle;


import Visao.TelaCadastraContrato;
import Visao.TelaContrato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class ControleMostraContrato  implements ActionListener{
   
    
    private final TelaContrato TC;
    private final RegraMostraContrato RMC;

    public ControleMostraContrato() {
        
         
         this.TC = new TelaContrato(null, true);
         this.RMC = new RegraMostraContrato(TC);
        
      
        addListerners();
        
        this.TC.setVisible(true);
        
    }
       
    
    public void addListerners(){
    
        this.TC.getBotaoDetalhes().addActionListener(this);
        this.TC.getBotaonovocontrato().addActionListener(this); 
        this.TC.getBotaopesquisa().addActionListener(this); 
        this.TC.getBotonApagar().addActionListener(this); 
        this.TC.getBotonSair().addActionListener(this); 
       
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
         if(var.getSource().equals(this.TC.getBotaoDetalhes())){
        
       JOptionPane.showMessageDialog(null,"NÃO AÇÕES AQUI!","INFORMAÇÃO",WARNING_MESSAGE);
        
        }else if(var.getSource().equals(this.TC.getBotaonovocontrato())){
                 
            
                  ControleContrato CC = new ControleContrato(); 
                  
                              
        }else if(var.getSource().equals(this.TC.getBotaopesquisa())){
            
        
             JOptionPane.showMessageDialog(null,"NÃO AÇÕES AQUI!","INFORMAÇÃO",WARNING_MESSAGE);
             
            
        }else if(var.getSource().equals(this.TC.getBotonApagar())){
            
        
             JOptionPane.showMessageDialog(null,"NÃO AÇÕES AQUI!","INFORMAÇÃO",WARNING_MESSAGE);
             
            
        
        }else if(var.getSource().equals(this.TC.getBotonSair())){
            
        
            ControleLogin CL = new ControleLogin();
            
            TC.dispose();
             
            
        }
        
        
          }

    
    
    
}

    

