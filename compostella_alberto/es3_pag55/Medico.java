public class Medico {
    private String nomitativo;
    public Medico(String nominativo){
        this.nomitativo = nominativo;
    }
    
    public String getNomitativo() {
        return nomitativo;
    }
 @Override
 public String toString() {
    return "medico{nome: "+nomitativo+"}";
     }
}
