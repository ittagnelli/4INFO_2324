import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Paziente paziente = new Paziente(234567, new Medico("Giuseppe"));
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il codice per accedere >>>");
        int codice = in.nextInt();
        System.out.println("Nome medico curante >>>   " + paziente.getMedico(codice));
        in.close();
    }
}
