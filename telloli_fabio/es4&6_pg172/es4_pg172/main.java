import java.util.Vector;

public class main {
    public static void main(String[] args) {
        Vector<Integer> lista = new Vector<Integer>();
        gestisciVector gestisciVector = new gestisciVector();
        doppiaVolta doppiaVolta = new doppiaVolta();

        gestisciVector.riempiVector(lista);

        boolean check = doppiaVolta.presenza(lista);
        System.out.println(check);

    }
}