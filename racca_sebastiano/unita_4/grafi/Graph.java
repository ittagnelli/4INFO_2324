import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph<T> {
    private HashMap<Vertice<T>, HashSet<Vertice<T>>> adjacencies;

    public Graph() {
        this.adjacencies = new HashMap<>();
    }

    public void addVertice(T value) {
        this.adjacencies.putIfAbsent(new Vertice<T>(value), new HashSet<Vertice<T>>());
    }

    public void addArco(T v1, T v2) {
        this.adjacencies.get(new Vertice<T>(v1)).add(new Vertice<T>(v2));
        this.adjacencies.get(new Vertice<T>(v2)).add(new Vertice<T>(v1));
    }

    private void print(T start, boolean bfs) {
        Vertice<T> vStart = new Vertice<>(start);

        if(!this.adjacencies.containsKey(vStart))
            return;

        HashSet<Vertice<T>> visited = new HashSet<>();
        LinkedList<Vertice<T>> queue = new LinkedList<>();
     
        queue.add(vStart);
        visited.add(vStart);

        do {
            Vertice<T> current = bfs ? queue.removeFirst() : queue.pop();
            System.out.print(current + " ");
            this.adjacencies.get(current).forEach((v) -> {
                if(!visited.contains(v)) {
                    visited.add(v);
                    queue.add(v);
                }
            });
        } while(!queue.isEmpty());

        System.out.println("");
    }

    public void bfs(T start) {
        this.print(start, true);
    }

    public void dfs(T start) {
        this.print(start, false);
    }

    public void print() {
        this.adjacencies.forEach((k, v) -> {
            System.err.println(k.toString() + " -> " + v);
        });
    }
}