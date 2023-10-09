public class ProvaTriangolo {
    public static void main(String[] args){
        // Equilatero
        int[] latiTriangoloEquilatero = {5, 5, 5};
        Triangolo equilatero = new Triangolo(latiTriangoloEquilatero, 4);
        System.out.println("Tipo di triangolo: " + equilatero.getTipo());
        System.out.println("Area: " + equilatero.getArea());
        System.out.println("Perimetro: " + equilatero.getPerimetro());

        // Isoscele
        int[] latiTriangoloIsoscele = {4, 4, 6};
        Triangolo isoscele = new Triangolo(latiTriangoloIsoscele, 3);
        System.out.println("Tipo di triangolo: " + isoscele.getTipo());
        System.out.println("Area: " + isoscele.getArea());
        System.out.println("Perimetro: " + isoscele.getPerimetro());

        // Rettangolo
        int[] latiTriangoloRettangolo = {3, 4, 5};
        Triangolo rettangolo = new Triangolo(latiTriangoloRettangolo, 2);
        System.out.println("Tipo di triangolo: " + rettangolo.getTipo());
        System.out.println("Area: " + rettangolo.getArea());
        System.out.println("Perimetro: " + rettangolo.getPerimetro());

        // Scaleno
        int[] latiTriangoloScaleno = {7, 9, 11};
        Triangolo scaleno = new Triangolo(latiTriangoloScaleno, 5);
        System.out.println("Tipo di triangolo: " + scaleno.getTipo());
        System.out.println("Area: " + scaleno.getArea());
        System.out.println("Perimetro: " + scaleno.getPerimetro());
    }
}
