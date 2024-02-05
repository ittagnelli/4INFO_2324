import java.util.ArrayList;
import java.util.List;

public class ListaPuntataDoppia {

    public static List<Nodo> generaListaCasuale(int lunghezza) {
        List<Nodo> lista = new ArrayList<>();
        for (int i = 0; i < lunghezza; i++) {
            int valoreCasuale = (int) (Math.random() * 9) + 1;
            Nodo nodo = new Nodo(valoreCasuale);
            lista.add(nodo);

            if (i > 0) {
                nodo.precedente = lista.get(i - 1);
                lista.get(i - 1).successivo = nodo;
            }
        }
        return lista;
    }

    public static void stampaLista(List<Nodo> lista) {
        Nodo nodoCorrente = lista.get(0);
        while (nodoCorrente != null) {
            System.out.print(nodoCorrente.valore + " ");
            nodoCorrente = nodoCorrente.successivo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Nodo> listaPrincipale = generaListaCasuale(10);
        List<Nodo> listaPari = new ArrayList<>();

        System.out.println("Lista Principale:");
        stampaLista(listaPrincipale);

        Nodo nodoCorrente = listaPrincipale.get(0);
        while (nodoCorrente != null) {
            if (nodoCorrente.valore % 2 == 0) {
                listaPari.add(nodoCorrente);
                if (nodoCorrente.precedente != null) {
                    nodoCorrente.precedente.successivo = nodoCorrente.successivo;
                }
                if (nodoCorrente.successivo != null) {
                    nodoCorrente.successivo.precedente = nodoCorrente.precedente;
                }
            }
            nodoCorrente = nodoCorrente.successivo;
        }

        System.out.println("Lista Pari:");
        stampaLista(listaPari);

        System.out.println("Lista Principale dopo la rimozione degli elementi pari:");
        stampaLista(listaPrincipale);
    }
}
