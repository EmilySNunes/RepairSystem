package Controle;

import Modelo.Chamado;
import Modelo.ChamadoDao;
import Modelo.Contrato;
import Modelo.ContratoDao;
import Modelo.LoginDao;
import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import Visao.TelaCadastroChamado;
import Visao.TelaChamado;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegraMostraChamado {

    private final TelaChamado TC;
    private ChamadoDao CD;
    

    RegraMostraChamado(TelaChamado TCC1) {

        this.TC = TCC1;
        this.CD = new ChamadoDao();

    }

    public String procuraLogin() throws SQLException {

        String passa = null;

        LoginDao LD = new LoginDao();

        passa = LD.procuraLogin();

        return passa;

    }

    public void listar() {
        listaDados(CD.mostraChama());
    }

    private void listaDados(ArrayList<Chamado> listaChama) {
        TC.limpaTabela();
        for (int i = 0; i < listaChama.size(); i++) {
            TC.adicionaItem(listaChama.get(i).getnChamado(),
                    listaChama.get(i).getNomeEmpresa());

        }
}
    
        
       public void pesquisar(){
          
           int numero = 0;
           
           numero = Integer.parseInt(TC.getPesquisar().getText());
            
           this.listaDados(CD.pesquisar(numero));
           
           
           
        }
    
}
