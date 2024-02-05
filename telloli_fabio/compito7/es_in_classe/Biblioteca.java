package es_in_classe;
public class Biblioteca {
    private Libro[] array_biblioteca;

    public Biblioteca(Libro[] array_biblioteca) {
        this.array_biblioteca = array_biblioteca;
    }

    public void cercaAutore(String autore) {
        for (int i = 0; i < array_biblioteca.length; i++) {
            if(autore == array_biblioteca[i].getAutore()){
                System.out.println("\nautore: " + array_biblioteca[i].getAutore() + " nome: " + array_biblioteca[i].getNome());
            }
        }
    }

    public void cercaNome(String nome) {
        for (int i = 0; i < array_biblioteca.length; i++) {
            if (nome == array_biblioteca[i].getNome()) {
                System.out.println("\nautore: " + array_biblioteca[i].getAutore() + " nome: " + array_biblioteca[i].getNome());
            }
        }
    }


    public void bubbleSort() {
        int n = array_biblioteca.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                
                if (array_biblioteca[j].getNpag() > array_biblioteca[j + 1].getNpag()) {
                    Libro temp = array_biblioteca[j];
                    array_biblioteca[j] = array_biblioteca[j + 1];
                    array_biblioteca[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public Libro[] getTutti() {
        return array_biblioteca;
    }

    public void eliminaLibro(Libro eliminaLibro) {
        for (int i = 0; i < array_biblioteca.length; i++) {
            if (array_biblioteca[i].getIsbn() == eliminaLibro.getIsbn()) {
                array_biblioteca[i] = null;
            }
        }
    }
    
}
