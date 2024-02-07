import java.util.*;

public class MyHashTable {

    static int NUM = 10;
    @SuppressWarnings({"unchecked"})
    private LinkedList<Integer>[] table = new LinkedList[10];

    MyHashTable(){
        inizializza();
    }

    static int hash_function(int data){
        return data % NUM;
    }
    
    private void inizializza(){
        for(int i = 0; i < NUM; i++)
            table[i] = new LinkedList<Integer>();
    }

    public void view(){
        for(int i = 0; i < NUM; i++)
            System.out.println("bucket " + i + ":->" + table[i]);
    }

    public void add(int newNum){
        int bucket;
        bucket = hash_function(newNum);
        if(table[bucket].contains(newNum))
            return;
        else
            table[bucket].add(newNum);
    }
}