

package Controle;

import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import Visao.TelaCadastroChamado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class ControleChamado  implements ActionListener{

    
    private final TelaCadastroChamado TCC;
    private final RegraChamado RC;
   
    public ControleChamado() {
        
         this.TCC = new TelaCadastroChamado(null, true);
         this.RC = new RegraChamado(TCC);
        
      
        addListerners();
        
        this.TCC.setVisible(true);

    }
    
    public void addListerners(){
    
        this.TCC.getBotonEncaminhar().addActionListener(this);
        this.TCC.getBotonVerificar().addActionListener(this);
        this.TCC.getBotonSair().addActionListener(this);
       
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
         if(var.getSource().equals(this.TCC.getBotonSair())){
          
             ControleLogin CL = new ControleLogin();
             
             TCC.dispose();
        
        }
         
         else if(var.getSource().equals(this.TCC.getBotonEncaminhar())){
        
             try {
                 
                 this.RC.AdicionaChamado();
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null,"ERRO","XXXX",ERROR_MESSAGE);
             }
        
        }
         else if(var.getSource().equals(this.TCC.getBotonVerificar())){
        
             try {
                 
                  ControleMostraChamado CMC = new ControleMostraChamado();
                 
             } catch (Exception ex) {
                 
                  JOptionPane.showMessageDialog(null,"ERRO","XXXX",ERROR_MESSAGE);
                 
             }
             
        
        }
        
        
          }

    
    
    
}
