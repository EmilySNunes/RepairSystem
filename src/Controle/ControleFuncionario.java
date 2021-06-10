

package Controle;

import Visao.TelaAddFuncionario;
import Visao.TelaAtendente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;


public class ControleFuncionario  implements ActionListener{

    
    private final TelaAddFuncionario TAF;
    private final RegraFuncionario RF;
   
    public ControleFuncionario() {
        
         this.TAF = new TelaAddFuncionario(null, true);
         this.RF= new RegraFuncionario(TAF);
        
      
        addListerners();
        
        this.TAF.setVisible(true);

    }
    
    public void addListerners(){
    
        this.TAF.getBotaoExcluir().addActionListener(this);
        this.TAF.getBotaoSalvar().addActionListener(this);
        this.TAF.getBotonSair().addActionListener(this);
       
    
    }
    
     @Override
    public void actionPerformed(ActionEvent var) {
        
        
        if(var.getSource().equals(this.TAF.getBotaoExcluir())){
        
           this.RF.limpar();
           
        
        } else if(var.getSource().equals(this.TAF.getBotaoSalvar())){
            
              
                    
                    String Classificacao = null;
                    
                    if(this.TAF.getMarcaAdm().isSelected()){
                    
                        Classificacao = "Adm";
                    
                    }else if(this.TAF.getMarcaAtende().isSelected()){
                    
                        Classificacao = "Atendente";
                        
                    }else if(this.TAF.getMarcaSuper().isSelected()){
                        
                        Classificacao = "Supervisor";
                    
                    
                    }else if(this.TAF.getMarcaTecni().isSelected()){
                        
                      Classificacao = "Tecnico";
                    
                    
                    }else if(this.TAF.getMarcaVende().isSelected()){
                        
                        Classificacao = "Vendedor";
                    
                    
                    }
                    
                   
        
                     this.RF.adicionaFunc(Classificacao);
        
        }else if(var.getSource().equals(this.TAF.getBotonSair())){
        
            ControleLogin CL = new ControleLogin();
            
            TAF.dispose();
        
        }
         
        
          }

    
    
    
}
