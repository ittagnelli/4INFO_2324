
public class Ottagono extends Geometria {
    public Ottagono(int lato_1, int apotema) {
        super(lato_1, apotema);
    }

    public void calcolaArea() {
        area = ((lato_1 * lato_1)* lato_2);
    }

    public void calcolaPerimetro() {
        perimetro = lato_1 * 8;
    }
}
