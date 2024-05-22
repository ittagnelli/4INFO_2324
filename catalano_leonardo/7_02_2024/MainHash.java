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