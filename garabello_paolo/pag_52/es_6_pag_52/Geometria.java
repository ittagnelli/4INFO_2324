public class Geometria {
    public static void main(String[] args) {
        Ottagono ott = new Ottagono(5);
        Rettangolo rett = new Rettangolo(5, 10);
        Quadrato quad = new Quadrato(6);
        TriangoloIsoscele tri = new TriangoloIsoscele(2, 4, 6);

        ott.confronta(tri);
        ott.confronta(quad);
        ott.confronta(rett);

        rett.confronta(tri);
        rett.confronta(quad);

        quad.confronta(tri);
    }
}
