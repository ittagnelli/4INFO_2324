public class CityCar extends Automobile {
    private boolean parcheggioAutomatico;

    public CityCar(String marca, String modello, int numeroPorte, boolean parcheggioAutomatico) {
        super(marca, modello, numeroPorte);
        this.parcheggioAutomatico = parcheggioAutomatico;
    }

    public boolean isParcheggioAutomatico() {
        return parcheggioAutomatico;
    }

    public void setParcheggioAutomatico(boolean parcheggioAutomatico) {
        this.parcheggioAutomatico = parcheggioAutomatico;
    }
}
