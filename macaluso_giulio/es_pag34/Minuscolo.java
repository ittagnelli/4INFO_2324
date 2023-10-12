import java.util.Scanner;

public class Minuscolo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int LUN = 30;
        String parola;
        char[] minuscolo = new char[LUN];

        System.out.print("\nInserisci una stringa: ");
        parola = in.next();

        for(int i = 0; i < parola.length(); i ++) {
            minuscolo[i] = parola.charAt(i);
        }

        for(int i = 0; i < parola.length(); i ++) {
            minuscolo[i] = Character.toLowerCase(minuscolo[i]);
        }
        System.out.print("La parola in minuscolo: ");

        for(int i = 0; i < minuscolo.length; i ++) {
            System.out.print(minuscolo[i]);
        }

        String parolaMinu = new String(minuscolo);
        System.out.print("La parola in minuscolo: ");
        System.out.println(parolaMinu);
    }
}
