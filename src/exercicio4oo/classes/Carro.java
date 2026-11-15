package exercicio4oo.classes;

public class Carro {
    private static final double VARIACAO_VELOCIDADE = 10.0;

    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public void acelerar() {
        this.velocidade += VARIACAO_VELOCIDADE;
    }

    public void frear() {
        this.velocidade -= VARIACAO_VELOCIDADE;
    }

    public void imprimirVelocidade() {
        System.out.printf("Velocidade atual: %.1f km/h%n", this.velocidade);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}