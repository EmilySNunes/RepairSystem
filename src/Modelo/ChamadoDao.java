

package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;



public class ChamadoDao {
    
     public void CriaChamado(Chamado C){
    
        Connection conecta = Conexao.getConexao();
        PreparedStatement pst = null;
 
 
       

      
        try {
            
            pst = (PreparedStatement) conecta.prepareStatement("INSERT INTO Chamado(nChamado, nomeEmpresa, idEquipamento, motivoChamada, dataAtendimento) VALUES (?,?,?,?,?)");
             




            pst.setInt(1, C.getnChamado());
            pst.setString(2, C.getNomeEmpresa());
            pst.setInt(3, C.getIdEquipamento());
            pst.setString(4, C.getMotivoChamada());
            pst.setInt(5, C.getDataentendimento());
           
            
           
            
             pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null," \n CHAMADO ENCAMINHADO! " ,"ALERTA DE CHAMADO:",INFORMATION_MESSAGE);
            
            
            
            
        } catch (SQLException var) {
         
            
             JOptionPane.showMessageDialog(null,"ERRO \n VERIFIQUE SE OS DADOS ESTÃO CORRETOS","ALERTA:",ERROR_MESSAGE);
           
            
        } finally {

            Conexao.closerConnection(conecta, pst);

        }
    
    } 
    
}
