public class Persona {
    private String nome;
    private String cognome;
    
    public Persona(String co){
        cognome = co;
    }

    public Persona(String no, String co){
        cognome = co;
        nome = no;
    }

    public void setNome(String no){
        nome = no;
    }
    
    public void setCognome(String co){
        cognome = co;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    @Override
    public String toString(){
        return "nome: "+ nome + "\ncognome: " + cognome;
    }
}
