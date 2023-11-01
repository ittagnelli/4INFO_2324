public class Libro{
    private String nomeAutore;
    private String nomeLibro;
    private int numeroPagina;
    private int isbn;

    public Libro(String nomeAutore, String nomeLibro, int numeroPagina, int isbn) {
        this.nomeAutore = nomeAutore;
        this.nomeLibro = nomeLibro;
        this.numeroPagina = numeroPagina;
        this.isbn = isbn;
    }

    public String getNomeAutore() {
        return nomeAutore;
    }
    
    public String getNomeLibro() {
        return nomeLibro;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public int getIsbn() {
        return isbn;
    }
}
