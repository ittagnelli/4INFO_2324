import java.util.Scanner;

public class Minuscolo {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Inserisci la parola: ");
        String parola = in.next();
        in.close();
        
        char[] minuscolo = new char[parola.length()];

        for (int i = 0; i < minuscolo.length; i++) {
            minuscolo[i] = Character.toLowerCase(parola.charAt(i));
        }

        String minuscoloParola = new String(minuscolo);
        System.out.println("Parola in minuscolo: " + minuscoloParola);

    }
}
