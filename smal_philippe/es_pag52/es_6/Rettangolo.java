public class Rettangolo extends Geometria {
    public Rettangolo(int lato_1, int lato_2) {
        super(lato_1, lato_2);
    }    

    public void calcolaArea() {
        area = (lato_1 * lato_2);
    }

    public void calcolaPerimetro() {
        perimetro = (lato_1  + lato_2)  * 2;
    }

}
