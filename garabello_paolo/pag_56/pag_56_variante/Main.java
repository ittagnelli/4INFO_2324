public class Main {
    public static void main(String[] args) {
        Segmento seg = new Segmento(new Punto(4, 2), new Punto(1, 5));
        System.out.println(seg.getLenght());
        System.out.println("m = " + seg.equation().getM() + " q = " + seg.equation().getQ());
        System.out.println(seg.includes(new Segmento(new Punto(2, 4), new Punto(3, 3))));
    }
}
