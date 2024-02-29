import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashLinkedList hs = new HashLinkedList();
        LinkedList<Studente> tab[] = new LinkedList[hs.NUM];
        hs.inizializza(tab);
        hs.addElemento(tab, new Studente("marco", "rossi", "12345"));
        hs.addElemento(tab, new Studente("filippo", "bianchi", "13455"));
        hs.addElemento(tab, new Studente("jason", "perchx", "17450"));
        hs.addElemento(tab, new Studente("vino", "blu", "92754"));
        hs.addElemento(tab, new Studente("guicciardini", "nero", "41347"));
        hs.visualizza(tab);
        System.out.println(hs.search(tab, new Studente("guicciardini", "nero", "41347")));

    }
}