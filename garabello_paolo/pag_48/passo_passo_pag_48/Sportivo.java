public class Sportivo extends Persona{
    private String sport;

    public Sportivo(String no, String co, String spo){
        super(co, no);
        sport = spo;
    }

    @Override
    public String toString(){
        return super.toString() + "\nsport: " + sport;
    }
}
