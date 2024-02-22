public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Inserire una espressione");
        } else {
            String espressione = args[0];
            String espressioneRPN = NotazioneInversa.convertiInRPN(espressione);
            System.out.println("Espressione in RPN: " + espressioneRPN);
            double risultato = NotazioneInversa.calcolaRPN(espressioneRPN);
            System.out.println("Risultato: " + risultato);
        }

    }
}
