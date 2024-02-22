import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringa;
        Espressioni espressioni = new Espressioni();

        stringa = scanner.nextLine();

        espressioni.inserisciStringa(stringa);
        espressioni.dividiStringa(stringa);
        espressioni.stampaStringa();
    }
}
