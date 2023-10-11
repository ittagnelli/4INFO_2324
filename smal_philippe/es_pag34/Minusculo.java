import java.util.Scanner;

public class Minusculo {
    static final int TANTI = 30;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String parola;
        char[] minuscolo = new char[TANTI];
        System.out.print("\nInserisci una parola>>> ");
        parola = in.next();

        for (int i = 0; i < parola.length(); i++) {
            minuscolo[i] = parola.charAt(i);
        }

        for (int i = 0; i < parola.length(); i++) {
            minuscolo[i] = Character.toLowerCase(minuscolo[i]);
        }

        System.out.println("Parola in minuscolo: ");
        for (int i = 0; i < parola.length(); i++) {
            System.out.print(minuscolo[i]);
        }
        System.out.println("\n\n");

        in.close();
    }
}
