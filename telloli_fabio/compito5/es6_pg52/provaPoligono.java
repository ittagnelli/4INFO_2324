package es6_pg52;

public class provaPoligono {
    public static void main(String[] args) {
        Poligono poligono = new Poligono(0, 0);
        Ottagono ottagono = new Ottagono(9);
        Rettangolo rettangolo = new Rettangolo(9, 3);
        Quadrato quadrato = new Quadrato(2);
        TriangoloIsoscele   triangoloIsoscele = new TriangoloIsoscele(4, 6, 2);

        System.out.println("\nArea dell' Ottagono: " + ottagono.calcolaArea());
        System.out.println("\nArea del Rettangolo: " + rettangolo.calcolaArea());
        System.out.println("\nArea del Quadrato: " + quadrato.calcolaArea());
        System.out.println("\nArea del Triangolo Isoscele " + triangoloIsoscele.calcolaArea());
    }
}
