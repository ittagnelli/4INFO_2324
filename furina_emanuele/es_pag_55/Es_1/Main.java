import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto garage[] = new Auto[100];
        int numVeicoli = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi Auto");
            System.out.println("2. Aggiungi AutoMezzo");
            System.out.println("3. Aggiungi Camion");
            System.out.println("4. Visualizza veicoli");
            System.out.println("5. Esci");

            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Marca dell'Auto: ");
                    String marcaAuto = scanner.nextLine();
                    System.out.print("Modello dell'Auto: ");
                    String modelloAuto = scanner.nextLine();
                    System.out.print("Targa dell'Auto: ");
                    String targaAuto = scanner.nextLine();
                    System.out.print("Anno di immatricolazione dell'Auto: ");
                    int annoAuto = scanner.nextInt();
                    scanner.nextLine();
                    Auto auto = new Auto(marcaAuto, modelloAuto, targaAuto, annoAuto);
                    garage[numVeicoli] = auto;
                    numVeicoli++;
                    System.out.println("Auto aggiunta con successo.");
                    break;
                case 2:
                    System.out.print("Marca dell'AutoMezzo: ");
                    String marcaAutoMezzo = scanner.nextLine();
                    System.out.print("Modello dell'AutoMezzo: ");
                    String modelloAutoMezzo = scanner.nextLine();
                    System.out.print("Targa dell'AutoMezzo: ");
                    String targaAutoMezzo = scanner.nextLine();
                    System.out.print("Anno di immatricolazione dell'AutoMezzo: ");
                    int annoAutoMezzo = scanner.nextInt();
                    System.out.print("Numero di passeggeri dell'AutoMezzo: ");
                    int numPasseggeri = scanner.nextInt();
                    scanner.nextLine();
                    AutoMezzo autoMezzo = new AutoMezzo(marcaAutoMezzo, modelloAutoMezzo, targaAutoMezzo, annoAutoMezzo, numPasseggeri);
                    garage[numVeicoli] = autoMezzo;
                    numVeicoli++;
                    System.out.println("AutoMezzo aggiunto con successo.");
                    break;
                case 3:
                    System.out.print("Marca del Camion: ");
                    String marcaCamion = scanner.nextLine();
                    System.out.print("Modello del Camion: ");
                    String modelloCamion = scanner.nextLine();
                    System.out.print("Targa del Camion: ");
                    String targaCamion = scanner.nextLine();
                    System.out.print("Anno di immatricolazione del Camion: ");
                    int annoCamion = scanner.nextInt();
                    System.out.print("Capacità di carico del Camion (in tonnellate): ");
                    double capacitaCarico = scanner.nextDouble();
                    scanner.nextLine();
                    Camion camion = new Camion(marcaCamion, modelloCamion, targaCamion, annoCamion, capacitaCarico);
                    garage[numVeicoli] = camion;
                    numVeicoli++;
                    System.out.println("Camion aggiunto con successo.");
                    break;
                case 4:
                    System.out.println("Elenco dei veicoli nel garage:");
                    for (int i = 0; i < numVeicoli; i++) {
                        System.out.println("Veicolo " + (i + 1) + ":");
                        garage[i].stampa();
                    }
                    break;
                case 5:
                    System.out.println("Programma terminato.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}
