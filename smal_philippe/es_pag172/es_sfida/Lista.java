import java.util.*;
import java.util.stream.Collectors;

public class Lista {
    public static ArrayList<Integer> frequenza(ArrayList<Integer> ls) {
        ArrayList<Integer> ls_freq = new ArrayList<Integer>(1);
        Iterator i = ls.iterator();
        while (i.hasNext()) {
            ls_freq.add(Collections.frequency(ls, (Integer)i.next()));
        }

        return ls_freq;
    }

    public static ArrayList<Integer> eliminaDuplicati(ArrayList<Integer> ls) {
        ArrayList<Integer> listaSenzaDuplicati = new ArrayList<Integer>(ls.stream()
                .distinct()
                .collect(Collectors.toList()));

        return listaSenzaDuplicati;
    }

    public static ArrayList<Integer> seleziona(ArrayList<Integer> ls, int numeroSelezionato) {
        Iterator i = ls.iterator();
        int numero;

        while (i.hasNext()) {
            numero = (Integer)i.next();
            if(numero < numeroSelezionato) i.remove();
        }

        return ls;   
    }

    public static boolean isOrdered(ArrayList<Integer> ls) {
        ArrayList<Integer> listaOrdinata = new ArrayList<Integer>(ls);
        Collections.sort(listaOrdinata);
        Iterator ite_ls = ls.iterator();
        Iterator ite_ord = listaOrdinata.iterator();
        boolean uguali = false;

        while (ite_ls.hasNext() && ite_ord.hasNext()) {
            if((Integer)ite_ls.next() < (Integer)ite_ord.next()) uguali = true;
            else {
                uguali = false;
                break;
            }
        }

        return uguali;


    } 

    public static ArrayList<Integer> sostituisci(ArrayList<Integer> ls, int num1, int num2) {
        Collections.replaceAll(ls, num1, num2);
        
        return ls;   
    }
}
