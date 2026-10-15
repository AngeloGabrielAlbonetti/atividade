package br.edu.unicesumar;

public abstract class Animal {
    private String nome;
    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("Qual animal");
    }
}
