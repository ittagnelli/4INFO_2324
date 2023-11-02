package es1_pg55;

public class provaVeicoli {
    public static void main(String[] args) {
        Auto auto = new Auto("Ford", "Mustang", "AL123AA", 1970);
        Automezzo automezzo = new Automezzo("Fiat", "Panda", "AB123CD", 2000, 2);
        Camion camion = new Camion("Iveco", "S-WAY", "OD652TO", 2023, 2, 2700);

        System.out.print("\nAuto:");
        auto.Stampa();

        System.out.println("\nAutomezzo:");
        automezzo.Stampa();

        System.out.println("\nCamion:");
        camion.stampa();
    }
}
