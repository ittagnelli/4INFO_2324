public class Cantanti extends Compositori{
    private String canzone;

    public void setCanzone(String c) {
        canzone = c;
    }
    @Override
    public void stampa() {
        super.stampa();
        System.out.println("\n\nHa cantato: " + canzone);
    }
}
