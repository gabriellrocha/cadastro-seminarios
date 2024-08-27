package exceptions;

public class InvalidCPFException extends RuntimeException {

    private static final String mensagemPadrao = "\nCPF inválido\nCadastro não pode ser realizado!";

    public InvalidCPFException() {
        super(mensagemPadrao);
    }
}
