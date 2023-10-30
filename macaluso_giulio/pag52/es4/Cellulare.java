public class Cellulare extends Mobile{
    public String modello;

    public void setModello(String m) {
        modello = m;
    }
    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Modello: " + modello);
    }
}
