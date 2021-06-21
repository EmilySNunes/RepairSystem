
package Controle;

import Modelo.Contrato;
import Modelo.ContratoDao;
import Modelo.LoginDao;
import Visao.TelaContrato;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegraMostraContrato {
    
     private final TelaContrato TC;
     private ContratoDao CD; 
    

    public RegraMostraContrato(TelaContrato TC1) {
        
        this.TC = TC1;
        this.CD = new ContratoDao();
        
    }

   public String procuraLogin() throws SQLException{
         
         String passa = null;
         
           LoginDao LD = new LoginDao();
         
          passa = LD.procuraLogin();
           
           
           return passa;
         
     }
   
   public void listar() {
        listaDados(CD.mostraContrato());
    }
   
    
    
   
    private void listaDados(ArrayList<Contrato> listaPessoas) {     
        TC.limpaTabela();
        for(int i=0;i<listaPessoas.size();i++){
            TC.adicionaItem
                           (listaPessoas.get(i).getnSequencia(),
                           listaPessoas.get(i).getNomeEmpresa(),
                           listaPessoas.get(i).getValorassociado());
              
        }      
     
    }
    
      public void pesquisar(){
          
         
            
           this.listaDados(CD.pesquisar(Integer.parseInt(TC.getPesquisa().getText())));
           
           
           
        }
    
  
    
    
}
