public class Lampadina{
    private int lampadina_on_off;
    private int click_totale;
    private int click_contatore;

    public Lampadina(int valore_contatore){
        click_totale = valore_contatore;
        lampadina_on_off = 0;
        click_contatore = 0;
    }

    public void click() {
        if(lampadina_on_off == 0) lampadina_on_off = 1;
        else if (lampadina_on_off == 1) lampadina_on_off = 0;

        click_contatore ++;

        if(click_contatore >= click_totale) lampadina_on_off = 2;
    }

    public String toString() {
        if(lampadina_on_off == 1) return "Accesa";
        else if (lampadina_on_off == 0) return "Spenta";
        else return "Rotta";
    }
}
