import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> oneC, twoC, threeC;
        oneC = new ArrayList<Integer>();
        twoC = new ArrayList<Integer>();   
        threeC = new ArrayList<Integer>();
        
        int num;
        do {
            num = rand.nextInt(999);
            if(num != 0){
                if(num < 10)
                    oneC.add(num);
                else if(num < 100)
                    twoC.add(num);
                else
                    threeC.add(num);
            }
        }while(num != 0);

        System.out.println("numeri con una cifra " + oneC);
        System.out.println("numeri con due cifra " + twoC);
        System.out.println("numeri con tre cifra " + threeC);
    }
}