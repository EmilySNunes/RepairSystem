
package Controle;

import Modelo.Chamado;
import Modelo.ChamadoDao;
import Modelo.Contrato;
import Modelo.ContratoDao;
import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import Visao.TelaCadastroChamado;
import java.sql.SQLException;


public class RegraChamado {
    
    private final TelaCadastroChamado TCC;
    private ChamadoDao CD;

    RegraChamado(TelaCadastroChamado TCC1) {
     
        this.TCC = TCC1;
        this.CD = new ChamadoDao();
        
    }


     public void AdicionaChamado() throws SQLException{
    
        
        ChamadoDao CD = new ChamadoDao();
        Chamado C = new Chamado();
       
        
         C.setnChamado(Integer.parseInt(TCC.getnDoChamado1().getText()));
         C.setNomeEmpresa(TCC.getNomeDaEmpresa().getText());
         C.setIdEquipamento(Integer.parseInt(TCC.getIdDoEquipamento().getText()));
         C.setMotivoChamada(TCC.getMotivoDaChamada().getText());
         C.setDataentendimento(Integer.parseInt(TCC.getDataDoAtendimento().getText()));
         
                      
        
        CD.CriaChamado(C);
    
    } 
   

    

}
