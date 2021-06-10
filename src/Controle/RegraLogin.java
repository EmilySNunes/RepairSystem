
package Controle;

import Modelo.Login;
import Modelo.LoginDao;
import Modelo.Usuario;
import Visao.TelaLogin;
import Visao.TelaPrincipal;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class RegraLogin {

    private final TelaLogin TL;
    private LoginDao LD;

    RegraLogin(TelaLogin TL1) {
       
        this.TL = TL1;
        this.LD = new LoginDao();
        
    }

    
    public void acesso() throws SQLException{
    
         Login L = new Login();
         LoginDao LD = new LoginDao();
         L.setUsuario((TL.getCnpj().getText()));
         L.setSenha(TL.getCamposenha().getText());
         
         boolean verifica = false;
         
         String verifiTipo = null;
         
         
       for (Usuario i : LD.LeituradoLogin(L)) {


                  if( L.getUsuario().equals(i.getUsuario()) &&  i.getSenha().equals(L.getSenha()) && i.getClassificador().equals("Adm")){
                 
                     cria();
                    
                     verifica = true;
                     
                     verifiTipo = "Admnistrador";
                                     
                 
                 }else if( L.getUsuario().equals(i.getUsuario()) && i.getSenha().equals(L.getSenha()) && i.getClassificador().equals("Atendente")){
                 
                      cria();
                    
                     verifica = true;
                     
                     verifiTipo = "Atendente";
                     
                 
                 }else if( L.getUsuario().equals(i.getUsuario()) && i.getSenha().equals(L.getSenha()) && i.getClassificador().equals("Supervisor")){
                 
                      cria();
                    
                     verifica = true;
                     
                     verifiTipo = "Supervisor";
                     
                 
                 }else if( L.getUsuario().equals(i.getUsuario()) && i.getSenha().equals(L.getSenha()) && i.getClassificador().equals("Vendedor")){
                 
                      cria();
                    
                     verifica = true;
                     
                     verifiTipo = "Vendedor";
                     
                 
                 }else if( L.getUsuario().equals(i.getUsuario()) && i.getSenha().equals(L.getSenha()) && i.getClassificador().equals("Tecnico")){
                 
                      cria();
                    
                     verifica = true;
                     
                     verifiTipo = "Tecnico";
                     
                 }
    
          
        } 
       
       if(verifica == false){

        JOptionPane.showMessageDialog(null,"LOGIN NÃO ENCONTRADO \n VOCÊ POSSUI LOGIN?","ALERTA DE LOGIN", ERROR_MESSAGE);
        
        ControleLogin CL = new ControleLogin();
        
       }
       
       if(verifica == true && verifiTipo.equals("Admnistrador")){
       
          ControlePrincipal CP = new ControlePrincipal();
       
       }else if(verifica == true && verifiTipo.equals("Atendente")){
       
          ControleAtendente CA = new ControleAtendente();
       
       }else if(verifica == true && verifiTipo.equals("Supervisor")){
       
          ControleSupervisor CS = new ControleSupervisor();
       
       }else if(verifica == true && verifiTipo.equals("Tecnico")){
       
           ControleTecnico CT = new ControleTecnico();
       
       }else if(verifica == true && verifiTipo.equals("Vendedor")){
       
          ControleVendedor CV = new ControleVendedor();
       
       }
    
         
         
    
    }
    
    
    public void cria() throws SQLException{
    
        
        LoginDao LD = new LoginDao();
        Login L = new Login();
        
         L.setUsuario((TL.getCnpj().getText()));
         L.setSenha(TL.getCamposenha().getText());
        
        LD.CriaLogin(L);
    
    } 
  

   
    
}
