package br.edu.unicesumar;

public class Gerente2 extends Funcionario{
    public Gerente2(double salario) {
        super(salario);
    }

    @Override
    public double getBonus() {
        return super.getBonus() + 1000.00;
    }
}
