package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TesteLivro {
    private static final String TITULO = "Dom Casmurro";
    private static final String AUTOR = "Machado de Assis";
    private static final String GENERO = "Romance";
    private static final boolean EMPRESTADO = false;

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo(TITULO);
        livro.setAutor(AUTOR);
        livro.setGenero(GENERO);
        livro.setEmprestado(EMPRESTADO);

        System.out.printf("Titulo: %s%n", livro.getTitulo());
        System.out.printf("Autor: %s%n", livro.getAutor());
        System.out.printf("Genero: %s%n", livro.getGenero());
        System.out.printf("Emprestado: %b%n", livro.isEmprestado());
    }
}