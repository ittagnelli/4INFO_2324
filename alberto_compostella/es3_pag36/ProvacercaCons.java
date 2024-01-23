package es3_pag36;

import java.util.Scanner;

public class ProvacercaCons {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("inserisci la parola:");
    String s1 = in.next();
    System.out.println("la parola contiene almeno tre consonanti consegutive? :"+ cercaCons.cerca(s1));
    

  }  
}
    

