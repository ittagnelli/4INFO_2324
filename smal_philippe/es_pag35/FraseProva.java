import java.util.Scanner;

public class FraseProva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String parola;

        System.out.print("Inserisci una parola>>> ");
        parola = in.next();

        Frase frase = new Frase(parola);
        frase.numConsonanti();
        frase.numVocali();
        System.out.println(frase);

        in.close();
    }
}
