public class Main {
    public static void main(String[] args) {
        Segmento s1 = new Segmento(new Punto(2, 1), new Punto(5, 2));

        System.out.println("\nla lunghezza è: " + s1.getLung());

        System.out.println("Compreso? " + s1.compreso(new Segmento(new Punto(2, 1), new Punto(3, 1))));
    }
}
