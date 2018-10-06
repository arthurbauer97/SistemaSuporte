import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);


        ArrayList<Chamado> chamados = new ArrayList();
        ArrayList<Pessoa> pessoas = new ArrayList();


        int leitura;
        int opc;

        do {

            if (pessoas.size() == 0) {
                System.out.println("Digite 1- Cadastrar Gerente \n" + "2- Sair");
                opc = tc.nextInt();

                if (opc < 1 || opc > 2) {
                    System.out.println("Opção Invalida!");
                }

                switch (opc) {
                    case 1:
                        System.out.println("Nome:");
                        String nome = tc.next();

                        System.out.println("Telefone:");
                        String telefone = tc.next();

                        System.out.println("E-mail:");
                        String email = tc.next();

                        System.out.println("Login:");
                        String login = tc.next();

                        System.out.println("Senha:");
                        String senha = tc.next();

                        String tipo = "Gerente";

                        Pessoa gerente = new Gerente(nome, telefone, email, login, senha, tipo);
                        pessoas.add(gerente);

                        break;
                }
            } else {
                do {
                    System.out.println("1- Logar \n" + "2- Sair\n");
                    opc = tc.nextInt();

                    if (opc < 1 || opc > 2) {
                        System.out.println("Opção Invalida !");
                    }

                    switch (opc) {
                        case 1:
                            Pessoa pessoa = new Pessoa();
                            System.out.println("Login:");
                            String login = tc.next();

                            for (int i = 0; i < pessoas.size(); i++) {
                                if (login.equals(pessoas.get(i).getLogin())) {
                                    System.out.println("Senha:");
                                    String senha = tc.next();
                                    if (senha.equals(pessoas.get(i).getSenha())) {
                                        pessoa = pessoas.get(i);
                                        break;
                                    } else {
                                        System.out.println("Senha Incorreta !");
                                    }
                                }
                            }
                            if (pessoa.login == null) {
                                System.out.println("Usuário Inexistente!");
                            } else {
                                switch (pessoa.getTipo()) {
                                    case "Cliente":
                                        do {
                                            System.out.println("Usuário:" + pessoa.getNome() + " (" + pessoa.getTipo() + ")\n" +
                                                    "1- Novo Chamado \n" +
                                                    "2- Listar Chamado \n" +
                                                    "3- Editar Chamado \n" +
                                                    "4- Deletar Chamado \n" +
                                                    "5- Sair \n");
                                            opc = tc.nextInt();

                                            if (opc < 1 || opc > 5) {
                                                System.out.println("Opção Invalida!");
                                            }

                                            switch (opc) {
                                                case 1:
                                                    ArrayList<Funcionario> funcionarios = ((Funcionario) pessoa).getFuncionarios(pessoas);
                                                    Funcionario funcionario = ((Funcionario) pessoa).getFuncionarioChamado(funcionarios);
                                                    Chamado novoChamado = ((Cliente) pessoa).novoChamado((Cliente) pessoa, funcionario);
                                                    chamados.add(novoChamado);
                                                    break;
                                            }
                                        } while (opc != 5);
                                        break;
                                    case "Funcionario":
                                        do {
                                            System.out.println("Usuario: " + pessoa.getNome() + "(" + pessoa.getTipo() + ")\n\n" +
                                                    "1- Listar Chamados Pendentes  \n" +
                                                    "2- Listar Chamados Concluidos \n" +
                                                    "3- Finalizar Chamado \n" +
                                                    "4- Sair");
                                            opc = tc.nextInt();

                                            if (opc < 1 || opc > 4) {
                                                System.out.println("Opção Invalida!");
                                            }

                                        } while (opc != 4);
                                        break;
                                    case "Gerente":
                                        do {
                                            System.out.println("Usuário:" + pessoa.getNome() + "(" + pessoa.getTipo() + ")\n\n" +
                                                    "1- Manter Clientes\n" +
                                                    "2- Manter Funcionarios\n" +
                                                    "3- Manter Gerentes \n\n" +
                                                    "4- Editar Perfil \n\n" +
                                                    "5- Alterar Chamado \n\n " +
                                                    "6- Sair \n");
                                            opc = tc.nextInt();
                                            if (opc < 1 || opc > 6) {
                                                System.out.println("Opção Invalida !");
                                            }

                                            switch (opc) {
                                                case 1:
                                                    do {
                                                        System.out.println("Manter Clientes \n\n" +
                                                                "1- Cadastrar Clientes\n" +
                                                                "2- Remover Clientes\n" +
                                                                "3- Voltar \n");
                                                        if (opc < 1 || opc > 3) {
                                                            System.out.println("Opção Invalida!");
                                                        }
                                                        switch (opc) {
                                                            case 1:
                                                                Pessoa novaPessoa = ((Gerente) pessoa).cadastrarCli();
                                                                pessoas.add(novaPessoa);
                                                                System.out.println("Cliente Cadastrado com sucesso!");
                                                                break;

                                                            case 2:
                                                                System.out.println("Digite o nome do Cliente para deletar:");
                                                                String nomeCliente = tc.next();
                                                                Pessoa clienteDeletar = ((Gerente) pessoa).deletarPessoa(pessoas, nomeCliente, "Cliente");
                                                                if (pessoas.remove(clienteDeletar)) {
                                                                    System.out.println("Cliente deletado com sucesso !");
                                                                } else {
                                                                    System.out.println("Cliente não encontrado");
                                                                }
                                                                break;
                                                        }
                                                    } while (opc != 3);
                                                    break;
                                                case 2:
                                                    do {
                                                        System.out.println("Manter funcionario \n\n" +
                                                                "1- Cadastrar funcionario\n" +
                                                                "2- Remover Funcionarios\n" +
                                                                "3- Sair");
                                                        opc = tc.nextInt();
                                                        if (opc < 1 || opc > 6) {
                                                            System.out.println("Opção Invalida !");
                                                        }
                                                        switch (opc) {
                                                            case 1:
                                                                Pessoa novoUsuario = ((Gerente) pessoa).cadastrarFunc();
                                                                pessoas.add(novoUsuario);
                                                                System.out.println("Funcionario Cadastrado com sucesso!");
                                                                break;
                                                            case 2:
                                                                System.out.println("Digite o nome do Funcionario para deletar:");
                                                                String nomeFunc = tc.next();
                                                                Pessoa FuncionarioDeletar = ((Gerente) pessoa).deletarPessoa(pessoas, nomeFunc, "Funcionario");
                                                                if (pessoas.remove(FuncionarioDeletar)) {
                                                                    System.out.println("Funcionario deletado com sucesso !");
                                                                } else {
                                                                    System.out.println("Funcionario não encontrado");
                                                                }
                                                                break;
                                                        }
                                                    } while (opc != 3);
                                                    break;
                                                case 3:
                                                    do {
                                                        System.out.println("Manter Gerente \n\n" +
                                                                "1- Cadastrar Gerente\n" +
                                                                "2- Remover Gerente\n" +
                                                                "3- Voltar \n");
                                                        if (opc < 1 || opc > 3) {
                                                            System.out.println("Opção Invalida!");
                                                        }
                                                        switch (opc) {

                                                            case 1:
                                                                Pessoa novoGerente = ((Gerente) pessoa).cadastrarGerente();
                                                                pessoas.add(novoGerente);
                                                                System.out.println("Gerente Cadastrado com sucesso!");
                                                                break;

                                                            case 2:
                                                                System.out.println("Digite o nome do Gerente para deletar:");
                                                                String nomegerente = tc.next();
                                                                Pessoa gerenteDeletar = ((Gerente) pessoa).deletarPessoa(pessoas, nomegerente, "Gerente");
                                                                if (gerenteDeletar.equals(pessoa)) {
                                                                    System.out.println("Não pode deletar a si próprio");
                                                                } else {
                                                                    if (pessoas.remove(gerenteDeletar)) {
                                                                        System.out.println("Gerente deletado com sucesso !");
                                                                    } else {
                                                                        System.out.println("Gerente não encontrado");
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } while (opc != 3);
                                                    break;
                                                case 4:
                                                    if (((Gerente) pessoa).editarPessoa(pessoas, pessoa)) {
                                                        System.out.println("Dados editados com sucesso");
                                                    } else {
                                                        System.out.println("Erro ao editar");
                                                    }
                                                    break;
                                            }
                                        } while (opc != 6);
                                        break;
                                }
                                break;
                            }
                            break;
                    }
                } while (opc != 2);

            }
        } while (opc != 2);
    }
}


