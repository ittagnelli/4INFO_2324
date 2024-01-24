import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una sequenza di numeri terminante con 0:");
        int[] numeri = NumeriReader.leggiNumeri(scanner);
        boolean tuttiDuplicati = DuplicatiChecker.verificaDuplicati(numeri);
        if (tuttiDuplicati) {
            System.out.println("Presente almeno due volte.");
        } else {
            System.out.println("Almeno un elemento non è presente almeno due volte.");
        }
    }
}
