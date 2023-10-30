package compito3.es_5;
import java.util.Scanner;

public class ProvaMezzoDiTrasporto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ninseirisci la marca della macchina: ");
        String marca = scanner.nextLine();

        System.out.print("\ninserisci il modello della macchina: ");
        String modello = scanner.nextLine();

        System.out.print("\ninserisci l'anno di prozione: ");
        int anno =  scanner.nextInt();

        System.out.print("\ninserisci il numero di porte: ");
        int porte =  scanner.nextInt();

        System.out.print("\ninserisci la velocita' massima: ");
        int veloce =  scanner.nextInt();

        CityCar cityCar = new CityCar(marca, modello, anno, porte, veloce);
        cityCar.dettagli(marca, modello, anno, porte, veloce);

        scanner.close();
    }
}
