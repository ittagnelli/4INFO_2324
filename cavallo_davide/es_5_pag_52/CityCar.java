public class CityCar extends Automobile {
    boolean ibrida;

    public CityCar(boolean ibrida) {
        ibrida = ibrida;
    }

    public void attivaModalitaElettrica() {
        if (ibrida) {
            System.out.println("La city car ha attivato la modalità elettrica.");
        } else {
            System.out.println("Questa city car non è ibrida e non ha una modalità elettrica.");
        }
    }
}
