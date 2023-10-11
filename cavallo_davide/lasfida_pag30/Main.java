t java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero massimo di click: ");
        int maxClicks = input.nextInt();
        input.nextLine(); 

        Lampadina lampadina = new Lampadina(maxClicks);

        boolean continua = true;
        while (continua) {
            System.out.println("\nMenu:");
            System.out.println("1. Premi il pulsante");
            System.out.println("2. Visualizza stato");
            System.out.println("3. Esci");

            int scelta = input.nextInt();
            input.nextLine(); 

            switch (scelta) {
                case 1:
                    lampadina.click();
                    System.out.println("Click effettuato. Stato attuale: " + lampadina);
                    break;
                case 2:
                    System.out.println("Stato attuale: " + lampadina);
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        input.close();
    }
}
