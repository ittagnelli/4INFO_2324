public class Rettangolo {
    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza) {
        setLunghezza(lunghezza);
        setLarghezza(larghezza);
    }

    public double calcolaArea() {
        return lunghezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (lunghezza + larghezza);
    }

    public void setLunghezza(double nuovaLunghezza) {
        if (nuovaLunghezza > 0) {
            lunghezza = nuovaLunghezza;
        } else {
            System.out.println("La lunghezza deve essere un valore positivo.");
        }
    }

    public void setLarghezza(double nuovaLarghezza) {
        if (nuovaLarghezza > 0) {
            larghezza = nuovaLarghezza;
        } else {
            System.out.println("La larghezza deve essere un valore positivo.");
        }
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la lunghezza del primo rettangolo: ");
        double lunghezza1 = input.nextDouble();

        System.out.print("Inserisci la larghezza del primo rettangolo: ");
        double larghezza1 = input.nextDouble();

        System.out.print("Inserisci la lunghezza del secondo rettangolo: ");
        double lunghezza2 = input.nextDouble();

        System.out.print("Inserisci la larghezza del secondo rettangolo: ");
        double larghezza2 = input.nextDouble();

        Rettangolo rettangolo1 = new Rettangolo(lunghezza1, larghezza1);
        Rettangolo rettangolo2 = new Rettangolo(lunghezza2, larghezza2);

        System.out.println("\nRettangolo 1:");
        System.out.println("Area: " + rettangolo1.calcolaArea());
        System.out.println("Perimetro: " + rettangolo1.calcolaPerimetro());

        System.out.println("\nRettangolo 2:");
        System.out.println("Area: " + rettangolo2.calcolaArea());
        System.out.println("Perimetro: " + rettangolo2.calcolaPerimetro());

        input.close();
    }
}
