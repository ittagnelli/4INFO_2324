import java.util.ArrayList;

public class Operazioni {
    private ArrayList<Integer> list;
    private int currentIndex;

    public Operazioni() {
        this.list = new ArrayList<>();
        this.currentIndex = -1;
    }

    public void aggiungiElementi(int value) {
        list.add(value);
        currentIndex = list.size() - 1;
    }

    public void informazioni() {
        if (currentIndex == -1 || currentIndex >= list.size()) {
            System.out.println("Nessun elemento ");
        } else {
            System.out.println("Elemento  " + list.get(currentIndex));
        }
    }

    public void avanti() {
        if (currentIndex < list.size() - 1) {
            currentIndex++;
            System.out.println("sei al successivo elemento");
        } else {
            System.out.println("Sei sull'ultimo elemento");
        }
    }

    public void indietro() {
        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("Sei sul precedente elemento");
        } else {
            System.out.println("Sei sullo stesso elemento");
        }
    }

    public void elimina() {
        if (currentIndex == -1 || currentIndex >= list.size()) {
            System.out.println("Nessun da togliere");
        } else {
            list.remove(currentIndex);
            System.out.println("Elemento tolto");
            if (currentIndex == list.size()) {
                currentIndex--;
            }
        }
    }
}
