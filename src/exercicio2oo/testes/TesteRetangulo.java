package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

public class TesteRetangulo {
    private static final double LARGURA = 5.0;
    private static final double ALTURA = 3.0;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.largura = LARGURA;
        retangulo.altura = ALTURA;

        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura: " + retangulo.altura);
    }
}