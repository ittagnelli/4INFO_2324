import java.util.*;

public class Test {
    static int NUM = 50000000;
    public static void main(String[] args) {
        HashLinkedList list = new HashLinkedList();

        for(int i = 0; i < NUM; i++) {
            list.hash(new Studente(i, "Mario " + i));
        }

        

        long start = (new Date()).getTime();
        list.search(NUM-1);

        System.out.println((new Date()).getTime() - start);

        // System.out.println(list);

        // Studente[] arrayList = new Studente[NUM];


        // for(int i = 0; i < NUM; i++) {
        //     arrayList[i] = new Studente(i, "Mario " + i);
        // }

        // long start = (new Date()).getTime();

        // for(int i = 0; i < NUM; i++) {
        //     if(arrayList[i].getId() == NUM-1) {
        //         break;
        //     }
        // }

        // System.out.println((new Date()).getTime() - start);
    }
}
