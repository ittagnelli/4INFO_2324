public class lampadina {
    private final int off = 0;
    private int stato = off;

    public lampadina() {
        click();
    }
    public void click() {
        if(stato == 0) {
            stato = stato + 1;
        } else {
            stato = stato - 1;
        }
    }
    public String toString() {
        if(stato == 0) {
            return "spento";
        } else {
            return "acceso";
        }
    }
}
