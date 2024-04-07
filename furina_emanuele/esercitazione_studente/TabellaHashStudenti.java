import java.util.LinkedList;

public class TabellaHashStudenti {
    private static final int DIMENSIONE =  10;
    private LinkedList<Studente>[] studenti;

    public TabellaHashStudenti() {
        studenti = new LinkedList[DIMENSIONE];
        for (int i =  0; i < DIMENSIONE; i++) {
            studenti[i] = new LinkedList<>();
        }
    }

    private int funzioneHash(int matricola) {
        return matricola % DIMENSIONE;
    }

    public void inserisci(Studente studente) {
        int indice = funzioneHash(studente.getMatricola());
        studenti[indice].add(studente);
    }

    public boolean contiene(Studente studente) {
        int indice = funzioneHash(studente.getMatricola());
        return studenti[indice].contains(studente);
    }

    public void rimuovi(Studente studente) {
        int indice = funzioneHash(studente.getMatricola());
        studenti[indice].remove(studente);
    }

    public void stampa() {
        for (int i =  0; i < DIMENSIONE; i++) {
            System.out.printf("Posizione %d: ", i);
            for (Studente s : studenti[i]) {
                System.out.printf("%s-%d, ", s.getNome(), s.getMatricola());
            }
            System.out.println();
        }
    }
}
    