import java.util.LinkedList;
import java.util.Random;

public class Input {
    private Random random;
    private Lista miaLista;

    Input (Lista ls) {
        random = new Random();
        miaLista = ls;
    }

    public void riempiLista() {
        for (int i = 0; i < 10; i++) {
            miaLista.addCoda(random.nextInt(9) + 1);
        }

        System.out.println(miaLista);
    } 

    public LinkedList<Integer> eliminaMultipliAndMove() {
        LinkedList<Integer> ls = miaLista.removeMultpliNumero(2);
        System.out.println(miaLista);
        return ls;
    }
}
