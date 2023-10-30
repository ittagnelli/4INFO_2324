public class StrumentoProva {
    public static void main(String[] args) {
        Strumento strumento = new Strumento();
        strumento.setCosto(4000);
        System.out.println(strumento);

        Pianoforte piano = new Pianoforte();
        piano.setCosto(4000);
        piano.setEta(100);
        System.out.println(piano);
        

        Colore colore = new Colore();
        colore.setCosto(4000);
        colore.setEta(100);
        colore.setColore("arancione");
        System.out.println(colore);
    }
}
