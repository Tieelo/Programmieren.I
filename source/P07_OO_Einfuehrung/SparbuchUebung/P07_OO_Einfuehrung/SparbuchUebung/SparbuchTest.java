package P07_OO_Einfuehrung.SparbuchUebung.P07_OO_Einfuehrung.SparbuchUebung;

import java.util.Scanner;

public class SparbuchTest {
    public static void main(String[] args) {
        Sparbuch Sparbuch1 = new Sparbuch(1, 10.5, 0.5);
        Sparbuch Sparbuch2 = new Sparbuch(2, 253.76, 0.4);
        Sparbuch Sparbuch3 = new Sparbuch(3, 1285.76, 0.6);
        Sparbuch Sparbuch4 = new Sparbuch(4, 345.48, 0.7);
        Sparbuch Sparbuch5 = new Sparbuch(5, 0.0, 0.8);

        Sparbuch[] Bücher = new Sparbuch[]{Sparbuch1, Sparbuch2, Sparbuch3, Sparbuch4, Sparbuch5};
        Scanner in = new Scanner(System.in);
        int Auswahl;
        Boolean Abbruch = false;
        double Einzahlung;
        double Auszahlung;
        int Kontonummer;
        int Jahre;

        System.out.println("Hallo! Wie darf ich sie heute bedienen?");
        System.out.println("Bitte Kontonummer eingeben:");
        Kontonummer = in.nextInt();

        for (int i = 0; i < Bücher.length; i++) {
            if (Bücher[i].Kontonummer == Kontonummer) {
                while (Abbruch == false) {
                    System.out.printf("Bitte wählen sie aus folgenden Optionen: \n1 Einzahlung \n2 Abhebung \n" +
                            "3 Zinsberechnung \n4 Verzinsung \n5 Kontonummer \n6 Kontostand \n7 Zinssatz \n8 Abbruch \n");
                    Auswahl = in.nextInt();
                    if (Auswahl == 1) {
                        System.out.println("Wie viel möchten Sie einzahlen?: ");
                        Bücher[i].zahleEin(in.nextDouble());
                    } else if (Auswahl == 2) {
                        System.out.println("Wie viel möchten sie abheben?: ");
                        Bücher[i].hebeAb(in.nextDouble());
                    } else if (Auswahl == 3) {
                        System.out.println("Wie lange ist die Laufzeit in Jahren?");
                        Jahre = in.nextInt();
                        System.out.printf("Nach %d Jahren beträgt das Endkapital %.2f \n", Jahre, Bücher[i].getErtrag(Jahre));
                    } else if (Auswahl == 4) {
                        Bücher[i].verzinse();
                    } else if (Auswahl == 5) {
                        System.out.println("Ihre Kontonummer ist " + Bücher[i].getKontonummer());
                    } else if (Auswahl == 6) {
                        System.out.println("Ihr Kontostand beträgt " + Bücher[i].getKapital() + "€");
                    } else if (Auswahl == 7) {
                        System.out.println("Ihr Zinssatz beträgt " + Bücher[i].getZinssatz() + "%");
                    } else if (Auswahl == 8) {
                        Abbruch = true;
                    } else {
                        System.out.println("Ungültige Auswahl");
                    }
                }
            }
        }

    }
}
