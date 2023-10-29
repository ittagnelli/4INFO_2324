public class ProvaMucca {
    public static void main(String[] args) {
       Antenato1 var1 = new Antenato1("nero-marrone");
       var1.pascola();
       var1.rumina();
       System.out.println(var1.getPelliccia());
       Antenato2 var2 = new Antenato2("bianco");
       var2.pascola();
       var2.rumina();
       System.out.println(var2.getPelliccia());
       var2.muggisci();
       Mucca var3 = new Mucca("nero-bianco", 20);
       var3.pascola();
       var3.rumina();
       System.out.println(var3.getPelliccia());
       var3.muggisci();
    }
}

