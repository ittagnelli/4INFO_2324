public class Studente {
    private int id;
    private String name;

    Studente(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "{name: " + this.name + " ID: " + this.id + "}";
    }

}
