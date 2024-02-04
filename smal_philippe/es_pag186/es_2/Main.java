public class Main {
    public static void main(String[] args) {
        Lista miaLista = new Lista();
        miaLista.addCoda(3);
        miaLista.addCoda(2);
        miaLista.addCoda(1);
        miaLista.addCoda(4);
        miaLista.addCoda(8);
        System.out.println(miaLista);
        miaLista.nextOne();
        miaLista.nextOne();
        System.out.println(miaLista.getInfo());
        miaLista.precOne();
        System.out.println(miaLista.getInfo());
        miaLista.removeOne();
        System.out.println(miaLista);
        

    }
}