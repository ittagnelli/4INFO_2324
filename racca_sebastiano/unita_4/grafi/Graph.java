import java.util.HashMap;
import java.util.HashSet;

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

    public void print() {
        this.adjacencies.forEach((k, v) -> {
            System.err.println(k.toString() + " -> " + v);
        });
    }
}