public class Biblioteca {
    private Libro[] array_libro;

    public Biblioteca(Libro[] array_libro) {
        this.array_libro = array_libro;
    }

    public Libro[] cercaLibroAutore(String nome_autore) {
        Libro[] array_libroautore = new Libro[array_libro.length];
        for(int i = 0; i < array_libro.length; i++) {
            if(array_libro[i].getNomeAutore() == nome_autore) 
                array_libroautore[i] = array_libro[i];
            else array_libroautore[i] = new Libro("null", "null", 0, "null");
        }

        return array_libroautore;
    }

    public boolean cercaLibroTitolo(String nome_libro) {
        for(int i = 0; i < array_libro.length; i++) if(array_libro[i].getNomeLibro() == nome_libro) return true;
        return false;
    }

    public void eliminaLibroISBN(String isbn) {
        for(int i = 0; i < array_libro.length; i++) {
            if(array_libro[i].getIsbn() == isbn) 
                array_libro[i].setNumPagine(0);
        }
    }

    public void ordinaLibri() {
        for (int i = 0; i < array_libro.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array_libro.length; j++) {
                if (array_libro[j].getNumPagine() < array_libro[minIndex].getNumPagine()) {
                    minIndex = j;
                }
            }
           
            Libro temp = array_libro[i];
            array_libro[i] = array_libro[minIndex];
            array_libro[minIndex] = temp;
        }
    }

    public void stampa(Libro[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].getNumPagine() != 0) System.out.println(array[i].getNomeLibro());
        }
    }

    public String toString() {
        String msg = "";
        for(int i = 0; i < array_libro.length; i++) {
            if(array_libro[i].getNumPagine() != 0)  msg += "\n" + array_libro[i].getNomeLibro();
        }  
        return msg;
    }


}
