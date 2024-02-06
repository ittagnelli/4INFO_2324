public class Main {
    public static void main(String[] args) {
        TabellaHashStudenti tabellaHash = new TabellaHashStudenti();
        tabellaHash.inserisci(new Studente("Mario Rossi",  123));
        tabellaHash.inserisci(new Studente("Luigi Verdi",  456));
        tabellaHash.inserisci(new Studente("Anna Bianchi",  789));
        tabellaHash.stampa();
        System.out.println("Contiene Mario Rossi? " + tabellaHash.contiene(new Studente("Mario Rossi",  123)));
    }
}
