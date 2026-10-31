package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TesteRetangulo {
    private static final double LARGURA = 5.0;
    private static final double ALTURA = 3.0;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(LARGURA);
        retangulo.setAltura(ALTURA);

        System.out.printf("Largura: %.1f%n", retangulo.getLargura());
        System.out.printf("Altura: %.1f%n", retangulo.getAltura());
    }
}