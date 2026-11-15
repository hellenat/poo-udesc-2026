package exercicio5oo.classes;

public class Retangulo {
    private double largura;
    private double altura;

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}