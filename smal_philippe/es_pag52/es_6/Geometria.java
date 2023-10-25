public class Geometria{
    protected int lato_1;
    protected int lato_2;
    protected int lato_3;
    protected int area;
    protected int perimetro;

    public Geometria(int l1, int l2) {
        lato_1 = l1;
        lato_2 = l2;
    }

    public Geometria(int l1, int l2, int l3) {
        lato_1 = l1;
        lato_2 = l2;
        lato_3 = l3;
    }

    public String toString() {
        return "\narea: " + area + "\nperimetro: " + perimetro;
    }
}