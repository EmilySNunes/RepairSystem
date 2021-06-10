

package Controle;

import Visao.TelaAtendente;
import Visao.TelaEquipamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;


public class ControleMostraEquipamento  implements ActionListener{

    
    private final TelaEquipamento TE;
    private final RegraMostraEquipamento RME;
   
    public ControleMostraEquipamento() {
        
         this.TE = new TelaEquipamento(null, true);
         this.RME = new RegraMostraEquipamento(TE);
        
      
        addListerners();
        
        this.TE.setVisible(true);

    }
    
    public void addListerners(){
    
        this.TE.getBotonAbrir().addActionListener(this);
        this.TE.getBotonDetalhes().addActionListener(this);
        this.TE.getBotonEditar().addActionListener(this);
        this.TE.getBotonPesquisar().addActionListener(this);
        this.TE.getBotonSair().addActionListener(this);
    
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
        if(var.getSource().equals(this.TE.getBotonAbrir())){
        
        JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI","INFORMAÇÃO:",INFORMATION_MESSAGE);
        
        } else if(var.getSource().equals(this.TE.getBotonPesquisar())){
        
        JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI","INFORMAÇÃO:",INFORMATION_MESSAGE);
            
        
        } else if(var.getSource().equals(this.TE.getBotonEditar())){
        
        JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI","INFORMAÇÃO:",INFORMATION_MESSAGE);
            
        
        } else if(var.getSource().equals(this.TE.getBotonPesquisar())){
        
        JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI","INFORMAÇÃO:",INFORMATION_MESSAGE);
            
        }
         else if(var.getSource().equals(this.TE.getBotonSair())){
        
              ControleLogin CL = new ControleLogin();
               
               TE.dispose();
            
        }
         
        
          }

    
    
    
}
