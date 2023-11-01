public class Biblioteca{
    private Libro[] libreria; 

    public Biblioteca(Libro[] libreria){
        this.libreria = libreria;
    }

  public void stampa() {
        for (Libro libro : elenco) {
            System.out.println("\n" + libro.getnomeAutore());
            System.out.println("" + libro.getNomeTitolo());
            System.out.println("" + libro.getNomePagine());
        }
    }

    public boolean controlloAutore(String nome) {
        for (Libro libro : elenco) {
            if (libro.getNomeAutore().equals(nome)) {
                return true;
            }
        }
        return false;
    }
}
