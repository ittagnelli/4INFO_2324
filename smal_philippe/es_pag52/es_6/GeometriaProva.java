public class GeometriaProva {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 4);
        rettangolo.calcolaArea();
        rettangolo.calcolaPerimetro();
        System.out.println(rettangolo);

        Triangolo triangolo = new Triangolo(3, 4, 5);
        triangolo.calcolaArea();
        triangolo.calcolaPerimetro();
        System.out.println(triangolo);

        Ottagono ottagono = new Ottagono(4, 6);
        ottagono.calcolaPerimetro();
        ottagono.calcolaArea();
        System.out.println(ottagono);
    }
}
