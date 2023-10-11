import java.util.Scanner;

public class AnalisiFrase {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Inserisci una frase (massimo 100 caratteri): ");
        String frase = inputScanner.nextLine();

        frase = frase.toUpperCase();

        int[] conteggioLettere = new int[21];

        int conteggioConsonanti = 0;
        int conteggioVocali = 0;

        for (int i = 0; i < frase.length(); i++) {
            char carattere = frase.charAt(i);
            if (carattere >= 'A' && carattere <= 'Z') {
                if (carattere == 'A' || carattere == 'E' || carattere == 'I' || carattere == 'O' || carattere == 'U') {
                    conteggioVocali++;
                } else {
                    conteggioConsonanti++;
                }
                conteggioLettere[carattere - 'A']++;
            }
        }

        System.out.println("Conteggio delle lettere:");
        for (char lettera = 'A'; lettera <= 'Z'; lettera++) {
            if (lettera == 'J' || lettera == 'K' || lettera == 'W' || lettera == 'X' || lettera == 'Y') {
                continue;
            }
            System.out.println(lettera + ": " + conteggioLettere[lettera - 'A']);
        }

        System.out.println("Numero di consonanti: " + conteggioConsonanti);
        System.out.println("Numero di vocali: " + conteggioVocali);

        inputScanner.close();
    }
}
