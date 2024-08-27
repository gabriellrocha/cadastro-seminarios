import dominio.Endereco;
import dominio.Seminario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcao;

    private static final List<Seminario> seminarios = new ArrayList<>();

    public static void main(String[] args) {

        while (Main.opcao != 4) {

            lerOpcao();

            switch (opcao) {
                case 1:
                    seminarios.add(novoSeminario());
                    break;
                case 2:
                    System.out.println("Excluir seminario");
                    break;
                case 3:
                    System.out.println("Visualizar seminários");
                    break;
                case 4:
                    System.out.println("Fechando programa");
                    break;
            }
        }
    }

    static void exibirOpcoes() {

        System.out.print(
                "\n1 - Cadastrar novo seminário" +
                "\n2 - Excluir seminário" +
                "\n3 - Visualizar seminário" +
                "\n4 - Encerrar" +
                "\nInforme o número da opção desejada: ");
    }

    static void lerOpcao(){

        boolean isValid = false;

        while (!isValid) {

            try {
                exibirOpcoes();
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > 4) {
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
        System.out.println("\tNOVO SEMINÁRIO");
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

       return new Seminario(titulo, cadastrarNovoEndereco());
    }

    private static Endereco cadastrarNovoEndereco() {

        boolean isValid = false;
        Integer numero = null;

        System.out.println("--------Endereço----------");
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

}
