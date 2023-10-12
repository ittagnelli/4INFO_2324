import java.util.Scanner;

public class ProvaCalcoloStringa {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci la stringa: ");

        CalcoloStringa stringa = new CalcoloStringa(in.nextLine());

        in.close();


        System.out.println(stringa);
    }
}