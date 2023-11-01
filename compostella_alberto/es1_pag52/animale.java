import java.util.Scanner;

public class animale{
    private boolean zampe;
    private int Nzampe;
    private int eta;
    public animale(){
        zampe = false;
        Nzampe = 0;
        eta = 0;
    }

    public void Setzampe(boolean zampe){
        this.zampe = zampe;
        if(zampe == true){
            System.out.println("inserisci il numero di zampe");
            Scanner in= new Scanner(System.in);
            Nzampe = in.nextInt();

        }
    }

    public boolean getzampe(){
        return zampe;
    }

    public int getNzampe(){
        return Nzampe;
    }
    
    
        
}
