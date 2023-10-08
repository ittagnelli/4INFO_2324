public class Lampadina{
    private int lampadina_status;
    private int click_tot;
    private int click_contatore;

    public Lampadina(int valore_contatore){
        click_tot = valore_contatore;
        lampadina_status = 0;
        click_contatore = 0;
    }

    public void click() {
        if(lampadina_status == 0) lampadina_status = 1;
        else if (lampadina_status == 1) lampadina_status = 0;

        click_contatore ++;

        if(click_contatore >= click_tot) lampadina_status = 2;
    }

    public String toString() {
        if(lampadina_status == 1) return "Accesa";
        else if (lampadina_status == 0) return "Spenta";
        else return "Rotta";
    }
}
