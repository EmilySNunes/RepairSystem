
package Main;

import Controle.ControleLogin;
import Modelo.Conexao;
import com.mysql.jdbc.Connection;


public class RepairSystem {

   
    public static void main(String[] args) {
  
        Connection conexao = Conexao.getConexao();
        ControleLogin CL = new ControleLogin();
        
    }
    
}
