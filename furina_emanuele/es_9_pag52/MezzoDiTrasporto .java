class MezzoDiTrasporto {
    protected String nome;
    protected int annoDiCostruzione;

    public MezzoDiTrasporto(String nome, int annoDiCostruzione) {
        this.nome = nome;
        this.annoDiCostruzione = annoDiCostruzione;
    }

    public void muovi() {
        System.out.println("Il mezzo si sta muovendo.");
    }
}
