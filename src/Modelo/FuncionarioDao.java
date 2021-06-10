
package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;


public class FuncionarioDao {
    
    public void criaFuncionario(Funcionario F){
    
        Connection conecta = Conexao.getConexao();
        PreparedStatement pst = null;
 
 
        
      
        try {
            
            pst = (PreparedStatement) conecta.prepareStatement("INSERT INTO Funcionario(cpf, nome, email, endereco, telefone, horastrabalhadas, classificacao) VALUES (?,?,?,?,?,?,?)");
            
            pst.setString(1, F.getCpf());
            pst.setString(2, F.getNome());
            pst.setString(3, F.getEmail());
            pst.setString(4, F.getEndereco());
            pst.setString(5, F.getTelefone());
            pst.setInt(6, F.getHorasTrabalhadas());
            pst.setString(7, F.getClassificador());
           
            
             pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, F.getNome() +" \n VOCÊ ESTÁ CADASTRADO NO REPAIR SYSTEM \n","FUNCIONÁRIO:",INFORMATION_MESSAGE);
            
            
            
            
        } catch (SQLException var) {
         
            
             JOptionPane.showMessageDialog(null,"ERRO \n VERIFIQUE SE SEUS DADOS ESTÃO CORRETOS","ALERTA CADASTRO",ERROR_MESSAGE);
           
            
        } finally {

            Conexao.closerConnection(conecta, pst);

        }
    
    } 
         
       
              
    
}
