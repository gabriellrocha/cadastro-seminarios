import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcao;

    public static void main(String[] args) {

        lerOpcao();



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
    }
}
