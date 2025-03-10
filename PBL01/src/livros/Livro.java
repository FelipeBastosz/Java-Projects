package livros;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private String isbn;
    private String anoPublicacao;
    private String genero;
    private boolean possui;

    public Livro(String titulo, String autor, String editora, String isbn, String anoPublicacao, String genero, boolean possui){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.possui = possui;
    }

    public String toString(){
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nEditora: " + editora + "\nISBN: " + isbn + "\nAno de publicação: " + anoPublicacao +
                "\nGênero: " + genero + "\nPossui exemplar: " + (possui ? "Sim\n\n\n" : "Não\n\n\n");
    }
}
