
package Modelo;

import Visao.TelaLogin;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;


public class LoginDao {
    
    public ArrayList<Usuario> LeituradoLogin(Login LC) throws SQLException {

              
        Connection Conecta = Conexao.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        ArrayList<Usuario> Guarde = new ArrayList<>();

        try {
           

            pst = (PreparedStatement) Conecta.prepareStatement(" SELECT usuario,senha,classficacao  FROM Usuario WHERE usuario = ?");
            
            pst.setString(1, LC.getUsuario());
            
            rs = pst.executeQuery();
            
             Usuario user = new Usuario();

            while (rs.next()) {

                user.setUsuario(rs.getString("usuario")); 
                user.setSenha(rs.getString("senha")); 
                user.setClassificador(rs.getString("classficacao"));
                

                Guarde.add(user);

            }
            
             rs.close();
            pst.close();
            

        } catch (SQLException ex) {
            
           throw new RuntimeException(ex);
            
        }
        
        return Guarde;
        
    }
    
    public void CriaLogin(Login L){
    
        Connection conecta = Conexao.getConexao();
        PreparedStatement pst = null;
       
        
        
      
        try {
            
            pst = (PreparedStatement) conecta.prepareStatement("INSERT INTO Login(usuario, senha) VALUES (?,?)");
            
            pst.setString(1, L.getUsuario());
            pst.setString(2, L.getSenha());
            
             pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"SEJA BEM VINDO","ALERTA LOGIN",INFORMATION_MESSAGE);
            
            
            
            
        } catch (SQLException var) {
           
            
             JOptionPane.showMessageDialog(null,"ERRO \n VERIFIQUE SE SEUS DADOS ESTÃO CORRETOS","ALERTA LOGIN",ERROR_MESSAGE);
           
            
        } finally {

            Conexao.closerConnection(conecta, pst);

        }
    
    } 


}