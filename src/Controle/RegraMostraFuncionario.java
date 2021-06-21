package Controle;

import Modelo.Funcionario;
import Modelo.FuncionarioDao;
import Modelo.LoginDao;
import Modelo.UsuarioDao;
import Visao.TelaAddFuncionario;
import Visao.TelaFuncionario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.text.html.HTML;

public class RegraMostraFuncionario {

    private final TelaFuncionario TF;
    private FuncionarioDao FD;
    private boolean novo;
    private int id;

    RegraMostraFuncionario(TelaFuncionario TF1) {

        this.TF = TF1;
        this.FD = new FuncionarioDao();

    }

    public String procuraLogin() throws SQLException {

        String passa = null;

        LoginDao LD = new LoginDao();

        passa = LD.procuraLogin();

        return passa;

    }

    public void listar() {
        listaDados(FD.mostraFunc());
    }

    public void pesquisar() {
        
        listaDados(FD.pesquisar(TF.getPesquisar().getText()));
        
    }

    private void listaDados(ArrayList<Funcionario> listaFunc) {
        TF.limpaTabela();
        for (int i = 0; i < listaFunc.size(); i++) {
            TF.adicionaItem(listaFunc.get(i).getCpf(),
                    listaFunc.get(i).getClassificador(),
                    listaFunc.get(i).getNome());

        }

    }
    
    
    //EU NÃO CONSEGUI FAZER
    public void editar(){
      
    }
}
