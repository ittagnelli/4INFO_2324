public class PariDispariChecker {
    public static boolean verificaPariUgualiDispari(int[] numeri) {
        int conteggioPari = 0;
        int conteggioDispari = 0;
        for (int numero : numeri) {
            if (numero % 2 == 0) {
                conteggioPari++;
            } else {
                conteggioDispari++;
            }
        }
        return conteggioPari == conteggioDispari;
    }
}
