import java.util.Scanner;
import java.util.regex.*;

public class ProvaProgramma {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");

        if (has3ConsecutiveConsonants(in.nextLine()))
            System.out.println("3 Consonanti consecutive trovate");
        else
            System.out.println("Consonanti consecutive non trovate");

        in.close();
    }

    private static boolean has3ConsecutiveConsonants(String str) {
        Pattern pattern = Pattern.compile("[b-df-hj-np-tv-z]{3}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}