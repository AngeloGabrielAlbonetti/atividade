package br.edu.unicesumar;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public void calcularTaxas() {
        System.out.printf("nao tem taxa\n");
    }

}
