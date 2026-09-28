package exercicio1oo;

class TesteLivro {
    private static final String TITULO = "Dom Casmurro";
    private static final String AUTOR = "Machado de Assis";
    private static final String GENERO = "Romance";
    private static final boolean EMPRESTADO = false;

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = TITULO;
        livro.autor = AUTOR;
        livro.genero = GENERO;
        livro.emprestado = EMPRESTADO;

        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Genero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);
    }
}