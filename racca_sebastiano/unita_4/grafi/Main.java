public class Main {
    public static void main(String[] args) {
        Graph<String> grafo = new Graph<String>();

        grafo.addVertice("A");
        grafo.addVertice("B");
        grafo.addVertice("C");
        grafo.addVertice("D");
        grafo.addVertice("E");

        grafo.addArco("A", "B");
        grafo.addArco("A", "C");
        grafo.addArco("A", "D");

        grafo.addArco("B", "C");

        grafo.addArco("C", "D");
        grafo.addArco("C", "E");

        // grafo.print();
        grafo.dfs("A");
    }
}
