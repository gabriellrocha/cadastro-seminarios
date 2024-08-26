package dominio;


import exceptions.InvalidCPFException;

import java.util.Objects;

public class Aluno {

    private String nome;
    private Integer idade;
    private String cpf;

    public Aluno(String nome, Integer idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        if (!isValidCPF(cpf)){
            throw new InvalidCPFException();
        }
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(cpf, aluno.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    public boolean isValidCPF(String cpf) {
        return cpf != null && cpf.length() == 11 && cpf.matches("\\d{11}");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

}
