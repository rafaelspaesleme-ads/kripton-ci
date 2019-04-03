package br.com.avantews.entity;

public class Pessoa {
    
    private String nome;
    private String idade;
    private String sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, String idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}