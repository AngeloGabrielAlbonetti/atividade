package br.edu.unicesumar;

public abstract class Veiculo {
    private String marca;
    private String modelo;


    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public double caucularpedagio(){
        return 10.50;
    }
}
