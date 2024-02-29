import java.util.*;

public class MyHashTable {

    static int NUM = 10;
    @SuppressWarnings({"unchecked"})
    private LinkedList<Studente>[] table = new LinkedList[NUM];

    MyHashTable(){
        inizializza();
    }

    private int hash_function(int id){
        return id % NUM;
    }
    
    private void inizializza(){
        for(int i = 0; i < NUM; i++)
            table[i] = new LinkedList<Studente>();
    }

    public void add(Studente newStudent){
        table[hash_function(newStudent.getId())].add(newStudent);
    }

    public Studente search(int id){
        return table[hash_function(id)].stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < NUM; i++) {
            res.append(i + " -> " + this.table[i].toString() + "\n");
        }

        return res.toString();
    }
}