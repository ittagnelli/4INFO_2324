public class DIstributoreMerenda {
    private String tipo;

    DIstributoreMerenda(String cosa){
        tipo = cosa;
    }

    public void merendapresa(Panino<?> merenda){
        System.out.println("Ho preso un " + tipo + " " + merenda.getContenuto());
    }

    public void merendapresa(Focaccia<?> merenda){
        System.out.println("Ho preso una " + tipo + " " + merenda.getContenuto());
    }

    public void merendapresa(Acqua<?> merenda){
        System.out.println("Ho preso dell' " + tipo + " " + merenda.getContenuto());
    }

    public void merendapresa(Succo<?> merenda){
        System.out.println("Ho preso del " + tipo + " " + merenda.getContenuto());
    }
}
