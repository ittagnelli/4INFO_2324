public class Main {
    public static void main(String[] args){
        Persona p = new Persona("Gianni", "Rossi");
        System.out.println("Persona \n-----------\n" + p);
    

        Sportivo sp = new Sportivo("Antonio", "Verdi", "Basket");
        System.out.println("Sportivo \n-----------\n" + sp);

        Calciatore ca = new Calciatore("Piero", "Agnello", "Toro");
        System.out.println("Calciatore \n-----------\n" + ca);
    }
}
