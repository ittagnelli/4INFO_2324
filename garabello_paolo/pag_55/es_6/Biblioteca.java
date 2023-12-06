import java.util.Arrays;

public class Biblioteca {
    private Libro[] libreria;

    Biblioteca(Libro[] libreria){
        this.libreria = libreria;
    }

    Biblioteca(){
        libreria = new Libro[0];
    }

    public Boolean esiste(Libro libro){
        for(Libro i : libreria){
            if(i.getISBN() == libro.getISBN())
                return true;
        }
        return false;
    }

    public void addLibro(Libro libro){
        if(!this.esiste(libro)){
            Libro[] temp = new Libro[libreria.length + 1];
            System.arraycopy(libreria, 0, temp, 0, libreria.length);
            temp[libreria.length] = libro;
            libreria = new Libro[temp.length];
            System.arraycopy(temp, 0, libreria, 0, temp.length);
        }
    }

    public Biblioteca getByAuthor(String author){
        Biblioteca libriAutore = new Biblioteca();
        for(Libro i : libreria){
            if(i.getAutore() == author)
                libriAutore.addLibro(i);
        }   

        return libriAutore;
    }

    public void ordina(){
        for(int i = 0; i < libreria.length; i++) {
            boolean flag = false;
            for(int j = 0; j < libreria.length-1; j++) {
                if(libreria[j].getNumPagine()>libreria[j+1].getNumPagine()) {
                    Libro k = libreria[j];
                    libreria[j] = libreria[j+1];
                    libreria[j+1] = k;
                    flag=true; 
                }
            }
            if(!flag) break; 
        }
    }

    public int getLenght(){
        return libreria.length;
    }

    public void deleteLibro(Libro libro){
        Libro[] temp = new Libro[libreria.length - 1];
        int j = 0;
        for(Libro i : libreria){
            if(!(i.equals(libro)))
                temp[j++] = i;  
        }
        libreria = new Libro[temp.length];
        System.arraycopy(temp, 0, libreria, 0, temp.length);
    }

    public void cancellaISBN(int ISBN){
        for(Libro i : libreria){
            if(i.getISBN() == ISBN){
                deleteLibro(i);
                break;
            }
        }
    }

    @Override
    public String toString(){
        String str = "";
        for(Libro i : libreria){
            str += i.getTitolo() + " By " + i.getAutore() + "\n";
        }
        return str;
    }
}
