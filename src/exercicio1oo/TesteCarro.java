package exercicio1oo;

class TesteCarro {
    private static final String MODELO = "Civic";
    private static final String MARCA = "Honda";
    private static final int ANO = 2023;
    private static final double VELOCIDADE = 0.0;

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = MODELO;
        carro.marca = MARCA;
        carro.ano = ANO;
        carro.velocidade = VELOCIDADE;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade: " + carro.velocidade);
    }
}