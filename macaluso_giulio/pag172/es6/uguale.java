import java.util.*;

public class uguale {
    private ArrayList<Integer> array;
    private Random ran;

    uguale() {
        array = new ArrayList<Integer>(1);
        ran = new Random();
    }

    public void riempi() {
        int numero;

        do {
            numero = ran.nextInt(40 - 20) + 20;
            if((numero % 5) != 0) array.add(numero);
            
        } while ((numero % 5) != 0);
    }

    public boolean contaPari() {
        int pari = 0;

        for (int i = 0; i < array.size(); i++) {
            if((array.get(i) % 2) == 0){
                pari ++;
            } 
        }

        if(pari  == array.size() / 2) {
            return true;
        } else {
            return false;
        }
    }

    public void getLista() {
        System.out.println(array);
    }
}
