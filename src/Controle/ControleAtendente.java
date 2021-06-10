

package Controle;

import Visao.TelaAtendente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControleAtendente  implements ActionListener{

    
    private final TelaAtendente TA;
    private final RegraAtendente RA;
   
    public ControleAtendente() {
        
         this.TA = new TelaAtendente(null, true);
         this.RA = new RegraAtendente(TA);
        
      
        addListerners();
        
        this.TA.setVisible(true);

    }
    
    public void addListerners(){
    
        this.TA.getBotaoSair().addActionListener(this);
        this.TA.getBotonChamado().addActionListener(this);
        this.TA.getBotonContratos().addActionListener(this);
        this.TA.getBotonEquipamento().addActionListener(this);
    
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
        if(var.getSource().equals(this.TA.getBotonChamado())){
        
           ControleChamado CC = new ControleChamado();
        
        } else if(var.getSource().equals(this.TA.getBotaoSair())){
        
            ControleLogin CL = new ControleLogin();
            
            this.TA.dispose();
        
        
        } else if(var.getSource().equals(this.TA.getBotonContratos())){
        
            ControleContrato CC = new ControleContrato();
        
        
        } else if(var.getSource().equals(this.TA.getBotonEquipamento())){
        
            ControleMostraEquipamento CE = new ControleMostraEquipamento();
        
        }
         
        
          }

    
    
    
}
