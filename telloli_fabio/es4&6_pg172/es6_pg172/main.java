import java.util.Vector;

public class main {
    public static void main(String[] args) {
        Vector<Integer>lista = new Vector<Integer>();
        gestisciVector gestisciVector = new gestisciVector();
        cercaPari cPari = new cercaPari();

        gestisciVector.riempiVector(lista);
        boolean check = cPari.trovaPari(lista);

        System.out.println("i numeri pari sono uguali a quelli dispari? " + check);
    }
}
