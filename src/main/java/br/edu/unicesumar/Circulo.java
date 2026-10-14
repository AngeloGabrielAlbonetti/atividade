package br.edu.unicesumar;

public class Circulo extends FormaGeometrica{
    private double raio;
    private double raio2;

    public Circulo(double raio, double raio2) {
        this.raio = raio;
        this.raio2 = raio2;
    }


    @Override
    public double calcularArea() {
        return (Math.PI* raio *raio2);
    }
}
