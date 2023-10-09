import java.util.Scanner;

class Lampadina {
    private boolean accesa;
    private boolean rotta;
    private int maxClicks;
    private int clicks;

    public Lampadina(int maxClicks) {
        this.accesa = false;
        this.rotta = false;
        this.maxClicks = maxClicks;
        this.clicks = 0;
    }

    public void click() {
        if (!rotta) {
            if (clicks < maxClicks) {
                accesa = !accesa;
                clicks++;
            } else {
                rotta = true;
                System.out.println("La lampadina è rotta dopo " + maxClicks + " clicks!");
            }
        } else {
            System.out.println("La lampadina è rotta e non può essere più utilizzata.");
        }
    }

    @Override
    public String toString() {
        if (rotta) {
            return "Lampadina rotta";
        } else {
            return "Lampadina " + (accesa ? "accesa" : "spenta");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero massimo di clicks per la lampadina: ");
        int maxClicks = scanner.nextInt();

        Lampadina lampadina = new Lampadina(maxClicks);

        boolean continua = true;

        while (continua) {
            System.out.println("Stato corrente: " + lampadina);
            System.out.println("Scegli un'azione:");
            System.out.println("1. Click");
            System.out.println("2. Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    lampadina.click();
                    break;
                case 2:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }

        scanner.close();
    }
}
