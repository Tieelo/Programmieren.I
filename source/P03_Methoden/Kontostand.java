package P03_Methoden;

import java.util.Scanner;

public class Kontostand {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Wie hoch ist das Startkapital? ");
        double Kapital = in.nextDouble();
        System.out.print("Wie viele Jahren legen sie an? ");
        int Jahre = in.nextInt();
        System.out.printf("Das Endkapital beträgt: %.2f € bei 0,5%% Zinsen aus dem Kapital ", Zinsen(Kapital, Jahre));
        System.out.println("Das Endkapital" + Zinsen(Kapital, Jahre));
        Jahre(Kapital, Jahre);
    }
    public static double Zinsen (double Kapital, int Jahre){
        double Zsatz = 0.5;
        double Zfaktor = 1 + (Zsatz/100);
        double Endkapital = Kapital * Math.pow(Zfaktor, Jahre);
        return Endkapital;
    }
    public  static void Jahre (double Kapital, int Jahre){
        for (int i = 1; i <= Jahre; i++){
            System.out.printf(" Jahr %d: %.2f€ \n", i, Zinsen(Kapital, i));
        }
    }
}
