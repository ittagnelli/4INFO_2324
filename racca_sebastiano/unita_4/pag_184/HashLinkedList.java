import java.util.LinkedList;

public class HashLinkedList {
    private static int NUM = 100000;

    private LinkedList<Studente>[] table;

    HashLinkedList() {
        this.init();
    }

    @SuppressWarnings("unchecked")
    private void init() {
        this.table = new LinkedList[NUM];
        for (int i = 0; i < NUM; i++) {
            this.table[i] = new LinkedList<Studente>();
        }
    }

    private int getHashValue(int id) {
        return id % NUM;
    }

    public void hash(Studente studente) {
        this.table[this.getHashValue(studente.getId())].addLast(studente);
    }

    public Studente search(int id) {
        return table[getHashValue(id)].stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < NUM; i++) {
            res.append(i + " -> " + this.table[i].toString() + "\n");
        }

        return res.toString();
    }

}
