package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

public class TesteCarro {
    private static final String MODELO = "Civic";
    private static final String MARCA = "Honda";
    private static final int ANO = 2023;
    private static final double VELOCIDADE = 0.0;

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo(MODELO);
        carro.setMarca(MARCA);
        carro.setAno(ANO);
        carro.setVelocidade(VELOCIDADE);

        System.out.printf("Modelo: %s%n", carro.getModelo());
        System.out.printf("Marca: %s%n", carro.getMarca());
        System.out.printf("Ano: %d%n", carro.getAno());
        carro.imprimirVelocidade();

        carro.acelerar();
        carro.acelerar();
        System.out.println("Apos acelerar duas vezes:");
        carro.imprimirVelocidade();

        carro.frear();
        System.out.println("Apos frear uma vez:");
        carro.imprimirVelocidade();
    }
}