import java.util.*;
public class HashLinked {
    static int NUM = 10; 
    static LinkedList<Studente>[] tabella = new LinkedList[NUM]; 


    static int hashFunction(int id) {
        return id % NUM;
    }


    static void inizializza() {
        for (int x = 0; x < NUM; x++)
            tabella[x] = new LinkedList<>();
    }

    static void visualizza() {
        for (int x = 0; x < NUM; x++)
            System.out.println("bucket " + x + ": -> " + tabella[x]);
    }


    public static void aggiungiStudente(Studente nuovo) {
        if (tabella == null) {
            System.out.println("Errore");
            return;
        }

        int bucket = hashFunction(nuovo.getId());
        if (tabella[bucket] == null) {
            tabella[bucket] = new LinkedList<>();
        }
        tabella[bucket].add(nuovo);
    }


    static Studente cerca(int id) {
        int bucket = hashFunction(id);
        for (Studente studente : tabella[bucket]) {
            if (studente.getId() == id)
                return studente;
        }
        return null; 
    }
}

public class Studente {
    int id;
    String nome;

    public Studente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Studente(" + "id=" + id +", nome=" + nome + '\'' +')';
    }
}

public class MainHash {
    public static void main(String[] args) {
        System.out.println("lista ");


        HashLinked.aggiungiStudente(new Studente(10, "leo"));
        HashLinked.aggiungiStudente(new Studente(12, "jack"));
        HashLinked.aggiungiStudente(new Studente(15, "lollo"));


        HashLinked.visualizza();


        int idDaCercare = 10;
        Studente risultato = HashLinked.cerca(idDaCercare);
        if (risultato != null) {
            System.out.println("Studente visto " + risultato);
        } else {
            System.out.println("Studente  " + idDaCercare + " non trovato");
        }
    }
}
