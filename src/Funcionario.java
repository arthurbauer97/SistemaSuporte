import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa {

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    protected Funcionario(String nome, String telefone, String email, String login, String senha, String tipo) {
        super(nome, telefone, email, login, senha, tipo);
    }

    protected Funcionario() {
    }

    protected int numeroChamados;

    Scanner tc = new Scanner(System.in);

    public int getNumeroChamados() {
        return numeroChamados;
    }

    public void setNumeroChamados(int numeroChamados) {
        this.numeroChamados = numeroChamados;
    }

    public ArrayList<Funcionario> getFuncionarios(ArrayList<Pessoa>pessoas){
        for (int i = 0; i<pessoas.size();i++){
            if (pessoas.get(i).getTipo() == "Funcionario"){
                funcionarios.add((Funcionario) pessoas.get(i));
            }
        }
        return funcionarios;
    }

    public Funcionario getFuncionarioChamado(ArrayList<Funcionario> funcionarios){
        int chamados = 1000;
        Funcionario funcionarioChamado = new Funcionario();
        for (int i=0; i<funcionarios.size();i++){
            if (funcionarios.get(i).numeroChamados < chamados){
                funcionarioChamado = funcionarios.get(i);
            }
        }
        return funcionarioChamado;
    }
}
