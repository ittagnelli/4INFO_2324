import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class gestLista {
    private LinkedList<Integer> lista;
    private Scanner scanner;
    int elemento;

    public gestLista(LinkedList<Integer> lista) {
        this.lista = lista;
        this.scanner = new Scanner(System.in);
    }

    public void addFondo() {
        System.out.println("Inserisci il numero: ");
        int n = scanner.nextInt();
        lista.addLast(n);
    }

    public void positiveOne() {
        ListIterator<Integer> listIterator = lista.listIterator();

        if (listIterator.hasNext()) {
            elemento = listIterator.next();
            System.out.println("Siamo alla cella: " + elemento);
        } else {
            System.err.println("Non c'è un elemento successivo.");
        }
    }

    public void negativeOne() {
        ListIterator<Integer> listIterator = lista.listIterator();

        if (listIterator.hasPrevious()) {
            elemento = listIterator.previous();
            System.out.println("Siamo alla cella: " + lista.indexOf(elemento));
        } else {
            System.err.println("Non c'è un elemento precedente.");
        }
    }

    public void getInfo() {
        System.out.println("Elemento corrente: " + elemento);
    }
}