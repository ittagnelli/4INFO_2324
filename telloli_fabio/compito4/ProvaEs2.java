package compito4;

import java.util.Scanner;

public class ProvaEs2 {
    public static void main(String[] args) {
        es2 controllaVoc = new es2();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ninserisci la stringa: ");
        String stringa = scanner.nextLine();

        boolean controlloMaiuscole = controllaVoc.controlloVocale(stringa);
        System.out.println("\nla stringa contiene una vocale maiuscola: " + controlloMaiuscole);

        scanner.close();
    }
}
