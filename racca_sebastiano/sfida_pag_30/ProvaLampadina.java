public class ProvaLampadina {
    public static void main(String[] args) {
        Lampadina lamp = new Lampadina();

        // Provo a cambiare l'interruttore finchè non si rompe, se supera 9999 tentativi è indistruttibile :)
        for(int i = 0; i < 9999; i++) {
            System.out.println("Schiacciando l'interruttore...");
            
            if(!lamp.click()) {
                System.out.println("La lampadina si è rotta");
                break;
            }

            System.out.println("Stato lampadina: " + lamp);
        }
    }
}