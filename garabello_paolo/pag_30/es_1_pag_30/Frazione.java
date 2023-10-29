public class Frazione {
    private int numeratore;
    private int denominatore;
    private int value;

    public Frazione(){

    }
    public Frazione(int num, int den){
        numeratore = num;
        denominatore = den;
    }

    public void setNumeratore(int num){
        numeratore = num;
    }

    public void setDenominatore(int den){
        numeratore = den;
    }

    public String toString(){
        return ("il numeratore vale: " + numeratore + "il denominatore vale:" + denominatore);
    }

    public Frazione somma(Frazione f2){
        Frazione result = new Frazione();
        result.numeratore = numeratore + f2.numeratore;
        result.denominatore = denominatore + f2.denominatore;
        return result;
    }

    public Frazione moltiplicazione(Frazione f2){
        Frazione result = new Frazione();
        result.numeratore = numeratore * f2.numeratore;
        result.denominatore = denominatore * f2.denominatore;
        return result;
    }

    public Frazione sottrazione(Frazione f2){
        Frazione result = new Frazione();
        result.numeratore = numeratore - f2.numeratore;
        result.denominatore = denominatore - f2.denominatore;
        return result;
    }
}
