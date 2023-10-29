public class Elettrodomestici {
    protected Boolean acceso;

    public Elettrodomestici(){
        acceso = false;
    }

    public void accendiSpegni(){
        acceso = !acceso;
    }
}
