import java.util.ArrayList;

public class Multiplo {

    public static void main(String[] args) {

        ArrayList<Integer> numeriCasuali = generaSequenzaCasuale();
 boolean risultato = verificaPariDispari(numeriCasuali);
 System.out.println("Sequenza  " + numeriCasuali);
        System.out.println("Il numero dei pari e' uguale al numero dei dispari " + risultato);
    }

    private static ArrayList<Integer> generaSequenzaCasuale() {
        ArrayList<Integer> numeriCasuali = new ArrayList<>();

        while (true) {
            int numeroCasuale = (int) (Math.random() * 21) + 20;
            numeriCasuali.add(numeroCasuale);

            if (numeroCasuale == 5) {
                break;
            }
        }

        return numeriCasuali;
    }

    private static boolean verificaPariDispari(ArrayList<Integer> numeri) {
        int conteggioPari = 0;

       
        for (int numero : numeri) {
            if (numero % 2 == 0) {
                conteggioPari++;
            }
        }

        return conteggioPari == (numeri.size() - conteggioPari);
    }
}