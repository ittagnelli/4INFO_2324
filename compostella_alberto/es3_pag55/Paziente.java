public class Paziente extends Medico {
    private int codice;
    public Paziente(int codice, String nominativo){
        super(nominativo);
        this.codice = codice;
    }


    @Override
    public String toString() {
        return "paziente{codice paziente:"+codice+ "}";
    }
    
}
