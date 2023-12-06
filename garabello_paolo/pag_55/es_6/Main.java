public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLibro(new Libro("gianni", "ciao", 234, 2341));
        biblioteca.addLibro(new Libro("gianni", "bellaFra", 233, 2342));
        biblioteca.addLibro(new Libro("anto", "bellaWaglione", 250, 2343));
        System.out.print(biblioteca);
        System.out.println("\n\n" + biblioteca.getByAuthor("gianni"));

        System.out.println("\n\n");
        System.out.println(biblioteca);
        biblioteca.ordina();
        System.out.println("\n\n");
        System.out.println(biblioteca);

        biblioteca.cancellaISBN(2341);
        System.out.println("\n\n");
        System.out.println(biblioteca);
    }   
}
