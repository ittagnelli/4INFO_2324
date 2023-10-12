import java.util.Scanner;

public class provaLampadina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;

        lampadina lamp = new lampadina();


        for(int i = 0; i < 4; i++) {
            System.out.print("\nInserisci 1 per cliccare, 0 per uscire: ");
            n = in.nextInt();
            if(n == 1) {
                lamp.click();
                System.out.print("" + lamp.toString());
                if(i == 3) {
                    System.out.print("\nLa lampadina si è rotta\n");
                }
            } else {
                i = 3;
            }
        }
    }
}
