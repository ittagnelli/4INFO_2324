import java.util.Scanner;

public class ProvaProgramma {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");

        if (containsUpperVowel(in.nextLine()))
            System.out.println("La stringa contiene una vocale maiuscola");
        else
            System.out.println("La stringa non contiene una vocale maiuscola");

        in.close();
    }

    private static boolean containsUpperVowel(String str) {
        return str.contains("A") ||
            str.contains("E") ||
            str.contains("I") ||
            str.contains("O") ||
            str.contains("U");
    } 
}