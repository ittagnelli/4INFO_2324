import java.util.LinkedList;

public class Libro {
    private String autore;
    private String titolo;
    private int numeroPagine;

    public Libro(String autore, String titolo, int numeroPagine) {
        this.autore = autore;
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public static LinkedList<Libro> clonaListaLibri(LinkedList<Libro> listaOriginale) {
        LinkedList<Libro> listaClonata = new LinkedList<>();
        for (Libro libro : listaOriginale) {
            listaClonata.add(new Libro(libro.getAutore(), libro.getTitolo(), libro.getNumeroPagine()));
        }
        return listaClonata;
    }

    public static boolean esisteLibroDellAutore(LinkedList<Libro> listaLibri, String autoreCercato) {
        for (Libro libro : listaLibri) {
            if (libro.getAutore().equals(autoreCercato)) {
                return true;
            }
        }
        return false;
    }

    public static void eliminaLibroPerISBN(LinkedList<Libro> listaLibri, String isbnDaEliminare) {
        Libro libroDaEliminare = null;
        for (Libro libro : listaLibri) {
            if (isbnDaEliminare.equals(generaISBN(libro))) {
                libroDaEliminare = libro;
                break;
            }
        }
        if (libroDaEliminare != null) {
            listaLibri.remove(libroDaEliminare);
        }
    }

    private static String generaISBN(Libro libro) {
        return libro.getAutore().hashCode() + "-" + libro.getTitolo().hashCode();
    }

    public static void ordinaPerNumeroPagine(LinkedList<Libro> listaLibri) {
        listaLibri.sort((libro1, libro2) -> libro1.getNumeroPagine() - libro2.getNumeroPagine());
    }
}
