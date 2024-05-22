public class Main {
    public static void main(String[] args) {
        
        Tree t = new Tree();
        t.addTree(20);
        t.addTree(9);
        t.addTree(7);
        t.addTree(11);
        t.addTree(50);
        t.addTree(54);
        t.addTree(34);

        t.visualizzaInOrder();
        System.out.println("\n");
        t.visualizzaPreOrder();
        System.out.println("\n");
        t.visualizzaPostOrder();
        System.out.println("\n");
        System.out.println(t.find(20));
    }
}
