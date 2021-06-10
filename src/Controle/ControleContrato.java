

package Controle;

import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class ControleContrato  implements ActionListener{

    
    private final TelaCadastraContrato TCC;
    private final RegraContrato RC;
   
    public ControleContrato() {
        
         this.TCC = new TelaCadastraContrato(null, true);
         this.RC = new RegraContrato(TCC);
        
      
        addListerners();
        
        this.TCC.setVisible(true);

    }
    
    public void addListerners(){
    
        this.TCC.getExcluir().addActionListener(this);
        this.TCC.getSalvar().addActionListener(this);
        this.TCC.getBotonSair().addActionListener(this);
       
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
         if(var.getSource().equals(this.TCC.getExcluir())){
        
        this.RC.limpa();
        
        }
         
         else if(var.getSource().equals(this.TCC.getSalvar())){
        
             try {
                 
                 this.RC.AdicionaContrato();
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null,"ERRO","XXXX",ERROR_MESSAGE);
             }
        
        }
         else if(var.getSource().equals(this.TCC.getBotonSair())){
        
             try {
                 
                ControleLogin CL = new ControleLogin();
                
                TCC.dispose();
                 
             } catch (Exception ex) {
                 
                 JOptionPane.showMessageDialog(null,"ERRO","XXXX",ERROR_MESSAGE);
             }
        
        }
        
        
          }

    
    
    
}
