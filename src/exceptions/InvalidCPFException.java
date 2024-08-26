package exceptions;

public class InvalidCPFException extends RuntimeException {

    private static final String mensagemPadrao = "CPF inválido";

    public InvalidCPFException() {
        super(mensagemPadrao);
    }
}
