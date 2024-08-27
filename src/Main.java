import dominio.Aluno;
import dominio.Endereco;
import dominio.Seminario;
import exceptions.InvalidCPFException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcao;

    private static final List<Seminario> seminarios = new ArrayList<>();

    public static void main(String[] args) {

            while (Main.opcao != 5) {

                lerOpcao();

                try {
                    switch (opcao) {
                        case 1:
                            seminarios.add(novoSeminario());
                            System.out.println("\nCADASTRADO COM SUCESSO!");
                            break;
                        case 2:
                            System.out.println("Excluir seminario");
                            break;
                        case 3:
                            imprimirSeminarios();
                            break;
                        case 4:
                            novoAluno();
                            break;
                        case 5:
                            System.out.println("Fechando programa");
                            break;
                    }
                } catch (InvalidCPFException e) {
                    System.out.println(e.getMessage());
                }
            }
    }

    static void exibirOpcoes() {

        System.out.print(
                "\n1 - Cadastrar novo seminário" +
                "\n2 - Excluir seminário" +
                "\n3 - Visualizar todos seminário" +
                "\n4 - Cadastrar novo aluno" +
                "\n5 - Encerrar" +
                "\n---------------------------------------" +
                "\nINFORME O NÚMERO DA OPÇÃO DESEJADA: ");
    }

    static void lerOpcao(){

        boolean isValid = false;

        while (!isValid) {

            try {
                exibirOpcoes();
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > 5) {
                    System.out.println("\nOPÇÃO INVÁLIDA. Por favor, informe uma opção dentre as sugeridas");
                } else {
                    isValid = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("\nENTRADA INVÁLIDA. Por favor, informe um número");
                scanner.nextLine();
            }
        }

        scanner.nextLine();
    }

    private static Seminario novoSeminario() {
        System.out.println("\n\t\tNOVO SEMINÁRIO");
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        return new Seminario(titulo, cadastrarNovoEndereco());
    }

    private static Endereco cadastrarNovoEndereco() {

        boolean isValid = false;
        Integer numero = null;

        System.out.println("\t\tENDEREÇO");
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Logadouro: ");
        String logadouro = scanner.nextLine();

        while (!isValid) {
            try {
                System.out.print("Número: ");
                numero = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Número inválido. Por favor, informe número correto.");
            }
        }

        return new Endereco(cidade, logadouro, numero);
    }

    private static void novoAluno() throws InvalidCPFException {

        boolean isValid = false;
        Integer idade = null;
        Seminario seminario = null;

        while (seminario == null) {
            if(!imprimirSeminarios()){
               return;
            }

            System.out.print("INFORME O NÚMERO DO SEMINÁRIO QUE O ALUNO PARTICIPARÁ: ");
            Integer idSeminario = scanner.nextInt();

            seminario = hasSeminario(idSeminario);
        }

        System.out.println("\t\tNOVO ALUNO");

        System.out.print("CPF (Apenas número): ");
        String cpf = scanner.nextLine();

        if(alunoJaParticipa(cpf)) {
            return;
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        while (!isValid) {
            try {
                System.out.print("Idade: ");
                idade = scanner.nextInt();
                isValid = true;
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Idade inválida.");
            }
        }

        seminario.setAluno(new Aluno(nome, idade, cpf));
        System.out.println("Aluno adicionado com sucesso!");
    }

    private static boolean imprimirSeminarios() {
        System.out.println();
        if (Main.seminarios.isEmpty()) {
            System.out.println("NENHUM SEMINÁRIO DISPONÍVEL"); return false;
        }

        for (Seminario seminario : Main.seminarios) {
            System.out.println(seminario.getId() + " - " + "Título: " + seminario.getTitulo());
        }
        return true;
    }

    private static Seminario hasSeminario(Integer id) {
        scanner.nextLine();
        for (Seminario seminario : Main.seminarios) {
            if (seminario.getId().equals(id)) {
              return seminario;
            }
        }

        System.out.println("Seminário não existe!");
        return null;
    }

    private static boolean alunoJaParticipa(String cpf) {
        for (Seminario seminario : Main.seminarios) {
            for(Aluno aluno : seminario.getAlunos()) {
                if (aluno.getCpf().equals(cpf)) {
                    System.out.println("CPF já consta em outro seminário!");
                    return true;
                }
            }
        }
        return false;
    }
}
