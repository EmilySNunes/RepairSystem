

package Controle;

import Modelo.Equipamento;
import Modelo.EquipamentoDao;
import Modelo.LoginDao;
import Visao.TelaAddFuncionario;
import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import Visao.TelaEquipamento;
import java.sql.SQLException;
import java.util.ArrayList;


public class RegraMostraEquipamento {

     
     private final TelaEquipamento TE;
     private EquipamentoDao ED;
   
      
     
    RegraMostraEquipamento(TelaEquipamento TE1) {
     
           this.TE = TE1;
           this.ED = new EquipamentoDao();
        
    }

     public String procuraLogin() throws SQLException{
         
         String passa = null;
         
           LoginDao LD = new LoginDao();
         
          passa = LD.procuraLogin();
           
           
           return passa;
         
     }
     
     public void listar() {
        listaDados(ED.mostraEquipa());
    }
   
   
    private void listaDados(ArrayList<Equipamento> listaEquip) {     
        TE.limpaTabela();
        for(int i=0;i<listaEquip.size();i++){
            TE.adicionaItem
                           (listaEquip.get(i).getnSerie(),
                           listaEquip.get(i).getNomeEquipamento(),
                           listaEquip.get(i).getnContrato(),
                           listaEquip.get(i).getValorAssociado()
                           );
              
        }      
     
    }
    
    
}
