public class ProvaLibro {
    public static void main(String[] args) {
        Libro2 l1 = new Libro2("rocco", "rodeo", 444);
        Libro2 l2 = new Libro2("gigio", "zanna rossa", 302);

        Libro2[] lib = {l1, l2};

        Biblioteca l = new Biblioteca(lib, 6);

        l.stampa();
        System.out.println("\n" + l.controlloAutore("augusto"));
         l.stampa();
        l.ordina();
        l.cancella(0);
        l.stampa();
    }
}
