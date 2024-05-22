import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("Inserisci una sequenza di interi (inserisci 0 per terminare):");
        int input;
        do {
            input = scanner.nextInt();
            if (input != 0) {
                lista.add(input);
            }
        } while (input != 0);

        System.out.print("Inserisci un numero intero n: ");
        int n = scanner.nextInt();

        
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % n == 0) {
                iterator.remove();
            }
        }

        
        System.out.println("Lista aggiornata dopo la rimozione degli interi multipli di " + n + ":");
        for (int num : lista) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}