import javafx.scene.effect.InnerShadow;

import java.util.Scanner;

public class Cliente extends Pessoa {

    protected Cliente(String nome, String telefone, String email, String login, String senha, String tipo) {
        super(nome, telefone, email, login, senha, tipo);
    }

    Scanner tc = new Scanner(System.in);

    protected Chamado novoChamado(Cliente cliente, Funcionario funcionario) {
        System.out.println("Informe o problema: ");
        String descricaoProblema = tc.next();

        System.out.println("Digite 1: Urgente \n" + "2- Alta\n" + "3- Moderada\n" + "4- Baixa");
        String leitura = tc.next();

        int prioridade = Integer.parseInt(leitura);
        Chamado chamado = new Chamado(descricaoProblema, prioridade,cliente, funcionario);
        return chamado;
    }

    protected void listarChamados(String login){

    }

}
