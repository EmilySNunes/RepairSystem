

package Controle;

import Modelo.Equipamento;
import Modelo.EquipamentoDao;
import Modelo.LoginDao;
import Visao.TelaNovoEquipamento;
import java.sql.SQLException;


public class RegraEquipamento {

     private final TelaNovoEquipamento TNE;
     private EquipamentoDao ED;

    
    RegraEquipamento( TelaNovoEquipamento TE1) {
     
     
        this.TNE = TE1;
        this.ED = new EquipamentoDao();
        
    }
    
    
     public void limpa(){
    
         TNE.getDatafabricacao().setText("");
         TNE.getNcontrato().setText("");
         TNE.getNdemanutencao().setText("");
         TNE.getNdeserie().setText("");
         TNE.getNomeequipamento().setText("");
         TNE.getParcelasdepagamento().setText("");
         TNE.getTipodeequipamento().setText("");
         TNE.getValorassociado().setText("");
         
         
    
   }
     
      public void AdicionaEquipamento(){
      
        
        EquipamentoDao ED = new EquipamentoDao();
        Equipamento E = new Equipamento();
       
        
         E.setnManutencao(Integer.parseInt(TNE.getNdemanutencao().getText()));
         E.setnSerie(Integer.parseInt(TNE.getNdeserie().getText()));
         E.setTipoEquipamento(TNE.getTipodeequipamento().getText());
         E.setValorAssociado(Integer.parseInt(TNE.getValorassociado().getText()));
         E.setNomeEquipamento(TNE.getNomeequipamento().getText());
         E.setnContrato(Integer.parseInt(TNE.getNcontrato().getText()));
         E.setAtaFabrica(TNE.getDatafabricacao().getText());
         E.setParcelaPagamento(Integer.parseInt(TNE.getParcelasdepagamento().getText()));
         
         
         ED.criaEquipamento(E);
    
    } 

    public String procuraLogin() throws SQLException{
         
         String passa = null;
         
           LoginDao LD = new LoginDao();
         
          passa = LD.procuraLogin();
           
           
           return passa;
         
     }
    
}
