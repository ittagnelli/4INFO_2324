public class Main {
    public static void main(String[] args) {
        final int MAX = 9;
        final int MIN = 1;
        Lista lista = new Lista();
        for(int i = 0; i < 10; i++)
            lista.addCoda((int)(Math.random() * MAX + MIN));
        System.out.println(lista);

        lista.removeEven();
        System.out.println(lista);     

    }
}