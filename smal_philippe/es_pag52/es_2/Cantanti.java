public class Cantanti extends Compositori{
    private String canzone;

    public void setCanzone(String canzone_enter) {
        canzone = canzone_enter;
    }

    public String getCanzone() {
        return canzone;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCanzone: " + canzone;
    }
}
