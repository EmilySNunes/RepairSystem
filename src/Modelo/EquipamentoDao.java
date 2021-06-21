
package Modelo;

/*import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;*/
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;


public class EquipamentoDao{
    
     public void criaEquipamento(Equipamento E){
    
        Connection conecta = Conexao.getConexao();
        PreparedStatement pst = null;
 
        
         try {
             
               pst = (PreparedStatement) conecta.prepareStatement("INSERT INTO Equipamento(nManutencao, nSerie, tipoEquipamento, valorAssociado, nomeEquipamento, nContrato, DataFabrica, parcelaPagamento) VALUES (?,?,?,?,?,?,?,?)");
            
            pst.setInt(1, E.getnManutencao());
            pst.setInt(2, E.getnSerie());
            pst.setString(3, E.getTipoEquipamento());
            pst.setInt(4, E.getValorAssociado());
            pst.setString(5, E.getNomeEquipamento());
            pst.setInt(6, E.getnContrato());
            pst.setString(7, E.getAtaFabrica());
            pst.setInt(8, E.getParcelaPagamento());
           
         //nSerie tipoEquipamento valorAssociado nomeEquipamento nContrato  DataFabrica  parcelaPagamento   
            
             pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null," \n EQUIPAMENTO CADASTRADO \n","ALERTA:",INFORMATION_MESSAGE);
             
         } catch (SQLException var) {
             
               JOptionPane.showMessageDialog(null,"ERRO \n VERIFIQUE SE SEUS DADOS ESTÃO CORRETOS","ALERTA CADASTRO",ERROR_MESSAGE);
               
         } finally {

            Conexao.closerConnection(conecta, pst);

        }
            
     }
     

         public ArrayList<Equipamento> mostraEquipa(){
         
        String sql = "SELECT * FROM Equipamento ORDER BY nSerie, nomeEquipamento, nContrato, valorAssociado";
        
        ArrayList<Equipamento> lista = new ArrayList<>();
        
        PreparedStatement pst;
        ResultSet rs;
        
         try {
             
              pst = (PreparedStatement) Conexao.getConexao().prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                
                Equipamento cont = new Equipamento();
                
                cont.setnSerie(Integer.parseInt(rs.getString("nSerie")));
                cont.setNomeEquipamento(rs.getString("nomeEquipamento"));
                cont.setnContrato(Integer.parseInt(rs.getString("nContrato")));
                cont.setValorAssociado(Integer.parseInt((rs.getString("valorAssociado"))));
         //   nSerie  nomeEquipamento nContrato valorAssociado
                lista.add(cont);
            }
            
            rs.close();
            pst.close();
             
         } catch (SQLException ex) {
             
             System.out.println(ex);
         }

          return lista;  
     } 
      
    
}
