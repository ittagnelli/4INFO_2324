import java.util.Scanner;

public class OperazioniMain {
    public static void main(String[] args) {
        Operazioni listManager = new Operazioni();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Operazioni disponibili:");
            System.out.println("1. Aggiungi un elemento in fondo");
            System.out.println("2. Visualizza le informazioni dell'elemento corrente");
            System.out.println("3. Vai avanti di uno");
            System.out.println("4. Vai indietro di uno");
            System.out.println("5. Elimina l'elemento corrente");
            System.out.println("6. Esci");

            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il valore da aggiungere ");
                    int value = scanner.nextInt();
                    listManager.aggiungiElementi(value);
                    break;
                case 2:
                    listManager.informazioni();
                    break;
                case 3:
                    listManager.avanti();
                    break;
                case 4:
                    listManager.indietro();
                    break;
                case 5:
                    listManager.elimina();
                    break;
                case 6:
                    System.out.println("Uscita dal programma");
                    return;
                default:
                    System.out.println("Scelta non corretta");
            }
        }
    }
}
