public class Main {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<Integer>();

        lista.addCoda(22);
        lista.addCoda(23);
        lista.addCoda(12);
        lista.addCoda(5);
        lista.seeAll();
       
        System.out.println(lista.getCurrent());
        
        lista.next();
        lista.next();
        System.out.println(lista.getCurrent());

        lista.previous();
        System.out.println(lista.getCurrent());
        
        lista.removeCurrent();
        lista.seeAll();
    }
}