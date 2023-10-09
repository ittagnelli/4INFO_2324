public class Frazione {
    private int numeratore1;
    private int denominatore1;
    private int numeratore2;
    private int denominatore2;
    private int prodnum;
    private int prodden;
    private float fat1;
    private float fat2;
    private float somma;


    public Frazione(int num1, int den1, int num2, int den2) {
        numeratore1 = num1;
        denominatore1 = den1;
        numeratore2 = num2;
        denominatore2 = den2;
    }

    public void CalcolaProdotto() {
        prodnum = numeratore1 * numeratore2;
        prodden = denominatore1 * denominatore2;
    }

    public void CalcolaDifferenza() {
        prodnum = numeratore1 * denominatore2;
        prodden = denominatore1 * numeratore1;
    }

    public void CalcolaSomma() {
        if(denominatore1 > denominatore2) {
            fat1 = numeratore1;
            fat2 = (denominatore1 / denominatore2) * numeratore2;
            somma = fat1 + fat2;
        } else if(denominatore2 > denominatore1) {
            fat1 = (denominatore2 / denominatore1) * numeratore1;
            fat2 = numeratore2;
            somma = fat1 + fat2;
        }
    }

    public int getDenominatore() {
        if(denominatore1 > denominatore2) {
            return denominatore1;
        } else {
            return denominatore2;
        }
    }

    public float getSomma() {
        return somma;
    }


    public int getProdnum() {
        return prodnum;
    }

    public int getProdden() {
        return prodden;
    }
}
    
