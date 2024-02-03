public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto();
        auto.setAnno(1999);
        auto.setMarcha("Audi");
        auto.setModello("v4");
        System.out.println(auto);

        Automezzo automezzo = new Automezzo("Fiat", "v5", 2004);
        System.out.println(automezzo);

        Camion camion = new Camion("Wolkswagen", "v6", 2002, 6);
        System.out.println(camion);
    }
}
