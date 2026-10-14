package br.edu.unicesumar;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double caucularpedagio() {
        return 6.00;
    }
}
