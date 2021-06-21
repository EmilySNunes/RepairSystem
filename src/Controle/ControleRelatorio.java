

package Controle;

import Visao.TelaAddRelatorio;
import Visao.TelaAtendente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
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
        
             String rece = null;
          
             try {
                 
                 rece = this.RR.procuraLogin();
                 
                 if(rece.equals("Admnistrador")){
       
          ControlePrincipal CP = new ControlePrincipal();

          this.TAR.dispose();
          
       }else if(rece.equals("Atendente")){
       
          ControleAtendente CA = new ControleAtendente();
          
            this.TAR.dispose();
       
       }else if(rece.equals("Supervisor")){
       
          ControleSupervisor CS = new ControleSupervisor();
       
          
            this.TAR.dispose();
            
       }else if(rece.equals("Tecnico")){
       
           ControleTecnico CT = new ControleTecnico();
       
             this.TAR.dispose();
             
       }else if(rece.equals("Vendedor")){
       
          ControleVendedor CV = new ControleVendedor();
       
            this.TAR.dispose();
            
       }
                 
             } catch (Exception ex) {
                 
               
                   JOptionPane.showMessageDialog(null,"ERRO","XXXX",ERROR_MESSAGE);
             }

            
            this.TAR.dispose();
        
        
        } else if(var.getSource().equals(this.TAR.getBotaoExcluir())){
        
             JOptionPane.showMessageDialog(null,"AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ",WARNING_MESSAGE);
        
        
        } 
         
        
          }

    
    
    
}
