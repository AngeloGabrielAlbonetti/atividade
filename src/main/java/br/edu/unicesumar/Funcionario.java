package br.edu.unicesumar;

public class Funcionario {
private double salario;
    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return (salario *0.5)+ salario;
    }
}
