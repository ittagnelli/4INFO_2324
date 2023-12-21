public class Main {
    public static void main(String[] args) {

        Segmento s1 = new Segmento(
            new Punto(1, 1),
            new Punto(3, 3)
        );

        System.out.println("Lunghezza: " + s1.getLenght());

        System.out.println("Incluso? " + s1.includes(s1));
        System.out.println("Incluso? " + s1.includes(new Segmento(new Punto(1, 1), new Punto(2, 2))));
        System.out.println("Incluso? " + s1.includes(new Segmento(new Punto(1, 2), new Punto(2, 2))));


    }
}