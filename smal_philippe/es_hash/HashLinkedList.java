import java.util.LinkedList;

public class HashLinkedList {
    final int NUM = 30;

    public int hashFunction(Studente stu) {
        return (stu.getCognome().length() + stu.getNome().length() + stu.getId().length()) % NUM;
    }

    public void inizializza(LinkedList<Studente>[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new LinkedList<Studente>();
        }
    }

    public void visualizza(LinkedList<Studente>[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("[ "+ i +" ] :->" + tab[i]);
        }
    }

    public void addElemento(LinkedList<Studente>[] tab, Studente nuovo) {
        int bucket = hashFunction(nuovo);
        tab[bucket].add(nuovo);
    }

    public LinkedList<Studente> search(LinkedList<Studente>[] tab, Studente stu) {
        int bucket = hashFunction(stu);
        return tab[bucket];
    }
}
