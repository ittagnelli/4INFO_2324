import java.util.LinkedList;
import java.util.Scanner;

public class ListViewer {
    private LinkedList<Integer> list;
    private Scanner scanner;
    private int current = 0;

    ListViewer(LinkedList<Integer> list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void handle(String scelta) {
        switch (scelta) {
            case "a":
                this.add();
                break;

            case "v":
                this.view();
                break;

            case "l":
                this.forward();
                break;

            case "h":
                this.back();
                break;

            case "d":
                this.delete();
                break;

            case "q":
                break;

            case "help":
            default:
                System.out.println("Usage:");
                System.out.println("'a': aggiungi un elemento.\n'v': visualizza l'elemento corrente");
                System.out.println("'l': vai a destra di 1\n'h': vai a sinistra di 1\n'd' o 'q'.");
                System.out.println("'d': elimina l'elemento corrente\n'q': esci");
                break;
        }
    }

    private boolean currentExists() {
        return this.list.size() > this.current;
    }

    private void add() {
        System.out.print("Inserisci il valore: ");
        this.list.addLast(this.scanner.nextInt());
    }

    private void view() {
        System.out.println(this.currentExists() ? this.list.get(this.current) : "L'elemento non esiste.");
    }

    private void forward() {
        (this.current)++;
    }

    private void back() {
        (this.current)--;
    }

    private void delete() {
        if(this.currentExists())
            this.list.remove(this.current);
        else
            System.out.println("L'elemento non esiste.");
    }
}
