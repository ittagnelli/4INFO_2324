public class Rettangolo{
    private int base;
    private int altezza;
    private int A;
    private int P;

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

    public void calcolaA() {
        A = base * altezza;
    }

    public void calcolaP() {
        P = (base + altezza) * 2;
    }

    public String toString() {
        return "\nP = " + P + "\nA = " + A;
}




}
