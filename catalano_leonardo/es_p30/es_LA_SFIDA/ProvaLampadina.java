import java.util.Scanner;

public class ProvaLampadina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci il  massimo di click: ");
        int valoreContatore = scanner.nextInt();

        Lampadina lampadina = new Lampadina(valoreContatore);

        System.out.println("stato di inizio: " + lampadina);

        while (lampadina.getStato() != Lampadina.ROTTA) {
            lampadina.click();
            System.out.println("stato di adesso: " + lampadina);
        }

        scanner.close();
    }
}
