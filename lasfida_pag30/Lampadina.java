public class Lampadina {
    private boolean accesa;
    private boolean rotta;
    private int maxClicks;
    private int clickCount;

    public Lampadina(int maxClicks) {
        accesa = false;
        rotta = false;
        maxClicks = maxClicks;
        clickCount = 0;
    }

    public void click() {
        if (!rotta) {
            clickCount++;
            if (clickCount >= maxClicks) {
                rotta = true;
                accesa = false;
            } else {
                accesa = !accesa;
            }
        }
    }

    public String toString() {
        if (rotta) {
            return "Lampadina rotta";
        } else {
            return "Stato: " + (accesa ? "accesa" : "spenta");
        }
    }
}
