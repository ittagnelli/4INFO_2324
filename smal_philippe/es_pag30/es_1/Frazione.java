public class Frazione{
    private int denominatore;
    private int numeratore;

    public Frazione(){
        denominatore = 0;
        numeratore = 0;
    }

    public void setDenominatore(int valore) {
        denominatore = valore;
    }

    public void setNumeratore(int valore) {
        numeratore = valore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    public int getNumeratore() {
        return numeratore;
    }

    public void calcolaSomma(Frazione frazione_2) {
        int denominatore_final = denominatore * frazione_2.getDenominatore();
        int numeratore_final = (numeratore * frazione_2.getDenominatore()) + (denominatore * frazione_2.getNumeratore());

        System.out.println("Somma : " + numeratore_final + "/" + denominatore_final);
    }

    public void calcolaDifferenza(Frazione frazione_2) {
        int denominatore_final = denominatore * frazione_2.getDenominatore();
        int numeratore_final = (numeratore * frazione_2.getDenominatore()) - (denominatore * frazione_2.getNumeratore());

        System.out.println("Differenza : " + numeratore_final + "/" + denominatore_final);
    }

    public void calcolaProdotto(Frazione frazione_2) {
        int denominatore_final = denominatore * frazione_2.getDenominatore();
        int numeratore_final = numeratore * frazione_2.getNumeratore();

        System.out.println("Prodotto : " + numeratore_final + "/" + denominatore_final);
    }


}
