import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        scelta scelta = new scelta();
        LinkedList<Integer> lista = new LinkedList<Integer>();
        gestLista gestLista = new gestLista(lista);

        int scel;

        do {
            scel = scelta.menu();
            switch (scel) {
                case 1:
                    gestLista.addFondo();
                    break;
                case 2:
                    gestLista.getInfo();
                    break;
                case 3:
                    gestLista.positiveOne();
                    break;
                case 4:
                    gestLista.negativeOne();
                    break;
                

                case 6:
                    System.err.println(lista);
                    break;
            
                default:
                    break;
            }
            

        } while (scel != 0);
    }
}
