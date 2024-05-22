public class Main {
    public static void main(String[] args) {
        Segmento s1 = new Segmento(
            new Punto(1, 1),
            new Punto(4, 1)
        );

        System.out.println("Lunghezza: " + s1.getLenght());

        System.out.println("Compreso? " + s1.inclusoIn(new Segmento(new Punto(2, 1), new Punto(3, 1))));
        System.out.println("Compreso? " + s1.inclusoIn(new Segmento(new Punto(7, 1), new Punto(10, 1))));
    }
}