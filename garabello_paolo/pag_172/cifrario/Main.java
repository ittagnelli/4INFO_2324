public class Main {
    public static void main(String[] args) {
        Cesare cesare = new Cesare(2, "abc");
        System.out.println(cesare.cifra());
        cesare.setParola("cde");
        System.out.println(cesare.deCifra());
    }
}