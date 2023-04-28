package P01_EinfuehrungUndVariablen.Übungen;

import java.util.Scanner;

public class rechnen {
    public static void main(String[] args) throws Exception {
        double a = 5.0;
        double b = 7.0;
        System.out.println ("Fünf plus Sieben ergibt " + (a + b));
        System.out.println ("Fünf mal Sieben ergibt " + (a * b));
        System.out.println ("Fünf durch Sieben ergibt " + (a / b));
        System.out.println("Geben Sie 2 Zahlen zur Addition ein: ");
        Scanner in = new Scanner(System.in);
        double i = in.nextDouble();
        double j = in.nextDouble();
        System.out.println ("Das Ergebnis ist " + (i+j));
    }
}