public class CD {
    private String titolo;
    private Artista artista;
    private Genere genere;

    public CD(String titolo, Artista artista, Genere genere) {
        this.titolo = titolo;
        this.artista = artista;
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public Artista getArtista() {
        return artista;
    }

    public Genere getGenere() {
        return genere;
    }
}
