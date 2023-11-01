package esercizi_informatica;

public class ProvaSegmento {
    public static void main(String[] args) {
        Segmento segmento = new Segmento(
            new Punto(1,1), 
            new Punto(5,5)
        );

        Segmento segmento2 = new Segmento(
            new Punto(5,5), 
            new Punto(8,8)
        );

        System.out.println("compreso  " + segmento.inclusoIn(segmento2));
    }
}