package exercicio4oo.classes;

public class Circulo {
    private static final int FATOR_DIAMETRO = 2;

    private double raio;

    public double calcularDiametro() {
        return FATOR_DIAMETRO * this.raio;
    }

    public double calcularPerimetro() {
        return FATOR_DIAMETRO * Math.PI * this.raio;
    }

    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}