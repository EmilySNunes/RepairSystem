
package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

//Classe de Conexao com o banco de dados

public class Conexao {
    
    private static Connection conexao; //Váriavel de conexão
    
    
    //Método de conexão
    public static Connection getConexao(){
    
        if(conexao==null){
        
            try {
                
                conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RepairSystem", "root", "");
                
                // JOptionPane.showMessageDialog(null,"CONECTADO","ALERTA DE CONEXÃO",INFORMATION_MESSAGE); Informava que conexão está realizada
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null,"ERRO","ALERTA DE CONEXÃO",ERROR_MESSAGE);
                
                throw new RuntimeException(e);
            }
        
        }
        
        return conexao;
    
    }

    static void closerConnection(Connection conecta, PreparedStatement pst) {
        
        
        
    }
    
}
