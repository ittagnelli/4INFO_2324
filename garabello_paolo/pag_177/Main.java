public class Main {
    public static void main(String[] args) {
        Lista<Integer> list = new Lista<Integer>();
        System.out.println(list.isEmpty());
        list.addTesta(33);
        System.out.println(list);
        
        list.addCoda(3);
        list.addCoda(5);
        list.addCoda(2);
        System.out.println(list);

        list.addAtIndex(0, 22);
        System.out.println(list);

        list.togliCoda();
        list.togliTesta();
        System.out.println(list);

        list.addCoda(3);
        list.addCoda(5);
        list.addCoda(2);
        System.out.println(list);

        list.removeAtIndex(2);
        System.out.println(list);
    }
}
