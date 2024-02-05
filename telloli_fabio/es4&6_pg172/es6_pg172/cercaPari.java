import java.util.Vector;

public class cercaPari {
    int contaPari;
    int contaDispari;

    cercaPari() {
        contaPari = 0;
        contaDispari = 0; 
    }

    public boolean trovaPari(Vector<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 == 0 ) {
                contaPari++;
            } else {
                contaDispari++;
            }
        }

        if (contaPari == contaDispari) {
            return true;
        }

        return false;
    } 
}
