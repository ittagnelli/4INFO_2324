public class Elettrodomestico {
    protected int volt;

    public void setVolt(int volt_neter) {
        volt = volt_neter;
    }
    public String toString() {
        return "\nVolt: " + volt + "V";
    }
}