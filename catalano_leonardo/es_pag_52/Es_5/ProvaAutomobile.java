public class ProvaAutomobile {
    public static void main(String[] args) {
        CityCar miaCityCar = new CityCar("Jeep", "Renegade", 4, true);
        System.out.println("marca: " + miaCityCar.getMarca());
        System.out.println("modello: " + miaCityCar.getModello());
        System.out.println("numero di porte: " + miaCityCar.getNumeroPorte());
        System.out.println("parcheggio automatico: " + miaCityCar.isParcheggioAutomatico());
    }
}