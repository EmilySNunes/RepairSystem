package Controle;

import Modelo.Chamado;
import Modelo.ChamadoDao;
import Modelo.Contrato;
import Modelo.ContratoDao;
import Modelo.LoginDao;
import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import Visao.TelaCadastroChamado;
import java.sql.SQLException;

public class RegraChamado {

    private final TelaCadastroChamado TCC;
    private ChamadoDao CD;
    private LoginDao LD;

    RegraChamado(TelaCadastroChamado TCC1) {

        this.TCC = TCC1;
        this.CD = new ChamadoDao();
        this.LD = new LoginDao();

    }

    public void AdicionaChamado() throws SQLException {

        ChamadoDao CD = new ChamadoDao();
        Chamado C = new Chamado();

        C.setnChamado(Integer.parseInt(TCC.getnDoChamado1().getText()));
        C.setNomeEmpresa(TCC.getNomeDaEmpresa().getText());
        C.setIdEquipamento(Integer.parseInt(TCC.getIdDoEquipamento().getText()));
        C.setMotivoChamada(TCC.getMotivoDaChamada().getText());
        C.setDataentendimento((TCC.getDataDoAtendimento().getText()));
        

        CD.CriaChamado(C);
      

    }
 
    public String procuraLogin() throws SQLException {

        String passa = null;

        LoginDao LD = new LoginDao();

        passa = LD.procuraLogin();

        return passa;

    }
    
     public void limpar() {

        this.TCC.getDataDoAtendimento().setText("");
        this.TCC.getIdDoEquipamento().setText("");
        this.TCC.getMotivoDaChamada().setText("");
        this.TCC.getNomeDaEmpresa().setText("");
        this.TCC.getnDoChamado1().setText("");
        
        

    }
    
    
    
}
