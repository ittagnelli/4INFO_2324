public class Montacarichi {
    public static void main(String[] args) {
        Ascensore ascensore = new Ascensore();

        ascensore.prenotaPiano(5);
        ascensore.prenotaPiano(2);
        ascensore.prenotaPiano(8);

        System.out.println("L'ascensore e' al piano " + ascensore.getPianoCorrente());

        ascensore.eseguiOperazioni(ascensore.getPianoCorrente());

        System.out.println("L'ascensore ora e' arrivato al piano " + ascensore.getPianoCorrente());
    }
}
