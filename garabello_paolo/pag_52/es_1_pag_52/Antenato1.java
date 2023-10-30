public class Antenato1 {
    protected String colorePelliccia;
 
    public Antenato1() {
       this.colorePelliccia = "nero";
    }
 
    public Antenato1(String var1) {
       this.colorePelliccia = var1;
    }
 
    public void pascola() {
       System.out.println("pascola");
    }
 
    public void rumina() {
       System.out.println("rumina");
    }
 
    public String getPelliccia() {
       return this.colorePelliccia;
    }
 }