import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Funcionario {

    public Gerente(String nome, String telefone, String email, String login, String senha, String tipo) {
        super(nome, telefone, email, login, senha, tipo);
    }

    public Pessoa cadastrarFunc() {
        System.out.println("Qual o nome ?");
        String nome = tc.next();
        System.out.println("Qual o telefone?");
        String telefone = tc.next();
        System.out.println("Qual o login?");
        String login = tc.next();
        System.out.println("Qual a senha?");
        String senha = tc.next();

        String tipo = "Funcionario";
        Pessoa funcionario = new Funcionario(nome, telefone, email, login, senha, tipo);
        return funcionario;

    }

    public Pessoa cadastrarCli() {
        System.out.println("Qual o nome ?");
        String nome = tc.next();
        System.out.println("Qual o telefone?");
        String telefone = tc.next();
        System.out.println("Qual o login?");
        String login = tc.next();
        System.out.println("Qual a senha?");
        String senha = tc.next();

        String tipo = "Cliente";
        Pessoa cliente = new Cliente(nome, telefone, email, login, senha, tipo);
        return cliente;
    }
    public Pessoa cadastrarGerente() {
        System.out.println("Qual o nome ?");
        String nome = tc.next();
        System.out.println("Qual o telefone?");
        String telefone = tc.next();
        System.out.println("Qual o login?");
        String login = tc.next();
        System.out.println("Qual a senha?");
        String senha = tc.next();

        String tipo = "Cliente";
        Pessoa gerente = new Gerente(nome, telefone, email, login, senha, tipo);
        return gerente;
    }
    public Pessoa deletarPessoa(ArrayList<Pessoa> pessoas, String nomePessoa, String tipoPessoa){
        Pessoa pessoa = new Pessoa();
        for (int index=0;index<pessoas.size();index++){
            if (nomePessoa.equals(pessoas.get(index).getNome()) && tipoPessoa.equals(pessoas.get(index).getTipo())){
                pessoa = pessoas.get(index);
            }
        }
        return pessoa;
    }
    public boolean editarPessoa(ArrayList<Pessoa> pessoas, Pessoa pessoa){
        int index;
        for (index=0;index<pessoas.size();index++){
            if (pessoa.equals(pessoas.get(index))){
                System.out.println("Nome? ");
                pessoa.nome = tc.next();
                System.out.println("Telefone?");
                pessoa.telefone = tc.next();
                System.out.println("Email:");
                pessoa.email = tc.next();
                System.out.println("Login?");
                pessoa.login = tc.next();
                System.out.println("Senha?");
                pessoa.senha = tc.next();
                pessoa.tipo = "Gerente";
            }
        }
        return true;
    }
}

