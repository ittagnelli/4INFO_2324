package compito3.es_4;
import java.util.Scanner;

public class ProvaElettrodomestico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ninserisci la marca del telefono: ");
        String marca = scanner.nextLine();

        System.out.print("\ninserisci il numero di telefono: ");
        int ntel = scanner.nextInt();

        scanner.nextLine();

        System.out.print("\ninserisci il messaggio: ");
        String mess = scanner.nextLine();
        
        Telefono cellulare = new Telefono(marca);
        cellulare.accendi();
        cellulare.chiamare(ntel);
        cellulare.scrivere(ntel, mess);
        cellulare.spegni();

        scanner.close();
    }
}
