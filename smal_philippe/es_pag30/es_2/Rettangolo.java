public class Rettangolo{
    private int base;
    private int altezza;
    private int area;
    private int perimetro;

    public Rettangolo(){
        base = 0;
        altezza = 0;
    }

    public void setBase(int valore) {
        base = valore;
    }

    public void setAltezza(int valore) {
        altezza = valore;
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void calcolaArea() {
        area = base * altezza;
    }

    public void calcolaPerimetro() {
        perimetro = (base + altezza) * 2;
    }

    public String toString() {
        return "\nPerimetro = " + perimetro + "\nArea = " + area;
    }




}
