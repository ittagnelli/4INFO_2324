public class Main {
    public static void main(String[] args) {
        Segmento s1 = new Segmento(
            new Punto(1, 1),
            new Punto(4, 4)
        );
        System.out.println("Lunghezza: " + s1.getLeft());
        System.out.println("Compreso: " + s1.include(new Segmento(new Punto(3, 3), new Punto(2, 2))));
    }
}
