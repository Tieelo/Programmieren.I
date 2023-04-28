package P02_Kontrollstrukturen.Übung;

public class Abschreibungssatz {
    public static void main (String [] args){
        double buchwert, abschreibungssatz, restwert;
        buchwert = 15000.0;
        abschreibungssatz = 0.40;
        restwert = buchwert;
        System.out.println("Buchwert im ersten Jahr: " + buchwert + " Euro");
        System.out.println("For Schleife:");
        for (int i = 1; restwert > 100; i++) {
            restwert = (1 - abschreibungssatz ) * restwert;
            System.out.printf(" Restwert Jahr " + i + ": %.2f"  + " Euro \n", restwert);
        }
        restwert = buchwert; 
        int i = 0;
        System.out.println("While Schleife:");
        while (restwert > 100) {
            i++;
            restwert = (1 - abschreibungssatz ) * restwert;
            System.out.printf(" Restwert Jahr " + i + ": %.2f"  + " Euro \n", restwert);
        }
        if (restwert < 100) {
            System.out.println("Dein Auto ist nichts mehr wert");
        }
    }
}