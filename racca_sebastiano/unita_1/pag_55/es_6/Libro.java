public class Libro {
    private String isbn;
    private String nome;
    private String autore;
    private int pagine;
    private float prezzo;


    Libro(String isbn, String nome, String autore, int numeroPagine, float prezzo) {
        this.isbn = isbn;
        this.nome = nome;
        this.autore = autore;
        this.pagine = numeroPagine;
        this.prezzo = prezzo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNome() {
        return nome;
    }

    public String getAutore() {
        return autore;
    }

    public int getPagine() {
        return pagine;
    }

    public float getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return this.getNome() + ":" +
            "\n\tISBN: " + this.getIsbn() +
            "\n\tAutore: " + this.getAutore() +
            "\n\tPrezzo: €" + this.getPrezzo() +
            "\n\tPagine: " + this.getPagine()
        ;
    }
}