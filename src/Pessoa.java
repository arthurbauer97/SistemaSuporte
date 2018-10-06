import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {

    public Pessoa(){

    }
    public Pessoa(String nome, String telefone, String email, String login,String senha, String tipo){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }
    protected String nome;
    protected String telefone;
    protected String email;
    protected String login;
    protected String senha;
    protected String tipo;



    Scanner tc = new Scanner(System.in);


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() { return tipo;  }

    public void setTipo(String tipo) {  this.tipo = tipo;  }

    public void iniciarSessao(ArrayList<Pessoa> pessoas,Pessoa pessoa){
        String leitura;
        int opcao;
    }
}
