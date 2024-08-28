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

    public void imprimir() {

        System.out.println("\nTítulo: " + titulo);
        System.out.println("\nLocal: " + endereco.getLogadouro() + " " + endereco.getNumero() + " " + endereco.getCidade());

        if (professores.isEmpty()) {
            System.out.println("\nNenhum professor confirmado até o momento");
        } else {
            System.out.println("\nProfessores ministrantes: ");
            for (Professor prof : professores) {
                System.out.println(prof.getNome() + " Especialidade -> " + prof.getEspecialidade().toString().replace('_', ' '));
            }
        }

        if (alunos.isEmpty()) {
            System.out.println("\nNenhum aluno(a) confirmado até o momento");
        } else {
            System.out.println("\nAlunos(as) já confirmados: ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome() + " Idade: " + aluno.getIdade());
            }
        }
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
