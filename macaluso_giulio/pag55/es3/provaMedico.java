public class provaMedico {
    public static void main(String[] args) {
        Paziente p = new Paziente(12321, 
        new Medico("Alberto"));
        p.stampa();
    }
}
