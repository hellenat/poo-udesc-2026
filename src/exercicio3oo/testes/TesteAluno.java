package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TesteAluno {
    private static final String MATRICULA = "2026001";
    private static final String NOME = "Hellen Brito";
    private static final int IDADE = 18;
    private static final int NOTA1 = 8;
    private static final int NOTA2 = 7;
    private static final int NOTA3 = 9;
    private static final int NOTA4 = 6;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setMatricula(MATRICULA);
        aluno.setNome(NOME);
        aluno.setIdade(IDADE);
        aluno.setNota1(NOTA1);
        aluno.setNota2(NOTA2);
        aluno.setNota3(NOTA3);
        aluno.setNota4(NOTA4);

        System.out.printf("Matricula: %s%n", aluno.getMatricula());
        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Idade: %d%n", aluno.getIdade());
        System.out.printf("Nota1: %d%n", aluno.getNota1());
        System.out.printf("Nota2: %d%n", aluno.getNota2());
        System.out.printf("Nota3: %d%n", aluno.getNota3());
        System.out.printf("Nota4: %d%n", aluno.getNota4());
    }
}