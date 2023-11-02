
public class ProvaGeometria{
    public static void main(String[] args) {

        Quadrato quadrato = new Quadrato(5);
        Rettangolo rettangolo = new Rettangolo(5, 6);
        TriangoloIsoscele triangolo = new TriangoloIsoscele(5, 7);
        Ottagono ottagono = new Ottagono(6);

        System.out.println("Quadrato:");
        System.out.println("Area: " + quadrato.calcolaArea());
        System.out.println("Perimetro: " + quadrato.calcolaPerimetro());

        System.out.println(" Rettangolo:");
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());

        System.out.println(" Triangolo Isoscele:");
        System.out.println("Area: " + triangolo.calcolaArea());
        System.out.println("Perimetro: " + triangolo.calcolaPerimetro());

        System.out.println("Ottagono:");
        System.out.println("Area: " + ottagono.calcolaArea());
        System.out.println("Perimetro: " + ottagono.calcolaPerimetro());
    }
}