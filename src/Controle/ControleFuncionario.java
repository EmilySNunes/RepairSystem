package Controle;

import Modelo.UsuarioDao;
import Visao.TelaAddFuncionario;
import Visao.TelaAtendente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class ControleFuncionario implements ActionListener {

    //Cria as variáveis Tela mostra Funcionário, Regra Funcionário, Regra Login
    private final TelaAddFuncionario TAF;
    private final RegraFuncionario RF;
    private final RegraLogin RL = null;
     String Classificacao = null;

    public ControleFuncionario() {

        this.TAF = new TelaAddFuncionario(null, true);
        this.RF = new RegraFuncionario(TAF);
      

        addListerners();

        this.TAF.setVisible(true);

    }

    public void addListerners() {

        this.TAF.getBotaoExcluir().addActionListener(this);
        this.TAF.getBotaoSalvar().addActionListener(this);
        this.TAF.getBotonSair().addActionListener(this);
        //this.TAF.getBotaoVisualizar().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent var) {

        //Botão Excluir
        if (var.getSource().equals(this.TAF.getBotaoExcluir())) {

            //Limpar os campos da tela
            this.RF.limpar();

            
        } 
       /* //Botão Visualiar
        else if (var.getSource().equals(this.TAF.getBotaoVisualizar())) {

            //Abre a tela mostra Funcionário
            ControleMostraFuncionario CMF = new ControleMostraFuncionario();

            this.TAF.dispose();

        } */
        //Botão Salvar ou add Funcionário
        else if (var.getSource().equals(this.TAF.getBotaoSalvar())) {

           

            //Verifica qual rádio foi marcado
            
            
            
            //Se foi o Adm adiciona a classificação Adm
            if (this.TAF.getMarcaAdm().isSelected()) {

                this.Classificacao = "Adm";

            } 
             //Se foi o Atendente adiciona a classificação Atendente
            else if (this.TAF.getMarcaAtende().isSelected()) {

                this.Classificacao= "Atendente";

            } 
             //Se foi o Supervisor adiciona a classificação Supervisor
            else if (this.TAF.getMarcaSuper().isSelected()) {

                this.Classificacao = "Supervisor";

            } else if (this.TAF.getMarcaTecni().isSelected()) {

                this.Classificacao = "Tecnico";

            } else if (this.TAF.getMarcaVende().isSelected()) {

                this.Classificacao = "Vendedor";

            }
            
            boolean ver = false, testa = false;
            
            if(this.RF.validarCampos()){
            
                ver = true;
            
            } else {
         
                JOptionPane.showMessageDialog(null, "TODOS OS CAMPOS DEVEM SER PREENCHIDOS!", "ALERTA: ", JOptionPane.ERROR_MESSAGE);

            } 
            
            if(this.RF.validarCpf(TAF.getCpf().getText())){
                
                testa = true;
                
            }  else {
                
                JOptionPane.showMessageDialog(null, "SEU CPF NÃO É VÁLIDO \n TENTE NOVAMENTE OU DIRIGA-SE A RECEITA FEDERAL", "ERRO DE CADASTRO: ", JOptionPane.ERROR_MESSAGE);

            }
       
            
            if(ver == true && testa == true){
                
                 this.RF.adicionaFunc(Classificacao);
                
            }

            
            //Criar um Funcionário
           

        } 
        //Botão Sair
        else if (var.getSource().equals(this.TAF.getBotonSair())) {

            //Ajuda ver quem fez o Login
            String rece = null;

            try {

                rece = this.RF.procuraLogin();

                if (rece.equals("Admnistrador")) {

                    ControleMostraFuncionario CMF = new ControleMostraFuncionario();

                    this.TAF.dispose();

                } else if (rece.equals("Atendente")) {

                    ControleAtendente CA = new ControleAtendente();

                    this.TAF.dispose();
                } else if (rece.equals("Supervisor")) {

                    ControleSupervisor CS = new ControleSupervisor();

                    this.TAF.dispose();

                } else if (rece.equals("Tecnico")) {

                    ControleTecnico CT = new ControleTecnico();

                    this.TAF.dispose();

                } else if (rece.equals("Vendedor")) {

                    ControleVendedor CV = new ControleVendedor();

                    this.TAF.dispose();
                }

                TAF.dispose();

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "ERRO", "XXXX", ERROR_MESSAGE);
            }

        }

    }

}
