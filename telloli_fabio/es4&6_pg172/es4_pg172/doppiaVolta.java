import java.util.Vector;

public class doppiaVolta {

    public doppiaVolta() {
    }

    public boolean presenza(Vector<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            int contatore = 0;
            
            for (int j = 0; j < v.size(); j++) {
                if (v.get(i).equals(v.get(j))) {
                    contatore++;
                }
            }
            if (contatore != 2) {
                return false; 
            }
        }

        return true;
    }
}
