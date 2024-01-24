package es_in_classe;
public class Main {
    public static void main(String[] args) {
        Libro[] libri = { 
            new Libro("no", "si", 52, "dsafefaas"),
            new Libro("Giovanni", "Bosco", 999, "dferrrrada"),
            new Libro("Giovanni", "Ciao", 199, "sndkj")
            
            
        };

        Biblioteca biblioteca = new Biblioteca(libri);
        biblioteca.cercaAutore("Giovanni");

        biblioteca.cercaNome("si");

        biblioteca.eliminaLibro( new Libro("Giovanni", "Bosco", 999, "dferrrrada"));

        biblioteca.bubbleSort();

        Libro[] libri_ordinati = biblioteca.getTutti();
        for (int i = 0; i < libri_ordinati.length; i++) {
            if(libri_ordinati[i] != null)
                System.out.println("nome: " + libri_ordinati[i].getNome() + " numero pagine: " + libri_ordinati[i].getNpag());
        }
        
    }
}
