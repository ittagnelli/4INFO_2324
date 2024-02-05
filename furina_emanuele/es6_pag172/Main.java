public class Main {
    public static void main(String[] args) {
        int[] numeriCasuali = NumeriCasualiGenerator.generaNumeriCasuali();
        boolean pariUgualiDispari = PariDispariChecker.verificaPariUgualiDispari(numeriCasuali);
        System.out.println("Sequenza generata:");
        StampaNumeri.stampaNumeri(numeriCasuali);

        if (pariUgualiDispari) {
            System.out.println("I numeri pari sono in numero uguale a quelli dispari.");
        } else {
            System.out.println("I numeri pari non sono in numero uguale a quelli dispari.");
        }
    }
}
