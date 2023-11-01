public class Medico {
    private String nominativo;

    Medico(){}
    Medico(String nominativo){
        this.nominativo = nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getNominativo() {
        return nominativo;
    }

    @Override
    public String toString() {
        return "nominativo: " + nominativo;
    }
}
