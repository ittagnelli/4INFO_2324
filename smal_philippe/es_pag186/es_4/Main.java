import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Lista miaLista = new Lista();
        Input in = new Input(miaLista);
        in.riempiLista();
        LinkedList<Integer> ls = in.eliminaMultipliAndMove();
        System.out.println(ls);
    
    }
}