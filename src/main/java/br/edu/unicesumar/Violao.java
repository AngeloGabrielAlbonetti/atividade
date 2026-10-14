package br.edu.unicesumar;

public class Violao extends InstrumentoMusical{
    @Override
    public void tocar() {
        System.out.printf("Soando cordas de nylon...");
    }
}
