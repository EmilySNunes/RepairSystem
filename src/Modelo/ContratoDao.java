package Modelo;
/* import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement; */
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class ContratoDao {

    public void CriaContrato(Contrato C) {

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

            JOptionPane.showMessageDialog(null, " \n CONTRATO CADASTRADO! ", "ALERTA DE CONTRATO:", INFORMATION_MESSAGE);

        } catch (SQLException var) {

            JOptionPane.showMessageDialog(null, "ERRO \n VERIFIQUE SE OS DADOS ESTÃO CORRETOS", "ALERTA CONTRATO", ERROR_MESSAGE);

        } finally {

            Conexao.closerConnection(conecta, pst);

        }

    }

    public ArrayList<Contrato> mostraContrato() {

        String sql = "SELECT * FROM Contrato ORDER BY nsquencia, nomeempresa, valorassociado";

        ArrayList<Contrato> lista = new ArrayList<>();

        java.sql.PreparedStatement pst;
        ResultSet rs;

        try {
            pst = Conexao.getConexao().prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                Contrato cont = new Contrato();
                cont.setnSequencia(rs.getInt("nsquencia"));
                cont.setNomeEmpresa(rs.getString("nomeempresa"));
                cont.setValorassociado(Integer.parseInt(rs.getString("valorassociado")));

                lista.add(cont);
            }

            rs.close();
            pst.close();

        } catch (SQLException ex) {

            System.out.println(ex);

        }

        return lista;
    }
    
      public ArrayList<Contrato> pesquisar (int nSequencia) {
        
        
        
        ArrayList<Contrato> lista = new ArrayList<>();

        PreparedStatement pst;
        ResultSet rs;

        try {
            
            String sql = "SELECT * FROM Contrato WHERE nsquencia LIKE ? ORDER BY nsquencia, nomeempresa, valorassociado";
            
            pst = Conexao.getConexao().prepareStatement(sql);
            
            pst.setInt(1, nSequencia);
            
            rs = pst.executeQuery();
            
             Contrato C = new Contrato();

            while (rs.next()) {
                
                
                C.setnSequencia(rs.getInt("nsquencia")); 
                C.setCnpj(rs.getString("cnpj")); 
                C.setTipoequipameno(rs.getString("tipoequipamento")); 
                C.setValorassociado(rs.getInt("valorassociado")); 
                C.setNomeEmpresa(rs.getString("nomeempresa")); 
                C.setEndereco(rs.getString("endereco")); 
                C.setNdequipamento(rs.getInt("ndequipamento")); 
                C.setParcelaspagamento(rs.getInt("parcelaspagamento")); 
           
                
                lista.add(C);
                
                

                

            }
            rs.close();
            pst.close();

          

        } catch (SQLException var) {

            JOptionPane.showMessageDialog(null, "ERRO \n VERIFIQUE SE OS DADOS ESTÃO CORRETOS", "ALERTA:", ERROR_MESSAGE);

        }
        
        return lista;

    }
    
    

}
