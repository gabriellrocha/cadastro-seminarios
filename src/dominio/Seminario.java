package dominio;

import java.util.HashSet;
import java.util.Set;

public class Seminario {

    private String titulo;
    private Endereco endereco;
    private final Set<Aluno> alunos = new HashSet<>();

    public Seminario(String titulo, Endereco endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }
}
