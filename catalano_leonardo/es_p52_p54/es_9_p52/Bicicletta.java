class Bicicletta extends MezzoTrasporto {
    private int ingranaggi;

   
    public Bicicletta(String marca, String modello, int annoProduzione, int numeroIngranaggi) {
        super(marca, modello, annoProduzione);
        this.ingranaggi = numeroIngranaggi;
    }

    
    public void pedalare() {
        System.out.println("sta pedalando");
    }

    
    @Override
    public void accelerare() {
        System.out.println("accelara la bici");
    }

    
}
