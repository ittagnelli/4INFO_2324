public class ProvaStringa1 {
    public static void main(String[] args) {
        String stringa1 = "ciao";
        String stringa2 = "ciao";

        Stringa1 comparatore = new Stringa1();
        int risultato = comparatore.confrontaStringhe(stringa1, stringa2);

        if (risultato == 0) {
            System.out.println("le stringhe sono uguali");
        } else {
            System.out.println("le stringhe sono diverse per " + risultato + " caratteri consecutivi");
        }
    }
}
