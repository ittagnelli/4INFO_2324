public class AnimaleProva {
    public static void main(String[] args) {
        Animale animale = new Animale();

        animale.setNome("animale");
        animale.setPeso(100);
        System.out.println(animale);

        Terrestre terrestre = new Terrestre();
        terrestre.setNome("terrestre");
        terrestre.setPeso(100);
        terrestre.setNumeroZampe(4);
        System.out.println(terrestre);

        Cavallo cavallo = new Cavallo();
        cavallo.setPeso(100);
        cavallo.setNumeroZampe(4);
        cavallo.setNome("cavallo");
        cavallo.setColore("blu");

        System.out.println(cavallo);
    }
}
