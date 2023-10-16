public class Frase {
    public static int[] contaLettere(String frase) {
        int[] conteggioLettere = new int[26];

        for (int x = 0; x < frase.length(); x++) {
            char carattere = frase.charAt(x);

            if (carattere >= 'a' && carattere <= 'z') {
                conteggioLettere[carattere - 'a']++;
            }
        }
        return conteggioLettere;
    }

    public static int contaConsonanti(String frase) {
        int conteggioConsonanti = 0;

        for (int x = 0; x < frase.length(); x++) {
            char carattere = frase.charAt(x);

            if (carattere >= 'a' && carattere <= 'z' && carattere != 'a' && carattere != 'e' && carattere != 'i'
                    && carattere != 'o' && carattere != 'u') {
                conteggioConsonanti++;
            }
        }

        return conteggioConsonanti;
    }

    public static int contaVocali(String frase) {
        int conteggioVocali = 0;

        for (int x = 0; x < frase.length(); x++) {
            char carattere = frase.charAt(x);

            if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                conteggioVocali++;
            }
        }

        return conteggioVocali;
    }
}


import java.util.Scanner;

public class Main {
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
