package Controle;

import Modelo.Funcionario;
import Modelo.FuncionarioDao;
import Modelo.LoginDao;
import Modelo.UsuarioDao;
import Visao.TelaAddFuncionario;
import Visao.TelaFuncionario;
import java.sql.SQLException;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.html.HTML;

public class RegraFuncionario {

    private final TelaAddFuncionario TAF;
    private FuncionarioDao FD;
    private boolean novo;
    private int id;

    RegraFuncionario(TelaAddFuncionario TAF1) {
        this.TAF = TAF1;
        this.FD = new FuncionarioDao();
        this.id=0;
    }

    //METODOS COM BANCO
    public void adicionaFunc(String receClassifica) {

        
          String recebeClassifica;
          
          recebeClassifica = receClassifica;
          

                FuncionarioDao FD = new FuncionarioDao();
                Funcionario F = new Funcionario();       

                F.setCpf((TAF.getCpf().getText()));
                F.setNome(TAF.getNome().getText());
                F.setEmail(TAF.getEmail().getText());
                F.setEndereco(TAF.getEndereco().getText());
                F.setTelefone(TAF.getTelefone().getText());
                F.setHorasTrabalhadas(Integer.parseInt(TAF.getHorasdetrabalho().getText()));
                F.setClassificador(recebeClassifica);

                //Cria Funcionário da Classe Dao
                FD.criaFuncionario(F);

                //UsuarioDao UD = new UsuarioDao();

                //Cria Usuário automático com os dados do Funcionário
               // UD.CriaUsuario(F);
                
       
        
    

    }

    public String procuraLogin() throws SQLException {

        String passa = null;

        //Cria variável Login Dao
        LoginDao LD = new LoginDao();

        //Chama método da Login Dao para ver quem fez Login
        passa = LD.procuraLogin();

        return passa;

    }
    
   /* public void excluir(){
        int item = TF.getTabelaFuncionario().getSelectedRow();
        if(item>=0){
            if(JOptionPane.showConfirmDialog(TF, "Deseja realmente excluir?", "Confirmação de exclusão", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0){
                Funcionario F = new Funcionario();
                F.setCpf((String) TF.getModelo().getValueAt(item,0));
                if(FuncionarioDao.excluir(F)){
                    TF.getModelo().removeRow(item);
                }
            }
        }
    }*/
    

    //METODOS SEM BANCO
    public boolean validarCpf(String cpf) {
        int cont = 0;

        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        for (int i = 0; i < 10; i++) {
            if (cpf.charAt(i) == cpf.charAt(i + 1)) {
                cont = cont + 1;
            }
        }

        if (cont == 10 || cpf.length() != 11) {
            return false;
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            //cálculo do 1º dígito verificador;
            sm = 0;
            peso = 10;

            for (i = 0; i < 9; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);

            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48);
            }

            //cálculo do 2º dígito verificador;
            sm = 0;
            peso = 11;

            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);

            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            //verifica se os digitos calculados conferem com os digitos informados.
            return (dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10));

        } catch (InputMismatchException ex) {
            System.out.println("Deu ruin na verificação do cpf - Classe Regra funcionario - Método " + ex);
            return false;
        }

    }

    public boolean validarCampos() {
        if (this.TAF.getNome().getText().equals("")) {
            return false;
        } else if (this.TAF.getCpf().getText().equals("   .   .   -  ")) {
            return false;
        } else if (this.TAF.getEndereco().getText().equals("")) {
            return false;
        } else if (this.TAF.getEmail().getText().equals("")) {
            return false;
        } else if (this.TAF.getTelefone().getText().equals("(  )     -    ")) {
            return false;
        } else if (this.TAF.getHorasdetrabalho().getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public void limpar() {

        this.TAF.getCpf().setText("");
        this.TAF.getEmail().setText("");
        this.TAF.getEndereco().setText("");
        this.TAF.getHorasdetrabalho().setText("");
        this.TAF.getNome().setText("");
        this.TAF.getTelefone().setText("");

    }
}
