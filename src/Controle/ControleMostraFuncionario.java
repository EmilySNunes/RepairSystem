package Controle;

import Visao.TelaAddFuncionario;
import Visao.TelaAtendente;
import Visao.TelaFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class ControleMostraFuncionario implements ActionListener {

    private final TelaFuncionario TF;
    private final RegraMostraFuncionario RMF;

    public ControleMostraFuncionario() {

        this.TF = new TelaFuncionario(null, true);
        this.RMF = new RegraMostraFuncionario(TF);

        addListerners();
        RMF.listar();
        this.TF.setVisible(true);

    }

    public void addListerners() {

        this.TF.getBotonAdicionaFuncionario().addActionListener(this);
        this.TF.getBotonDetalhes().addActionListener(this);
        this.TF.getBotonEditar().addActionListener(this);
        this.TF.getBotonPesquisar().addActionListener(this);
        this.TF.getBotonSair().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent var) {

        if (var.getSource().equals(this.TF.getBotonAdicionaFuncionario())) {

            ControleFuncionario CF = new ControleFuncionario();

            this.TF.dispose();

        } else if (var.getSource().equals(this.TF.getBotonDetalhes())) {

            //RMF.listar();
        } else if (var.getSource().equals(this.TF.getBotonEditar())) {

            JOptionPane.showMessageDialog(null, "AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ", WARNING_MESSAGE);

        } else if (var.getSource().equals(this.TF.getBotonPesquisar())) {
            
            this.RMF.pesquisar();
            
            //JOptionPane.showMessageDialog(null, "AINDA NÃO HÁ AÇÕES AQUI!", "INFORMAÇÃO: ", WARNING_MESSAGE);

        } 
        //ESSE BOTÃO SAIR E DA TELA FUNCIONARIO
        else if (var.getSource().equals(this.TF.getBotonSair())) {

            String rece = null;

            try {

                rece = this.RMF.procuraLogin();

                if (rece.equals("Admnistrador")) {

                    ControlePrincipal CP = new ControlePrincipal();

                    this.TF.dispose();

                } else if (rece.equals("Atendente")) {

                    ControleAtendente CA = new ControleAtendente();

                    this.TF.dispose();

                } else if (rece.equals("Supervisor")) {

                    ControleSupervisor CS = new ControleSupervisor();

                    this.TF.dispose();

                } else if (rece.equals("Tecnico")) {

                    ControleTecnico CT = new ControleTecnico();

                    this.TF.dispose();

                } else if (rece.equals("Vendedor")) {

                    ControleVendedor CV = new ControleVendedor();

                    this.TF.dispose();

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "ERRO", "XXXX", ERROR_MESSAGE);
            }

            TF.dispose();

        }

    }

}
