public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(4);
        list.addToHead(0);
        list.addToPosition(3, 3);
        list.addToTail(5);

        System.out.println(list.toString());
        
        
        System.out.println("\nRimuovendo...");
        list.removeFromTail();
        list.removeFromHead();
        list.removeFromPosition(2);
        
        System.out.println(list.toString());


    }
}