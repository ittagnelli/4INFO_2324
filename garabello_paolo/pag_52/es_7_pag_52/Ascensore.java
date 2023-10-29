public class Ascensore extends Montacarichi{

    private int prenotato;
    
    public Ascensore(int partenza, int arrivo){
        super(partenza, arrivo);
    }

    public void processPrenotato(){
        if(prenotato > arrivo && arrivo > partenza){
            System.out.println("In arrivo dal piano " + partenza + " al piano " + prenotato);
        } else {
            if(prenotato > arrivo && partenza > arrivo){
                System.out.println("In arrivo dal piano " + partenza + " al piano " + arrivo + " per poi tornare al piano " + prenotato);
            }
        }
    }

    public void prenota(int prenotato){
        this.prenotato = prenotato;
        processPrenotato();
    }
}
