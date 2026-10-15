package br.edu.unicesumar;

public class ContaCorrente extends Conta{
    public ContaCorrente(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public void calcularTaxas() {
        System.out.println(getSaldo() - 15.00);
    }
}
