package br.edu.unicesumar;

public class Gerente extends Colaborador{
    @Override
    public int calcularFerias() {
        return super.calcularFerias() + 7;
    }
}
