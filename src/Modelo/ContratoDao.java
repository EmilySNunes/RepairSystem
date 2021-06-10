
package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class ContratoDao {
    
    public void CriaContrato(Contrato C){
    
        Connection conecta = Conexao.getConexao();
        PreparedStatement pst = null;
 
 
        
      
        try {
            
            pst = (PreparedStatement) conecta.prepareStatement("INSERT INTO Contrato(cnpj, tipoequipamento, valorassociado, nomeempresa, endereco, ndequipamento, parcelaspagamento) VALUES (?,?,?,?,?,?,?)");
             




            pst.setString(1, C.getCnpj());
            pst.setString(2, C.getTipoequipameno());
            pst.setInt(3, C.getValorassociado());
            pst.setString(4, C.getNomeEmpresa());
            pst.setString(5, C.getEndereco());
            pst.setInt(6, C.getNdequipamento());
            pst.setInt(7, C.getParcelaspagamento());
            
           
            
             pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null," \n CONTRATO CADASTRADO! " ,"ALERTA DE CONTRATO:",INFORMATION_MESSAGE);
            
            
            
            
        } catch (SQLException var) {
         
            
             JOptionPane.showMessageDialog(null,"ERRO \n VERIFIQUE SE OS DADOS ESTÃO CORRETOS","ALERTA CONTRATO",ERROR_MESSAGE);
           
            
        } finally {

            Conexao.closerConnection(conecta, pst);

        }
    
    } 
    
}
