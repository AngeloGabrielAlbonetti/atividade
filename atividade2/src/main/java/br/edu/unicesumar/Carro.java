package br.edu.unicesumar;

public class Carro extends Veiculo{

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double caucularpedagio() {
        return 12.00;
    }
}
