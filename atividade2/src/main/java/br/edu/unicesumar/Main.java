// o diagrama esta na pasta resources

package br.edu.unicesumar;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Volvo", "165");
        Moto moto = new Moto("Honda", "160");
        System.out.println(carro.caucularpedagio());
        System.out.println(moto.caucularpedagio());

        Cachorro cachorro = new Cachorro("nome");
        Gato gato = new Gato("nome");
        cachorro.emitirSom();
        gato.emitirSom();

        Circulo circulo  = new Circulo(12);
        Quadrado quadrado = new Quadrado(2, 2);
        System.out.printf("\n %.2f\n", circulo.calcularArea());
        System.out.printf("\n %.2f\n", quadrado.calcularArea());


    }
    }

