import java.util.Scanner;

public class Mettiti_alla_prova_pag35 {
    public static void main(String[] args) {
        int contvoca = 0;
        int contconso = 0;

        Scanner in = new Scanner(System.in);
        String parola;
        char[] parolone = new char[100];

        System.out.print("\ninserisci una parola: ");
        parola = in.next();

        for(int i = 0; i < parola.length(); i++ ) {
            parolone[i] = parola.charAt(i);

            if(parola.charAt(i) == 'a' || parola.charAt(i) == 'e' || parola.charAt(i) == 'i'|| parola.charAt(i) == 'o'|| parola.charAt(i) == 'u' ) {
                contvoca++;
            } else {
                contconso++;
            }
        }

        System.out.println("Numero di vocali: " + contvoca);
        System.out.println("Numero di consonanti: " + contconso);


        in.close();
    }
}
