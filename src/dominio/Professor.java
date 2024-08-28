package dominio;

import enums.ESPECIALIDADE;

import java.util.HashSet;
import java.util.Set;

public class Professor {

    private String nome;
    private ESPECIALIDADE especialidade;
    private final Set<Seminario> seminarios = new HashSet<>();

    public Professor(String nome, ESPECIALIDADE especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ESPECIALIDADE getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(ESPECIALIDADE especialidade) {
        this.especialidade = especialidade;
    }

    public Set<Seminario> getSeminarios() {
        return seminarios;
    }
}
