package dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Seminario {

    private static int contadorId;

    private final Integer id;
    private String titulo;
    private Endereco endereco;
    private final Set<Aluno> alunos = new HashSet<>();
    private final List<Professor> professores = new ArrayList<>();

    public Seminario(String titulo, Endereco endereco) {
        this.id = ++contadorId;
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
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

    public void setAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessor(Professor professor) {
        professores.add(professor);
        professor.getSeminarios().add(this);
    }
}
