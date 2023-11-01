package compito4;
import java.util.Scanner;

public class ProvaEs1 {
    public static void main(String[] args) {
        es1 compara = new es1();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ninserisci la prima stringa: ");
        String stringa1 = scanner.nextLine();

        System.out.print("\ninserisci la seconda stringa: ");
        String stringa2 = scanner.nextLine();

        boolean uguali = compara.stringheUguali(stringa1, stringa2);
        System.out.println("\nle due stringhe sono uguali? " + uguali);

        int caratteri = compara.caratteriConsecutivi(stringa1, stringa2);
        System.out.println("\ni caratteri consecutivi sono: " + caratteri);

        scanner.close();


    }    
}
