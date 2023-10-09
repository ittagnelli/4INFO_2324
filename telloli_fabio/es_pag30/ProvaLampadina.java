public class ProvaLampadina {


    public static void main(String args[]) {
        Lampadina lamp = new Lampadina();

        for(int i = 0; i < 10; i++) {

            if(lamp.click() != true) {
                System.out.println("lo stato della lampadina e': " + lamp.toString());
                break;
            } 

            System.out.println("lo stato della lampadina e': " + lamp.toString());
        }
    }
}
