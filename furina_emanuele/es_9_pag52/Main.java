public class Main {
    public static void main(String[] args) {
        Bicicletta bicicletta = new Bicicletta("Bianchi", 2020, 21);
        bicicletta.muovi();
        bicicletta.pedala();
        bicicletta.suonaCampanello();
        System.out.println("Anno di costruzione: " + bicicletta.annoDiCostruzione);
        System.out.println("Numero di ingranaggi: " + bicicletta.getNumeroDiIngranaggi());
    }
}
