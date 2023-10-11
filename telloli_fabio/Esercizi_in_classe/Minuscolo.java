import java.util.Scanner;

public class Minuscolo {
    static final int TANTI = 30;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String parola;
        char[] minuscolo = new char[TANTI];
        System.out.print("\ninserisci una parola: ");
        parola = in.next();

        for (int i = 0; i < parola.length(); i++) {
            minuscolo[i] = parola.charAt(i);
        }

        for (int i = 0; i < parola.length(); i++) {
            minuscolo[i] = Character.toLowerCase(minuscolo[i]);
        }

        System.out.print("\nparola in minuscolo: ");

        for (int i = 0; i < minuscolo.length; i++) {
            System.out.print(minuscolo[i]);
        }

        String parolaMinu = new String(minuscolo);
        System.out.print("\nla parola in minuscolo (oggetto): ");
        System.out.println(parolaMinu);
    }
}
