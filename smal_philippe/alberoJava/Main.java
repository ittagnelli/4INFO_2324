public class Main {
    public static void main(String[] args) {
        Albero alby = new Albero();
        alby.add(3);
        alby.add(2);
        alby.add(3);
        alby.add(4);
        alby.add(7);
        alby.add(1);
        alby.add(0);
        System.out.println(alby.visualizzaBFS());
    }
}
