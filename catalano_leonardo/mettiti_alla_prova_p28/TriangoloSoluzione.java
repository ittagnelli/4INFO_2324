public class TriangoloSoluzione {
    private double lato1, lato2, lato3;

    public TriangoloSoluzione(double l1, double l2, double l3) {
        lato1 = l1;
        lato2 = l2;
        lato3 = l3;
    }

    public void TipodiTriangolo() {
        if (lato1 == lato2 && lato2 == lato3) {
            System.out.println("Il triangolo e' equilatero.");
        } else if (lato1 == lato2 || lato1 == lato3 || lato2 == lato3) {
            System.out.println("Il triangolo e' isoscele.");
        } else {
            System.out.println("Il triangolo e' scaleno.");
        }
    }

    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
    public void calcolaDiagonali() {
        double diagonale1 = Math.sqrt(2 * (lato2 * lato2 + lato3 * lato3) - lato1 * lato1) / 2;
        double diagonale2 = Math.sqrt(2 * (lato1 * lato1 + lato3 * lato3) - lato2 * lato2) / 2;
        double diagonale3 = Math.sqrt(2 * (lato1 * lato1 + lato2 * lato2) - lato3 * lato3) / 2;

        System.out.println("diagonale 1: " + diagonale1);
        System.out.println("diagonale 2: " + diagonale2);
        System.out.println("diagonale 3: " + diagonale3);
    }
    public double calcolaArea() {
        double metaperimetro = calcolaPerimetro() / 2;
        return Math.sqrt(metaperimetro * (metaperimetro - lato1) * (metaperimetro - lato2) * (metaperimetro - lato3));
    }

    public void visualizzaRisultati() {
        System.out.println("perimetro: " + calcolaPerimetro());
        System.out.println("area: " + calcolaArea());

        if (lato1 + lato2 > lato3 && lato1 + lato3 > lato2 && lato2 + lato3 > lato1) {
            calcolaDiagonali();
        } else {
            System.out.println(" Non esistono diagonali nel  triangolo.");
        }
    }
}