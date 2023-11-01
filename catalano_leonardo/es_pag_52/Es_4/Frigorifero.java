public class Frigorifero extends Elettrodomestico {
    private int temperatura;

    public Frigorifero(String marca, String modello, int temperatura) {
        super(marca, modello);
        this.temperatura = temperatura;
    }

    public void raffreddare() {
        System.out.println("il frigorifero  e'freddo " + temperatura + " gradi Celsius");
    }

    public void scongelare() {
        System.out.println("il frigorifero si sta scaldando");
    }
}
