package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

public class TesteAluno {
    private static final String TITULO_APROVADO = "ALUNO 1 (esperado: aprovado)";
    private static final String TITULO_REPROVADO = "ALUNO 2 (esperado: reprovado)";

    private static final String MATRICULA_1 = "2026001";
    private static final String NOME_1 = "Hellen Brito";
    private static final int IDADE_1 = 18;
    private static final int NOTA1_1 = 8;
    private static final int NOTA2_1 = 7;
    private static final int NOTA3_1 = 9;
    private static final int NOTA4_1 = 6;

    private static final String MATRICULA_2 = "2026002";
    private static final String NOME_2 = "Maria Souza";
    private static final int IDADE_2 = 19;
    private static final int NOTA1_2 = 4;
    private static final int NOTA2_2 = 5;
    private static final int NOTA3_2 = 3;
    private static final int NOTA4_2 = 6;

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(MATRICULA_1);
        aluno1.setNome(NOME_1);
        aluno1.setIdade(IDADE_1);
        aluno1.setNota1(NOTA1_1);
        aluno1.setNota2(NOTA2_1);
        aluno1.setNota3(NOTA3_1);
        aluno1.setNota4(NOTA4_1);

        Aluno aluno2 = new Aluno();
        aluno2.setMatricula(MATRICULA_2);
        aluno2.setNome(NOME_2);
        aluno2.setIdade(IDADE_2);
        aluno2.setNota1(NOTA1_2);
        aluno2.setNota2(NOTA2_2);
        aluno2.setNota3(NOTA3_2);
        aluno2.setNota4(NOTA4_2);

        imprimirAluno(TITULO_APROVADO, aluno1);
        imprimirAluno(TITULO_REPROVADO, aluno2);
    }

    private static void imprimirAluno(String titulo, Aluno aluno) {
        System.out.printf("===== %s =====%n", titulo);
        System.out.printf("Matricula: %s%n", aluno.getMatricula());
        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Idade: %d%n", aluno.getIdade());
        System.out.printf("Notas: %d, %d, %d, %d%n",
                aluno.getNota1(), aluno.getNota2(), aluno.getNota3(), aluno.getNota4());
        System.out.printf("Media: %.2f%n", aluno.calcularMedia());
        aluno.imprimirSituacao();
        System.out.printf("%n");
    }
}