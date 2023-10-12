import java.util.Scanner;

public class ContaLettere {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);   
        System.out.print("Inserisci una frase: ");
        String frase = input.nextLine();
        input.close();
        frase = frase.replaceAll(" ", "").toLowerCase();
        int[] lettereAlfabeto = new int[26];
        int numeroConsonanti = 0;
        int numeroVocali = 0;

        for (int i = 0; i < frase.length(); i++) {
            char carattere = frase.charAt(i);
            if (carattere >= 'a' && carattere <= 'z') {
                // Verifica se è una consonante
                if (carattere != 'a' && carattere != 'e' && carattere != 'i' && carattere != 'o' && carattere != 'u') {
                    numeroConsonanti++;
                } else {
                    numeroVocali++;
                }
                lettereAlfabeto[carattere - 'a']++;
            }
        }
      
        for (char lettera = 'a'; lettera <= 'z'; lettera++) {
            int indice = lettera - 'a';
            System.out.println("La lettera '" + lettera + "' compare " + lettereAlfabeto[indice] + " volte.");
        }
      
        System.out.println("Numero di consonanti: " + numeroConsonanti);
        System.out.println("Numero di vocali: " + numeroVocali);
    }
}
