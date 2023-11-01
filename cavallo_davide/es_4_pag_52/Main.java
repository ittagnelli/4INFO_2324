public class Main {
    public static void main(String[] args) {
        Cellulare cellulare = new Cellulare("Samsung", "Galaxy S20");

        cellulare.accendi(); 
        cellulare.spegni();  
        cellulare.chiama("123456789"); 
        cellulare.inviaMessaggio("Alice", "Ciao"); 
    }
}
