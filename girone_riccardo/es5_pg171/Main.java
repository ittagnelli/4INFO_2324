import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Inserisci una sequenza di 10 numeri terminanti con 0: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " " + "inserisci il numero terminante per 0 : ");
            int numeroInserito = scanner.nextInt();
            list.add(numeroInserito);
        }
        scanner.close();

        if (Doppione.controllaDuplicati(list)) {
            System.out.println("Sono presenti duplicati nella lista.");
        } else {
            System.out.println("Non ci sono duplicati nella lista.");
        }
    }
}
