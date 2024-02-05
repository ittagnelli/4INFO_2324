import java.util.ArrayList;
import java.util.Scanner;

public class InserisciMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeri = new ArrayList<>();

        System.out.println("Inserisci numeri, Inserisci 0 per terminare");

        int input;
        do {
            input = scanner.nextInt();
            if (input != 0) {
                numeri.add(input);
            }
        } while (input != 0);

        System.out.println("Inserisci un  numero intero per togliere i multipli");
        int n = scanner.nextInt();

        InserisciInteri processor = new InserisciInteri();
        processor.rimuovi(numeri, n);

        System.out.println("Lista dopo la rimozione");
        for (int num : numeri) {
            System.out.print(num + " ");
        }
    }
}
