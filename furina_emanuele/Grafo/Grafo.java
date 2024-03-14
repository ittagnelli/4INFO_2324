import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Queue;

public class Grafo {
    private HashMap<Vertice, List<Vertice>> adiacenze;

    public Grafo() {
        this.adiacenze = new HashMap<>();
    }

    public void addVertice(String label) {
        Vertice vertice = new Vertice(label);
        if (!adiacenze.containsKey(vertice)) {
            adiacenze.put(vertice, new ArrayList<>());
        }
    }

    public void addArco(String label1, String label2) {
        Vertice vertice1 = new Vertice(label1);
        Vertice vertice2 = new Vertice(label2);
        if (adiacenze.containsKey(vertice1) && adiacenze.containsKey(vertice2)) {
            adiacenze.get(vertice1).add(vertice2);
            adiacenze.get(vertice2).add(vertice1);
        }
        
    }

    public void print() {
        for (Map.Entry<Vertice, List<Vertice>> entry : adiacenze.entrySet()) {
            System.out.print("Vertice " + entry.getKey().getLabel() + " adiacenti: ");
            for (Vertice verticeAdiacente : entry.getValue()) {
                System.out.print(verticeAdiacente.getLabel() + " ");
            }
            System.out.println();
        }
    }

    public void visitaDFS(String labelIniziale) {
        Vertice verticeIniziale = new Vertice(labelIniziale);
        System.out.println("======= DFS =======");
        if (!adiacenze.containsKey(verticeIniziale)) {
            System.out.println("il vertice non esiste fratm");
            return;
        }

        Stack<Vertice> stackDaVisitare = new Stack<>();
        HashMap<Vertice, Boolean> visitati = new HashMap<>();

        stackDaVisitare.push(verticeIniziale);
        visitati.put(verticeIniziale, true);

        while (!stackDaVisitare.isEmpty()) {
            Vertice verticeCorrente = stackDaVisitare.pop();
            System.out.println("Visitato: " + verticeCorrente.getLabel());

            for (Vertice verticeAdiacente : adiacenze.get(verticeCorrente)) {
                if (!visitati.containsKey(verticeAdiacente)) {
                    stackDaVisitare.push(verticeAdiacente);
                    visitati.put(verticeAdiacente, true);
                }
            }
        }
    }

    public void visitaBFS(String labelInziale){
        Vertice verticeInziale = new Vertice(labelInziale);
        System.out.println("======= BFS =======");
        if (!adiacenze.containsKey(verticeInziale)) {
            System.out.println("Il vertice inziale non esiste");
            return;
        }
        
        Queue<Vertice> coda = new LinkedList<>();
        HashMap<Vertice, Boolean> vistitati = new HashMap<>();

        coda.add(verticeInziale);
        vistitati.put(verticeInziale, true);
        
        while (!coda.isEmpty()) {
            Vertice verticeCorrente = coda.poll();
            System.out.println("Visitato: " + verticeCorrente.getLabel());
            for (Vertice verticeAdiacente : adiacenze.get(verticeCorrente)) {
                if (!vistitati.containsKey(verticeAdiacente)) {
                    coda.add(verticeAdiacente);
                    vistitati.put(verticeAdiacente, true);
                }
            }
        }
    }
}
