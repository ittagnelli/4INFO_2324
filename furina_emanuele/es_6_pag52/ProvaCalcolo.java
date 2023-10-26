public class ProvaCalcolo {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(4, 5);
        Quadrato quadrato = new Quadrato(3);
        TriangoloIsoscele triangolo = new TriangoloIsoscele(6, 4);
        Ottagono ottagono = new Ottagono(4);

        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());

        System.out.println("Area del quadrato: " + quadrato.calcolaArea());
        System.out.println("Perimetro del quadrato: " + quadrato.calcolaPerimetro());

        System.out.println("Area del triangolo isoscele: " + triangolo.calcolaArea());
        System.out.println("Perimetro del triangolo isoscele: " + triangolo.calcolaPerimetro());

        System.out.println("Area dell'ottagono: " + ottagono.calcolaArea());
        System.out.println("Perimetro dell'ottagono: " + ottagono.calcolaPerimetro());

        // Confronto delle aree
        int confronto = rettangolo.confronta(quadrato);
        if (confronto > 0) {
            System.out.println("Il rettangolo ha un'area maggiore.");
        } else if (confronto < 0) {
            System.out.println("Il quadrato ha un'area maggiore.");
        } else {
            System.out.println("Il rettangolo e il quadrato hanno la stessa area.");
        }
    }
}
