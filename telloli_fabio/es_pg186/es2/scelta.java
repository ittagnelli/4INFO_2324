import java.util.Scanner;

public class scelta {
    int scel;
    Scanner scanner;

    scelta() {
        this.scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("#########################################");
        System.out.println("#     1. agg. elemento in fondo         #");
        System.out.println("#     2. vedi elemento corrente         #");
        System.out.println("#     3. andare avanti di 1             #");
        System.out.println("#     4. andare indietro di 1           #");
        System.out.println("#     5. eliminare elemento corrente    #");
        System.out.println("#     6. stampa                         #");
        System.out.println("#     0. esci                           #");
        System.out.println("#########################################");
        
        scel = scanner.nextInt();
        return scel;
    }
}
