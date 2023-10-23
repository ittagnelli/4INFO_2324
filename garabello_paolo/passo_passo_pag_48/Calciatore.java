public class Calciatore extends Sportivo{
    private String squadra;

    public Calciatore(String no, String co, String squ){
        super(no, co, "Calcio");
        squadra = squ;
    }

    @Override 
    public String toString(){
        return super.toString() + "\nsquadra: " + squadra;
    }
}
