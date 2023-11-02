package compito4;

import java.util.Scanner;

public class ProvaEs3 {
    public static void main(String[] args) {
        es3 contConso = new es3();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\ninserisci la stringa: ");
        String stringa = scanner.nextLine();

        boolean controllaConsec = contConso.controllaConso(stringa);
        System.out.println("\nnella stringa ci sono 3 consonanti consecutive? " + controllaConsec);

        scanner.close();
    }
}

