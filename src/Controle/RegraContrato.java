
package Controle;

import Modelo.Contrato;
import Modelo.ContratoDao;
import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import Visao.TelaCadastroChamado;
import java.sql.SQLException;


public class RegraContrato {
    
    private final TelaCadastraContrato TCC;
    private ContratoDao CD;

    RegraContrato(TelaCadastraContrato TCC1) {
     
        this.TCC = TCC1;
        this.CD = new ContratoDao();
        
    }

   
    public void limpa(){
    
         TCC.getCnpj().setText("");
         TCC.getEndereco().setText("");
         TCC.getNequipa().setText("");
         TCC.getNomeem().setText("");
         TCC.getParcelapaga().setText("");
         TCC.getTiposequipa().setText("");
         TCC.getValorassocia().setText("");
         
         
    
    }
    
     public void AdicionaContrato() throws SQLException{
    
        
        ContratoDao CD = new ContratoDao();
        Contrato C = new Contrato();
       
        
         C.setCnpj(TCC.getCnpj().getText());
         C.setTipoequipameno(TCC.getTiposequipa().getText());
         C.setValorassociado(Integer.parseInt(TCC.getValorassocia().getText()));
         C.setNomeEmpresa(TCC.getNomeem().getText());
         C.setEndereco(TCC.getEndereco().getText());
         C.setNdequipamento(Integer.parseInt(TCC.getNequipa().getText()));
         C.setParcelaspagamento(Integer.parseInt(TCC.getParcelapaga().getText()));
                
        
         
        
        CD.CriaContrato(C);
    
    } 
   

    

}
