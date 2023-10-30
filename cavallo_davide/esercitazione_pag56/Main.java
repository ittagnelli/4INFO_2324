public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2, 3);
        Punto punto2 = new Punto(6, 3);

        Segmento segmento1 = new Segmento(punto1, punto2);
        System.out.println("Lunghezza del segmento: " + segmento1.getLength());
        System.out.println("Pendenza del segmento: " + segmento1.getPendenza());

        Segmento segmento2 = new Segmento(5);
        System.out.println("Lunghezza del segmento: " + segmento2.getLength());
        System.out.println("Pendenza del segmento: " + segmento2.getPendenza());

        System.out.println("Il segmento 1 è contenuto nel segmento 2? " + segmento1.inclusione(segmento2));
    }
}
