package br.edu.unicesumar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Volvo", "165"));
        veiculos.add(new Moto("Honda", "160"));
        for (Veiculo veiculo: veiculos){
            System.out.printf("\n%.2f", veiculo.caucularpedagio());
        }


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cachorro("nome"));
        animals.add(new Gato("nome"));
        for (Animal animal: animals){
            animal.emitirSom();
        }

        FormaGeometrica[] formaGeometricas = new FormaGeometrica[2];
            formaGeometricas[0] = new Circulo(12,12);
            formaGeometricas[1] = new Quadrado(2, 2);

        for (int i = 0; i < 2; i++) {
            System.out.printf("\n %.2f\n", formaGeometricas[i].calcularArea());
        }

        Gerente gerente = new Gerente();
        System.out.println(gerente.calcularFerias());


        ArrayList<Personagem> personagems = new ArrayList<>();
        personagems.add(new Guerreiro());
        personagems.add(new Mago());

        for (Personagem personagem: personagems){
            personagem.atacar();
        }


        ArrayList<InstrumentoMusical> instrumentoMusicals = new ArrayList<>();
        instrumentoMusicals.add(new Piano());
        instrumentoMusicals.add(new Bateria());
        instrumentoMusicals.add(new Violao());

        for (InstrumentoMusical instrumentoMusical: instrumentoMusicals){
            instrumentoMusical.tocar();
        }

        Funcionario funcionario = new Funcionario(1200);
        System.out.println(funcionario.getBonus());
        Gerente2 gerente2 = new Gerente2(2000);
        System.out.println(gerente2.getBonus());

    }
    }

