public class provaLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("alberto", "compostella", 30);
        Libro l2 = new Libro("riccardo", "girone", 20);

        Libro[] lib = {l1, l2};

        Libreria l = new Libreria(lib, 2);

        l.stampa();
        System.out.println("\n" + l.controlloAutore("compostella"));
        l.ordina();
        l.stampa();
        l.cancella(0);
        l.stampa();
    }
}
