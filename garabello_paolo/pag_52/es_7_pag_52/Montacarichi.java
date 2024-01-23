public class Montacarichi {
    protected int partenza;
    protected int arrivo;

    public Montacarichi(int partenza, int arrivo){
        this.arrivo = arrivo;
        this.partenza = partenza;
    }

    public void muovi(){
        System.out.println("In arrivo dal piano " + partenza + " al piano " + arrivo);
    }
}
