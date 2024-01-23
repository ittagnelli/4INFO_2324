class Compositore extends Musicista {
    private String composizione;

    public Compositore(String nome, String compo) {
        super(nome);
        compo = composizione;
    }

    public void compone() {
        System.out.println("compositore:" + getNome() + " compone:" + composizione);
    }
}
