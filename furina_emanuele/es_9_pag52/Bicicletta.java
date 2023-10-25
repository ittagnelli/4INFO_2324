class Bicicletta extends MezzoDiTrasporto {
    private int numeroDiIngranaggi;

    public Bicicletta(String nome, int annoDiCostruzione, int numeroDiIngranaggi) {
        super(nome, annoDiCostruzione);
        this.numeroDiIngranaggi = numeroDiIngranaggi;
    }

    public void pedala() {
        System.out.println("L'utente sta pedalando.");
    }

    public void suonaCampanello() {
        System.out.println("* non so cosa mettere *");
    }

    public int getNumeroDiIngranaggi() {
        return numeroDiIngranaggi;
    }
}