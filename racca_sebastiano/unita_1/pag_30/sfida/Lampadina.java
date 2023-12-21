public class Lampadina {
    private int stato;
    private int clickCount;

    private final int CLICK_TO_BREAK = 5;

    public Lampadina() {
        stato = 0;
        clickCount = 0;
    }

    /**
     * Clicca l'interuttore della lampadina
     * @return boolean True se la lampadina ha cambiato stato, false se si è rotta
     */
    public boolean click() {
        if(clickCount++ >= CLICK_TO_BREAK) {
            stato = -1;
            return false;
        }

        stato = 1 - stato;
        return true;
    }
    
    public String toString() {
        return stato >= 0 ? (stato == 0 ? "spenta" : "accesa") : "rotta";
    }
}
