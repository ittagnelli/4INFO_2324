import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static final int MAX_PAROLE = 3;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> parole = new ArrayList<>();

        for (int i = 0; i < MAX_PAROLE; i++) {
            System.out.print("Inserisci una parola: ");
            parole.add(scan.nextLine());
        }

        Collections.sort(parole);
        System.out.println(parole);

        scan.close();
    }
}