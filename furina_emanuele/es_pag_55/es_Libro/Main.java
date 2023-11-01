import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Libro> listaLibri = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi libro");
            System.out.println("2. Clona lista di libri");
            System.out.println("3. Verifica se esiste un libro di un autore");
            System.out.println("4. Elimina libro per ISBN");
            System.out.println("5. Ordina libri per numero di pagine");
            System.out.println("6. Esci");

            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Nome dell'autore: ");
                    String autore = scanner.nextLine();
                    System.out.print("Titolo del libro: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Numero di pagine: ");
                    int numeroPagine = scanner.nextInt();
                    scanner.nextLine();
                    listaLibri.add(new Libro(autore, titolo, numeroPagine));
                    System.out.println("Libro aggiunto con successo.");
                    break;
                case 2:
                    LinkedList<Libro> listaClonata = Libro.clonaListaLibri(listaLibri);
                    System.out.println("Lista di libri clonata.");
                    break;
                case 3:
                    System.out.print("Nome dell'autore da cercare: ");
                    String autoreCercato = scanner.nextLine();
                    boolean esisteLibro = Libro.esisteLibroDellAutore(listaLibri, autoreCercato);
                    if (esisteLibro) {
                        System.out.println("Esiste almeno un libro dell'autore " + autoreCercato);
                    } else {
                        System.out.println("Nessun libro dell'autore " + autoreCercato);
                    }
                    break;
                case 4:
                    System.out.print("Codice ISBN da eliminare: ");
                    String isbnDaEliminare = scanner.nextLine();
                    Libro.eliminaLibroPerISBN(listaLibri, isbnDaEliminare);
                    System.out.println("Libro con ISBN " + isbnDaEliminare + " eliminato.");
                    break;
                case 5:
                    Libro.ordinaPerNumeroPagine(listaLibri);
                    System.out.println("Lista di libri ordinata per numero crescente di pagine.");
                    break;
                case 6:
                    System.out.println("Programma terminato.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}
