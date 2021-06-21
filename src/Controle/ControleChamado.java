package Controle;

import Modelo.LoginDao;
import Modelo.UsuarioDao;
import Visao.TelaAtendente;
import Visao.TelaCadastraContrato;
import Visao.TelaCadastroChamado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class ControleChamado implements ActionListener {

    private final TelaCadastroChamado TCC;
    private final RegraChamado RC;

    public ControleChamado() {

        this.TCC = new TelaCadastroChamado(null, true);
        this.RC = new RegraChamado(TCC);

        addListerners();

        this.TCC.setVisible(true);

    }

    public void addListerners() {

        this.TCC.getBotonEncaminhar().addActionListener(this);
        this.TCC.getBotonVerificar().addActionListener(this);
        this.TCC.getBotonSair().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent var) {

        if (var.getSource().equals(this.TCC.getBotonSair())) {

            String rece = null;

            try {

                rece = this.RC.procuraLogin();

                if (rece.equals("Admnistrador")) {

                    ControleMostraChamado CMC = new ControleMostraChamado();

                    this.TCC.dispose();

                } else if (rece.equals("Atendente")) {

                    ControleAtendente CA = new ControleAtendente();

                    this.TCC.dispose();

                } else if (rece.equals("Supervisor")) {

                    ControleSupervisor CS = new ControleSupervisor();

                    this.TCC.dispose();

                } else if (rece.equals("Tecnico")) {

                    ControleTecnico CT = new ControleTecnico();

                    this.TCC.dispose();

                } else if (rece.equals("Vendedor")) {

                    ControleVendedor CV = new ControleVendedor();

                    this.TCC.dispose();
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "ERRO", "XXXX", ERROR_MESSAGE);
            }

            TCC.dispose();

        } else if (var.getSource().equals(this.TCC.getBotonEncaminhar())) {

            try {

                this.RC.AdicionaChamado();
                
                this.RC.limpar();

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "ERRO", "XXXX", ERROR_MESSAGE);
            }

        } else if (var.getSource().equals(this.TCC.getBotonVerificar())) {

            try {

                ControleMostraChamado CMC = new ControleMostraChamado();

                this.TCC.dispose();

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "ERRO", "XXXX", ERROR_MESSAGE);

            }

        }

    }

}
