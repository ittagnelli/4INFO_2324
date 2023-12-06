class Libro {
    private String autore, titolo;
    private int numPagine, ISBN;

    Libro(String autore, String titolo, int numPagine, int ISBN){
        this.autore = autore;
        this.titolo = titolo;
        this.numPagine = numPagine;
        this.ISBN = ISBN;
    }

    public String getAutore() {
        return autore;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getISBN() {
        return ISBN;
    }

    public Boolean equals(Libro libro){
        return ISBN == libro.getISBN();
    }
}