

package Controle;

import Visao.TelaAtendente;
import Visao.TelaRelatorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
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
        
              String rece = null;
          
             try {
                 
                 rece = this.RR.procuraLogin();
                 
                 if(rece.equals("Admnistrador")){
       
          ControlePrincipal CP = new ControlePrincipal();
       
       }else if(rece.equals("Atendente")){
       
          ControleAtendente CA = new ControleAtendente();
       
       }else if(rece.equals("Supervisor")){
       
          ControleSupervisor CS = new ControleSupervisor();
       
       }else if(rece.equals("Tecnico")){
       
           ControleTecnico CT = new ControleTecnico();
       
       }else if(rece.equals("Vendedor")){
       
          ControleVendedor CV = new ControleVendedor();
       
       }
                 
             } catch (Exception ex) {
                 
               
                   JOptionPane.showMessageDialog(null,"ERRO","XXXX",ERROR_MESSAGE);
             }
            

             TR.dispose();
        
        }
         
        
          }

    
    
    
}
