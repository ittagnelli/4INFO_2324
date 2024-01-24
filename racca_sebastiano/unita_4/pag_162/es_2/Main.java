public class Main <T> {
    private T[] elementi;

    Main(int elementiTot) {
        this.elementi = (T[]) (new Object[elementiTot]);
    }
    
    public void setElemento(int index, T val) {
        this.elementi[index] = val;
    }

    public T getElemento(int index) {
        return this.elementi[index];
    }

    public void visualizza() {
        for (T t : elementi) {
            System.out.println(t != null ? t.toString() : "null");
        }
    }

    public static void main(String[] args) {
        Main<Ciao> main = new Main<Ciao>(10);
        main.setElemento(0, new Ciao());
        main.setElemento(4, new Ciao());

        main.visualizza();
    }
}
