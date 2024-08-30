package dominio;

public class Endereco {

    private String cidade;
    private String logadouro;
    private Integer numero;

    public Endereco(String cidade, String logadouro, Integer numero) {
        this.cidade = cidade;
        this.logadouro = logadouro;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
