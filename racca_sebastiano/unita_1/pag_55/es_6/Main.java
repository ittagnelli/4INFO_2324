public class Main {
    public static void main(String[] args) {
        Libro[] libri = {
            new Libro("abc123", "Nome1", "Autore1", 10, (float)10.50),
            new Libro("def456", "Nome2", "Autore2", 20, (float)12.00),
            new Libro("ghi789", "Nome3", "Autore2", 20, (float)12.00)
        };

        Biblioteca bib = new Biblioteca(libri);

        bib.aggiungi(new Libro("jkl101", "Nome4", "Autore3", 100, (float)15.50));

        System.out.println(bib);

        System.out.println("\n\nRicerca per nome d'autore:\n" + bib.cercaAutore("Autore2"));

        System.out.println("\n\nRicerca per nome del libro:\n" + bib.cercaNome("Nome1"));

        bib.ordinaCrescente();
        System.out.println("\n\nBiblioteca ordinata:\n" + bib);
    }
}
