package br.edu.unicesumar;

public abstract class Conta {
    private double saldo;
    private String titular;

    public Conta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void calcularTaxas();

}
