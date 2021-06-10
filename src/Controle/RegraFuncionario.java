
package Controle;

import Modelo.Funcionario;
import Modelo.FuncionarioDao;
import Modelo.UsuarioDao;
import Visao.TelaAddFuncionario;
import javax.swing.text.html.HTML;


public class RegraFuncionario {

          private final TelaAddFuncionario TAF;
          private FuncionarioDao FD;
    

    RegraFuncionario(TelaAddFuncionario TAF1) {
        
         
        this.TAF = TAF1;
        this.FD = new FuncionarioDao();
        
       
        

    }
    
    public void adicionaFunc(String receClassifica){
        
        FuncionarioDao FD = new FuncionarioDao();
        Funcionario F = new Funcionario();
        String recebeClassifica;
        
        recebeClassifica = receClassifica;
       
         F.setCpf((TAF.getCpf().getText()));
         F.setNome(TAF.getNome().getText());
         F.setEmail(TAF.getEmail().getText());
         F.setEndereco(TAF.getEndereco().getText());
         F.setTelefone(TAF.getTelefone().getText());
         F.setHorasTrabalhadas(Integer.parseInt(TAF.getHorasdetrabalho().getText()));
         F.setClassificador(recebeClassifica);
         
     
        
        FD.criaFuncionario(F);
        
        UsuarioDao UD = new UsuarioDao();
        
        UD.CriaUsuario(F);
       
        
        
    }
    
    public void limpar(){
        
     
        this.TAF.getCpf().setText("");
        this.TAF.getEmail().setText("");
        this.TAF.getEndereco().setText("");
        this.TAF.getHorasdetrabalho().setText("");
        this.TAF.getNome().setText("");
        this.TAF.getTelefone().setText("");
        
    }
    
    
    
}
