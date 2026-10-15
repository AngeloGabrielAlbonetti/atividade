package br.edu.unicesumar;

import static java.lang.Math.pow;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        double v = Math.PI * pow(raio * 2);
        return v;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
