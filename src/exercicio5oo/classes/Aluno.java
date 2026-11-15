package exercicio5oo.classes;

public class Aluno {
    private static final int QUANTIDADE_NOTAS = 4;
    private static final double MEDIA_APROVACAO = 7.0;
    private static final String APROVADO = "Aprovado";
    private static final String REPROVADO = "Reprovado";

    private String matricula;
    private String nome;
    private int idade;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / (double) QUANTIDADE_NOTAS;
    }

    public void imprimirSituacao() {
        if (this.calcularMedia() >= MEDIA_APROVACAO) {
            System.out.printf("Situacao: %s%n", APROVADO);
        } else {
            System.out.printf("Situacao: %s%n", REPROVADO);
        }
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota1() {
        return this.nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return this.nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return this.nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return this.nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }
}