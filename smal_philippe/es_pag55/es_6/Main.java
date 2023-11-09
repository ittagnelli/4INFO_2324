public class Main {
    public static void main(String[] args) {
        Libro[] libri = { new Libro("Philippe", "Ciao", 
                        3999, "123456781"), 
                        new Libro("Philippe", "Bonjour", 
                        40, "123456780"), 
                        new Libro("Samuele", "ciaox", 
                        4001, "123456782")
                    };
        Biblioteca biblioteca = new Biblioteca(libri);
        biblioteca.stampa(biblioteca.cercaLibroAutore("samuele"));
        System.out.println("esiste il libro 'Bonjour' >>> " + biblioteca.cercaLibroTitolo("Bonjour"));
        System.out.println("esiste il libro 'Hola' >>> " + biblioteca.cercaLibroTitolo("Hola"));
        System.out.println(biblioteca);
        biblioteca.eliminaLibroISBN("123456782");
        System.out.println(biblioteca);
        biblioteca.ordinaLibri();
        System.out.println(biblioteca);
    }
}
