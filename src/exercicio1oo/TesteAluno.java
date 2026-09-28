package exercicio1oo;

class TesteAluno {
    private static final String MATRICULA = "2026001";
    private static final String NOME = "Hellen Brito";
    private static final int IDADE = 18;
    private static final int NOTA1 = 8;
    private static final int NOTA2 = 7;
    private static final int NOTA3 = 9;
    private static final int NOTA4 = 6;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.matricula = MATRICULA;
        aluno.nome = NOME;
        aluno.idade = IDADE;
        aluno.nota1 = NOTA1;
        aluno.nota2 = NOTA2;
        aluno.nota3 = NOTA3;
        aluno.nota4 = NOTA4;

        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Nota1: " + aluno.nota1);
        System.out.println("Nota2: " + aluno.nota2);
        System.out.println("Nota3: " + aluno.nota3);
        System.out.println("Nota4: " + aluno.nota4);
    }
}