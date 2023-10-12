import java.util.Scanner;

public class ContaCaratteri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una frase: ");
        String frase = scanner.nextLine();

        int[] conteggioLettere = new int[26];
        int conteggioConsonanti = 0;
        int conteggioVocali = 0;

        for (char carattere : frase.toLowerCase().toCharArray()) {
            if (Character.isLetter(carattere)) {
                if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                    conteggioVocali++;
                } else {
                    conteggioConsonanti++;
                }
                conteggioLettere[carattere - 'a']++;
            }
        }

        System.out.println("Conteggio delle lettere:");
        for (int i = 0; i < 26; i++) {
            char lettera = (char) ('a' + i);
            System.out.println(lettera + ": " + conteggioLettere[i]);
        }

        System.out.println("Consonanti: " + conteggioConsonanti);
        System.out.println("Vocali: " + conteggioVocali);
    }
}
