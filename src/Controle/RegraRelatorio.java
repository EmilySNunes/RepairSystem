
package Controle;

import Modelo.LoginDao;
import Visao.TelaAddRelatorio;
import java.sql.SQLException;


public class RegraRelatorio {

    RegraRelatorio(TelaAddRelatorio TAR) {
       
        
    }
    
      public String procuraLogin() throws SQLException{
         
         String passa = null;
         
           LoginDao LD = new LoginDao();
         
          passa = LD.procuraLogin();
           
           
           return passa;
         
     }
    
}
