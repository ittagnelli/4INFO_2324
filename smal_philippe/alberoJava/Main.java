public class Main {
    public static void main(String[] args) {
        Albero alby = new Albero();
        alby.add(20);
        alby.add(9);
        alby.add(50);
        alby.add(7);
        alby.add(11);
        alby.add(34);
        alby.add(54);
        //System.out.println(alby.visualizzaBFS());
        alby.visualizzaInOrder();
        System.out.println("\n");
        alby.visualizzaPostOrder();
        System.out.println("\n");
        alby.visualizzaPreOrder();
        System.out.println("\n\n" + alby.find(47));
    }
}
