package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

public class TesteCirculo {
    private static final double RAIO = 4.5;

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = RAIO;

        System.out.println("Raio: " + circulo.raio);
    }
}
