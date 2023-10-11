import java.util.Scanner;
public class Minuscolo {
    static final int TANTI = 30;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String parola;
        char[] minuscolo = new char[TANTI];
        System.out.println("Inserisci qualcosa:");
        parola = in.next();

        for (int x =0; x < parola.length(); x++){
            minuscolo[x] = parola.charAt(x);
        }

        for (int x = 0; x < parola.length(); x++){
            minuscolo[x] = Character.toLowerCase(minuscolo[x]);
        }

        System.out.println("tie la tua frase:");

        for (int x = 0; x < minuscolo.length; x++)
            System.out.print(minuscolo[x]);
    }
}
