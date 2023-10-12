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
