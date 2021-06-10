

package Controle;

import Visao.TelaAddFuncionario;
import Visao.TelaAtendente;
import Visao.TelaFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class ControleMostraFuncionario  implements ActionListener{

    
    private final TelaFuncionario TF;
    private final RegraMostraFuncionario RMF;
   
    public ControleMostraFuncionario() {
        
         this.TF = new TelaFuncionario(null, true);
         this.RMF= new RegraMostraFuncionario(TF);
        
      
        addListerners();
        
        this.TF.setVisible(true);

    }
    
    public void addListerners(){
    
        this.TF.getBotonAdicionaFuncionario().addActionListener(this);
        this.TF.getBotonDetalhes().addActionListener(this);
        this.TF.getBotonEditar().addActionListener(this);
        this.TF.getBotonPesquisar().addActionListener(this);
        this.TF.getBotonSair().addActionListener(this);
        
       
    
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
        if(var.getSource().equals(this.TF.getBotonAdicionaFuncionario())){
        
           ControleFuncionario CF = new ControleFuncionario();  
           
        
        } else if(var.getSource().equals(this.TF.getBotonDetalhes())){
            
            JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
          
        
        }else if(var.getSource().equals(this.TF.getBotonEditar())){
        
           
        JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
        
        }else if(var.getSource().equals(this.TF.getBotonPesquisar())){
        
           JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
        
        
        }else if(var.getSource().equals(this.TF.getBotonSair())){
        
           ControleLogin CL = new ControleLogin();
           
           TF.dispose();
        
        }
         
        
          }

    
    
    
}
