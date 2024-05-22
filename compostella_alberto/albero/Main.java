
public class Main {
    public static void main(String[] args) {
        int [] array = {29,9,50,6,11,34,54};
        
        Albero a = new Albero();
        a.heapToTree(array);
        a.add(20);
        a.add(9);
        a.add(50);
        a.add(7);
        a.add(11);
        a.add(34);
        a.add(54);
        a.Search(20);
       

        
    }
    
}
