package br.com.avantews;

import br.com.avantews.entity.Pessoa;

public class Application {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.getNome();
        pessoa.getIdade();
        pessoa.getSexo();
    }
}
