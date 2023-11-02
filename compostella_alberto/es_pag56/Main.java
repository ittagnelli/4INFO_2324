public class Main {
    public static void main(String[] args) {
        Segmento segmento = new Segmento(
            new Punto(1,1), 
            new Punto(5,5)
        );

        Segmento segmento2 = new Segmento(
            new Punto(2,2), 
            new Punto(4,4)
        );

        System.out.println("E' compreso ? >>> " + segmento.inclusoIn(segmento2));
    }
}
