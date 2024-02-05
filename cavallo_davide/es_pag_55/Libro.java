public class Libro{
    private String nome_autore;
    private String nome_libro;
    private int num_pagine;
    private String isbn;

    public Libro(String nome_autore, String nome_libro, 
                        int num_pagine, String isbn) {
        this.nome_autore = nome_autore;
        this.nome_libro = nome_libro;
        this.num_pagine = num_pagine;
        this.isbn = isbn;
    }

    public String getNomeAutore() {
        return nome_autore;
    }

    public String getNomeLibro() {
        return nome_libro;
    }

    public int getNumPagine() {
        return num_pagine;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setNomeAutore(String nome_autore) {
        this.nome_autore = nome_autore;
    }

    public void setNomeLibro(String nome_libro) {
        this.nome_libro = nome_libro;
    }

    public void setNumPagine(int num_pagine) {
        this.num_pagine = num_pagine;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
