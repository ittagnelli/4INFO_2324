import java.util.Scanner;

public class ProvaRettangolo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Rettangolo r1 = new Rettangolo();
        Rettangolo r2 = new Rettangolo();

        System.out.println("inserisci la base del primo rettangolo");
        r1.setBase(in.nextInt());
        System.out.println("inserisci l'altezza del primo rettangolo");
        r1.setAltezza(in.nextInt()); 
        System.out.println("inserisci la base del secondo rettangolo");
        r2.setBase(in.nextInt());
        System.out.println("inserisci l'altezza del secondo rettangolo");
        r2.setAltezza(in.nextInt());
        System.out.println("base r1 = " + r1.getBase() + " altezza r1 = " + r1.getAltezza() + "\n");
        System.out.println("perimetro r1 = " + r1.getPerimetro() + " area r1 = " + r1.getArea() + "\n");
        System.out.println("base r2 = " + r2.getBase() + " altezza r2 = " + r2.getAltezza() + "\n");
        System.out.println("perimetro r2 = " + r2.getPerimetro() + " area r2 = " + r2.getArea() + "\n");
    }
}
