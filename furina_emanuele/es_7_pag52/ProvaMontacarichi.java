import java.util.Scanner;

public class ProvaMontacarichi {
    public static void main(String[] args) {
        Montacarichi ascensore = new Montacarichi();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Piano corrente: " + ascensore.getPianoCorrente());
            System.out.println("Piani prenotati: " + ascensore.getPianiPrenotati());
            System.out.print("Inserisci il piano da prenotare (1-10), -1 per uscire: ");
            int input = scanner.nextInt();
            
            if (input == -1) {
                System.out.println("Arrivederci!");
                break;
            }
            
            ascensore.prenotaPiano(input);
        }
        ascensore.eseguiMovimentoAscensore();
        scanner.close();
    }
}
