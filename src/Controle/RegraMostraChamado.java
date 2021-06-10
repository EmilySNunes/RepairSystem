
package Controle;

import Modelo.Chamado;
import Modelo.ChamadoDao;
import Modelo.Contrato;
import Modelo.ContratoDao;
import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import Visao.TelaCadastroChamado;
import Visao.TelaChamado;
import java.sql.SQLException;


public class RegraMostraChamado {
    
    private final TelaChamado TC;
    private ChamadoDao CD;

    RegraMostraChamado(TelaChamado TCC1) {
     
        this.TC = TCC1;
        this.CD = new ChamadoDao();
        
    }


     
   

    

}
