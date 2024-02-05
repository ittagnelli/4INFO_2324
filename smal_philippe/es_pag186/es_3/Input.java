import java.util.Scanner;

public class Input {
    private Scanner in;
    private final int TERMINATORE = 0;
    private Lista miaLista;

    Input (Lista ls) {
        in = new Scanner(System.in);
        miaLista = ls;
    }

    public void riempiLista() {
        int numero;
        do {
            System.out.print("\nInserisci numero>>> ");
            numero = in.nextInt();
            if(numero != TERMINATORE) {
                miaLista.addCoda(numero);
                System.out.println(miaLista);
            }
        } while(numero != TERMINATORE);
    } 

    public void eliminaMultipli(int numero) {
        miaLista.removeMultpliNumero(numero);
        System.out.println(miaLista);
    }
}
