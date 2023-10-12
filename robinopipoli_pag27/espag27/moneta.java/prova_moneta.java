import java.util.Random
public class prova_moneta{
    public static void main()throws Expection{
        Scanner in = new Scanner(System.in);
        int scelta_giocatore;
        int lancia_testa;
        System.out.println("Testa o Croce - 5 lanci");
        System.out.print("Scegli Testa (0) o Croce (1) : ");
        scelta_giocatore = in.NextInt();
        moneta mia_moneta = new moneta();
        for(int x = 0; x < 5; x++){
            mia_moneta.lancia();
            System.out.println(mia_moneta.toString());
            if(mia_moneta.isTesta()){
                lanci_testa++;
            }

            if((scelta_giocatore == 0) && (lanci_testa > 2)){
                System.out.println(" --> Vittora!!");
            }
            else
            System.out.println(" --> Vittoria per Albert");
        }
    }
}
