import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListViewer list = new ListViewer(new LinkedList<>(), scanner);

        String scelta = "";

        do {
            System.out.print(": ");
            scelta = scanner.next();

            list.handle(scelta);

        } while (scelta.compareTo("q") != 0);

        scanner.close();
    }
}
