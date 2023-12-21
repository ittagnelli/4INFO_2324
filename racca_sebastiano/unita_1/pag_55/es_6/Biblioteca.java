import java.util.Arrays;
import java.util.Comparator;

public class Biblioteca {
    private Libro[] libri;
    private int numeroLibri;

    public Biblioteca() {
        this.libri = new Libro[10];
        this.numeroLibri = 0;
    }

    public Biblioteca(Libro[] libri) {
        this.libri = Arrays.copyOf(libri, libri.length);
        this.numeroLibri = libri.length;
    }

    public void aggiungi(Libro libro) {
        if (esiste(libro))
            throw new RuntimeException("Il libro esiste già nella libreria.");

        if (numeroLibri == libri.length) {
            libri = Arrays.copyOf(libri, libri.length * 2);
        }

        libri[numeroLibri++] = libro;
    }

    public Biblioteca cercaAutore(String autore) {
        Biblioteca libriAutore = new Biblioteca();

        for (Libro current : libri) {
            if (current != null && current.getAutore().equals(autore)) {
                libriAutore.aggiungi(current);
            }
        }

        return libriAutore;
    }

    public Libro cercaNome(String nome) {
        for (Libro current : libri) {
            if (current != null && current.getNome().equals(nome)) {
                return current;
            }
        }

        return null;
    }

    public void ordinaCrescente() {
        Arrays.sort(libri, new Comparator<Libro>() {
            @Override
            public int compare(Libro l1, Libro l2) {
                if(l1 == null || l2 == null)
                    return 0;
                return Integer.compare(l1.getPagine(), l2.getPagine());
            }
        });
    }

    public boolean esiste(Libro libro) {
        for (Libro current : libri) {
            if (current != null && current.getIsbn().equals(libro.getIsbn())) {
                return true;
            }
        }

        return false;
    }

    public void elimina(Libro libro) {
        if (!esiste(libro))
            throw new RuntimeException("Il libro non esiste nella libreria.");

        for (int i = 0; i < libri.length; i++) {
            if (libri[i] != null && libri[i].getIsbn().equals(libro.getIsbn())) {
                libri[i] = null;
                numeroLibri--;
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Libreria:");

        for (Libro libro : libri) {
            if (libro != null) {
                str.append("\n").append(libro.toString());
            }
        }

        return str.toString();
    }
}
