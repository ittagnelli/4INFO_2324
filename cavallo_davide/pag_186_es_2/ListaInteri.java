import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListaInteri {

    public static void main(String[] args) {
        List<Integer> listaInteri = new ArrayList<>();
        ListIterator<Integer> iterator = listaInteri.listIterator();

        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("1. Aggiungi elemento in fondo");
            System.out.println("2. Visualizza informazioni dell'elemento corrente");
            System.out.println("3. Avanti di uno");
            System.out.println("4. Indietro di uno");
            System.out.println("5. Elimina elemento corrente");
            System.out.println("0. Esci");

            System.out.print("Inserisci la tua scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci un intero da aggiungere: ");
                    int nuovoElemento = scanner.nextInt();
                    listaInteri.add(nuovoElemento);
                    break;
                case 2:
                    if (iterator.hasNext()) {
                        System.out.println("Elemento corrente: " + iterator.next());
                    } else {
                        System.out.println("Nessun elemento corrente.");
                    }
                    break;
                case 3:
                    if (iterator.hasNext()) {
                        iterator.next();
                    } else {
                        System.out.println("Sei già all'ultimo elemento.");
                    }
                    break;
                case 4:
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    } else {
                        System.out.println("Sei già al primo elemento.");
                    }
                    break;
                case 5:
                    if (iterator.hasNext()) {
                        iterator.remove();
                        System.out.println("Elemento corrente eliminato.");
                    } else {
                        System.out.println("Nessun elemento corrente da eliminare.");
                    }
                    break;
            }

        } while (scelta != 0);

        System.out.println("Programma terminato.");

        scanner.close();
    }
}
