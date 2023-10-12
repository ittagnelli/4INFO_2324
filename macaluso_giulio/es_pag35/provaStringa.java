import java.util.Scanner;

public class provaStringa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String parola;
        
        System.out.print("\nInserisci una stringa: ");
        parola = in.next();

        Stringa str = new Stringa(parola);

        str.controlloConsonanti();
        str.controlloVocali();

        System.out.println(str);
    }
}
