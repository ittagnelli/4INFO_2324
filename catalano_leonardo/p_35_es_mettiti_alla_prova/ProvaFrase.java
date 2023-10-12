import java.util.Scanner;

public class ProvaFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una frase di massimo 100 caratteri: ");
        String frase = scanner.nextLine();

        frase = frase.toLowerCase();

        int[] conteggioLettere = Frase.contaLettere(frase);
        int conteggioConsonanti = Frase.contaConsonanti(frase);
        int conteggioVocali = Frase.contaVocali(frase);

        for (int x = 0; x < 26; x++) {
            char lettera = (char) ('a' + x);
            System.out.println(lettera + ": " + conteggioLettere[x]);
        }

        System.out.println("consonanti: " + conteggioConsonanti);
        System.out.println("vocali: " + conteggioVocali);

        scanner.close();
    }
}
