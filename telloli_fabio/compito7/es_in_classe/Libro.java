package es_in_classe;
public class Libro {
    private String autore;
    private String nome;
    private int npag;
    private String isbn;

    public Libro(String autore, String nome, int npag, String isbn) {
        this.autore = autore;
        this.nome = nome;
        this.npag = npag;
        this.isbn = isbn;
    }

    public String getAutore() {
        return autore;
    }

    public String getNome() {
        return nome;
    }

    public int getNpag() {
        return npag;
    } 

    public String getIsbn() {
        return isbn;
    }
}
