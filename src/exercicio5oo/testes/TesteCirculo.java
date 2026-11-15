package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TesteCirculo {
    private static final double RAIO = 4.5;

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(RAIO);

        System.out.printf("Raio: %.1f%n", circulo.getRaio());
        System.out.printf("Diametro: %.2f%n", circulo.calcularDiametro());
        System.out.printf("Perimetro: %.2f%n", circulo.calcularPerimetro());
        System.out.printf("Area: %.2f%n", circulo.calcularArea());
    }
}