

package Controle;

import Modelo.LoginDao;
import Visao.TelaAddFuncionario;
import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import Visao.TelaRelatorio;
import java.sql.SQLException;


public class RegraMostraRelatorio {

    RegraMostraRelatorio(TelaRelatorio TR) {
     
        
    }

      public String procuraLogin() throws SQLException{
         
         String passa = null;
         
           LoginDao LD = new LoginDao();
         
          passa = LD.procuraLogin();
           
           
           return passa;
         
     }
    
}
