import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int currentIdx = -1;

        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Operazioni disponibili:");
            System.out.println("1. Aggiungi un elemento in fondo");
            System.out.println("2. Visualizza le informazioni dell'elemento corrente");
            System.out.println("3. Vai avanti di uno");
            System.out.println("4. Vai indietro di uno");
            System.out.println("5. Elimina l'elemento corrente");
            System.out.println("0. Esci");

            System.out.print("Scelta: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Inserisci il valore dell'elemento da aggiungere: ");
                    int value = scanner.nextInt();
                    lista.add(value);
                    break;
                case 2:
                    if (currentIdx >= 0 && currentIdx < lista.size()) {
                        System.out.println("Elemento corrente: " + lista.get(currentIdx));
                    } else {
                        System.out.println("Nessun elemento corrente.");
                    }
                    break;
                case 3:
                    if (currentIdx < lista.size() - 1) {
                        currentIdx++;
                    } else {
                        System.out.println("Non ci sono più elementi dopo questo.");
                    }
                    break;
                case 4:
                    if (currentIdx > 0) {
                        currentIdx--;
                    } else {
                        System.out.println("Non ci sono più elementi prima di questo.");
                    }
                    break;
                case 5:
                    if (currentIdx >= 0 && currentIdx < lista.size()) {
                        lista.remove(currentIdx);
                        if (currentIdx == lista.size()) {
                            currentIdx--;
                        }
                    } else {
                        System.out.println("Nessun elemento da eliminare.");
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }

        System.out.println("Programma terminato.");
        scanner.close();
    }
}