public class Mucca extends Antenato2 {
    private int lunghezzaCorna;
 
    public Mucca() {
       this.colorePelliccia = "bianco-nero";
       this.lunghezzaCorna = 10;
    }
 
    public Mucca(String var1, int var2) {
       this.colorePelliccia = var1;
       this.lunghezzaCorna = 10;
    }
 
    public int getCorna() {
       return this.lunghezzaCorna;
    }
 }