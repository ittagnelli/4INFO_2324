import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        System.out.println("inserisci i numeri interi, 0 per terminare");

        do {
            n1 = scanner.nextInt();
            if (n1 != 0) {
                lista.add(n1);
            }
        } while (n1 != 0);


        System.out.println("inserirsci un numero: ");
        n2 = scanner.nextInt();

        Multipli multipli = new Multipli(lista, n2);
        
        multipli.rimuoviMultipli();


        System.err.println("\nnuova lista: ");
        System.out.println(lista);
    }
}
