
package Controle;

import Visao.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class ControleLogin implements ActionListener{
    
    private final TelaLogin TL;
    private final RegraLogin RL;
    
   
    
    public ControleLogin() {
        
        this.TL = new TelaLogin(null, true);
        this.RL = new RegraLogin(TL);
        
      
        addListerners();
        
        this.TL.setVisible(true);

        
    }
    
    public void addListerners(){
    
      
        this.TL.getBotonEnviar().addActionListener(this);
        this.TL.getBotonEsqueceuSenha().addActionListener(this);
   
    
    }
    
    

    @Override
    public void actionPerformed(ActionEvent var) {
       
        
        
        if(var.getSource().equals(this.TL.getBotonEnviar())){
        
            try {
               
                
                this.RL.acesso();
                
                this.TL.dispose();
                            
                
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null,"ERRO","ALERTA",ERROR_MESSAGE);
                
            }
        
        }
        
        
        if(var.getSource().equals(this.TL.getBotonEsqueceuSenha())){
        
               try {
                
              ControleRecuperaSenha CRS = new ControleRecuperaSenha();
              
              this.TL.dispose();
                
                
            } catch (Exception e) {
                
                 JOptionPane.showMessageDialog(null,"ERRO","XXXX",ERROR_MESSAGE);
                
            }
        
        
        }
        
    
        
    }
    
    
    
}
