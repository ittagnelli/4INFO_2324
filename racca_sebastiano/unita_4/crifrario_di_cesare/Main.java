public class Main {
    public static void main(String[] args) {
        Cifrario cif = new Cifrario(2);
        String enc = cif.encode("ciao");
        String dec = cif.decode(enc);

        System.out.println("Encoded: " + enc + "\nDecoded: " + dec);
    }
}