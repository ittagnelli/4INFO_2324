import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci l'espressione: ");
        Expression exp = new Expression(scan.nextLine());

        System.out.println("Espressione in polacca inversa: " + exp.toPolski());

        System.out.println("Risultato: " + Rotaluklak.calc(exp));

        scan.close();
    }
}
