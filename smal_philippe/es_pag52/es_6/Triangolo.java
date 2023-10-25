public class Triangolo extends Geometria{
    public Triangolo(int lato_1, int lato_2, int lato_3) {
        super(lato_1, lato_2, lato_3);
    }

    public void calcolaArea() {
        area = (lato_1 * lato_2) / 2;
    }

    public void calcolaPerimetro() {
        perimetro = lato_1 + lato_2 + lato_3;
    }
}
