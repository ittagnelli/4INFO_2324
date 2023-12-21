import java.util.Scanner;

public class ProvaProgramma {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci due stringe: ");

        int equalChars = getEqualChars(in.nextLine(), in.nextLine());

        in.close();
        
        if(equalChars > 0)
            System.out.println("Numero di caratteri uguali: " + equalChars);
        else
            System.out.println("Non ci sono caratteri uguali");

    }

    private static int getEqualChars(String str1, String str2) {
        return str1.replaceAll("[^" + str2 + "]", "").length();
        // if(str1.length() > str2.length()) {
        //     return str2.replaceAll("[^" + str1 + "]", "").length();
        // }
        // return str1.replaceAll("[^" + str2 + "]", "").length();
    }

}
